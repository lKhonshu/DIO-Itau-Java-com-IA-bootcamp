package p_o_objetos.modulo4.domain;

import java.util.Objects;

public class GenericDomain<T> {

    private T id;

    public GenericDomain(final T id) {
        this.id = id;
    }

    public GenericDomain() {

    }

    public T getId() {
        return id;
    }

    public void setId(final T id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (!(o instanceof GenericDomain that))
            return false;
        return Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
