package fundamentos.modulo3;

public class Main {
    public static void main(String[] args) {
        var male = new Person("João", 12);
        var female = new Person("Maria", 23);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());

        // AULA 2 - Trabalhando com records
        var recordPerson = new PersonRecord("Pedro", 23);
        System.out.println(recordPerson.getInfo());

        var recordPerson2 = new PersonRecord("Maria");
        System.out.println(recordPerson2.getInfo());
    }
}
