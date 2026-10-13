package p_o_objetos.modulo4;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
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
    }
}
