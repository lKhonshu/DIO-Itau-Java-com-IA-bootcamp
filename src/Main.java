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

        // AULA 4 - Trabalhando com Operadores Aritmeticos
        System.out.println("Informe o primeiro numero:");
        var value1 = scanner.nextFloat();
        System.out.println("Informe o segundo numero:");
        var value2 = scanner.nextFloat();
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);
        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);
        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);
        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);
        System.out.printf("%s %% %s = %s\n", value1, value2, value1 % value2);
        System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1));
        System.out.printf("Incrementando 1, fica %s\n", ++value1);
        System.out.printf("Decrementando 1, fica %s\n", --value1);

        // AULA 5 - Trabalhando com operadores bitwise
        var value3 = 6;
        var binary1 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro numero da operacao %s (representacao binaria %s)\n", value3, binary1);
        var value4 = 5;
        var binary2 = Integer.toBinaryString(value4);
        System.out.printf("Segundo numero da operacao %s (representacao binaria %s)\n", value4, binary2);

        var result = value3 | value4;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representacao binaria %s)\n", value3, value4, result, binaryResult);
        
    }
}
