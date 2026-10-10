package p_o_objetos.modulo2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Manager();
        Manager manager = new Manager();

        manager.setName("João");
        manager.setLogin("joao");
        manager.setPassword("123456");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

    }
}
