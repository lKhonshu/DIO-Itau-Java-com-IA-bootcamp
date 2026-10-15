package p_o_objetos.modulo4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Stream;

import p_o_objetos.modulo4.DAO.GenericDAO;
import p_o_objetos.modulo4.DAO.UserDAO;
import p_o_objetos.modulo4.domain.UserDomain;

public class Main {

    private final static GenericDAO<UserDomain> dao = new UserDAO();

    public static void main(String[] args) {
        // AULA LISTAS
        var arrayStart = OffsetDateTime.now();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toMillis());

        var vectorStart = OffsetDateTime.now();
        List<Integer> vector = new Vector<>();
        for (int i = 0; i < 1000; i++) {
            vector.add(i);
        }
        System.out.println(Duration.between(vectorStart, OffsetDateTime.now()).toMillis());

        var linkedStart = OffsetDateTime.now();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        System.out.println(Duration.between(linkedStart, OffsetDateTime.now()).toMillis());

        Set<User> users = new HashSet<>();
        users.add(new User(1, "matheus"));
        users.add(new User(2, "maria"));
        users.add(new User(3, "joao"));

        System.out.println(users.contains(new User(1, "matheus")));

        Set<User> users2 = new TreeSet<>((User u1, User u2) -> {
            var compareResult = 0;
            if (u1.getId() > u2.getId())
                compareResult--;
            if (u1.getId() < u2.getId())
                compareResult++;
            return compareResult;
        });
        System.out.println(users2);

        // AULA MAP

        Map<String, User> users3 = new HashMap<>();
        users3.put("matheus", new User(1, "matheus"));
        users3.put("maria", new User(2, "maria"));
        users3.put("joao", new User(3, "joao"));

        users3.merge("matheus", new User(4, "simoes"), (u1, u2) -> {
            System.out.println(u1);
            System.out.println(u2);
            return u2;
        });

        users3.putIfAbsent("matheus", new User(5, "matheus-novo"));
        System.out.println(users3);

        // STREAM
        List<String> debugValues = new ArrayList<>();
        var value = Stream.of("matheus", "maria", "joao")
                .peek(debugValues::add)
                .filter(name -> name.endsWith("o"))
                .toList();

        System.out.println(debugValues);
        System.out.println(value);

        // GENERICS
        var user = new UserDomain("matheus", 21);
        System.out.println(dao.count());
        System.out.println(dao.save(user));
        System.out.println(dao.findAll());
        System.out.println(dao.delete(new UserDomain("", -1)));
        System.out.println(dao.delete(user));
        System.out.println(dao.findAll());
        System.out.println(dao.count());

        // DATE
        var milliseconds = System.currentTimeMillis();
        var date = new Date(milliseconds);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        System.out.println(date);
        System.out.println(formatter.format(date));
    }
}
