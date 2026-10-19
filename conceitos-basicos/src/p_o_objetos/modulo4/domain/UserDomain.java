package p_o_objetos.modulo4.domain;

import java.util.Objects;

public class UserDomain extends GenericDomain<Integer> {
    private String name;
    private int age;

    public UserDomain(final Integer id, final String name, final int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public UserDomain(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (!(o instanceof UserDomain that))
            return false;
        if (!super.equals(o))
            return false;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age);
    }
}
