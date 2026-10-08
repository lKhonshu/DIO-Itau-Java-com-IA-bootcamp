package fundamentos.modulo3;

public record PersonRecord(String name, int age) {
    public PersonRecord(String name) {
        this(name, 0);
    }

    public String getInfo() {
        return "Nome:" + name + "Idade: " + age;
    }
}
