import java.util.Scanner;
import java.time.OffsetDateTime;

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
        
        // Exercicios
        /*

        1-Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

        2-Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
            fórmula: área=lado X lado

        3-Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
            fórmula: área=base X altura

        4-Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
       */
        //1
        System.out.println("Informe o seu nome:");
        var baseYear = OffsetDateTime.now().getYear();
        var name2 = scanner.next();
        System.out.println("Informe o seu ano de nascimento:");
        var birthYear = scanner.nextInt();
        var age2 = baseYear - birthYear;
        System.out.printf("Ola %s voce tem %s anos\n", name2, age2);

        //2
        System.out.println("Informe o lado do quadrado");
        var side = scanner.nextFloat();
        var area = side * side;
        System.out.printf("A area do quadrado é %s\n", area);

        //3
        System.out.println("Informe a base do retangulo:");
        var base = scanner.nextFloat();
        System.out.println("Informe a altura do retangulo:");
        var height = scanner.nextFloat();
        var areaRectangle = base * height;
        System.out.printf("A area do retangulo é %s\n", areaRectangle);

        //4
        System.out.println("Informe o nome da primeira pessoa:");
        var name3 = scanner.next();
        System.out.println("Informe a idade da primeira pessoa:");
        var age3 = scanner.nextInt();
        System.out.println("Informe o nome da segunda pessoa:");
        var name4 = scanner.next();
        System.out.println("Informe a idade da segunda pessoa:");
        var age4 = scanner.nextInt();
        var ageDifference = age3 - age4;
        System.out.printf("%s tem %s anos e %s tem %s anos\n", name3, age3, name4, age4);
        System.out.printf("A diferenca de idade entre %s e %s é %s\n", name3, name4, ageDifference);
    }
}
