package p_o_objetos.modulo4.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import p_o_objetos.modulo4.domain.GenericDomain;

public abstract class GenericDAO<T extends GenericDomain<?>> {

    private final List<T> db = new ArrayList<>();

    public T save(T domain) {
        db.add(domain);
        return domain;
    }

    // public T update(T domain) {
    // var stored = db.stream().filter(d -> d.equals(domain))
    // .findFirst().orElseThrow();
    // db.remove(stored);
    // db.add(domain);
    // return domain;
    // }

    public boolean delete(T domain) {
        return db.remove(domain);
    }

    public Optional<T> find(Predicate<T> filterCallback) {
        return db.stream().filter(filterCallback).findFirst();
    }

    public List<T> findAll() {
        return db;
    }

    public int count() {
        return db.size();
    }
}
