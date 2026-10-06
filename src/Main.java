import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Ola informe seu nome";

    public static void main(String[] args) {
        
        // AULA 1 - Padroes de desenvolvimento e conceitos
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Digite sua idade");
        int age = scanner.nextInt();
        System.out.printf("Ola %s sua idade e %s \n", name, age);

        // AULA 2 - Keywords e tipos primitivos
        int number = 1;
        long number2 = 10L;
        float number3 = 1.2f;
        double number4 = 1.4d;
        char character = 'm';
        boolean isTrue = true;

        // AULA 3 - Trabalhando com Operadores de Atribuição e Lógicos
        System.out.println("Quantos anos voce tem?");
        int driverAge = scanner.nextInt();
        System.out.println("Voce e emancipado? true | false");
        boolean isEmancipated = scanner.nextBoolean();
        var canDrive = driverAge >= 18 || (isEmancipated && driverAge >=16);
        System.out.printf("Pode dirigir? (%s)", canDrive);

    }
}
