import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Ola informe seu nome";

    public static void main(String[] args) {
        
        // Padroes de desenvolvimento e conceitos
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Digite sua idade");
        int age = scanner.nextInt();
        System.out.printf("Ola %s sua idade e %s \n", name, age);
    }
}
