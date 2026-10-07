package fundamentos.modulo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        //Aula 1 - Estrutura condicional if/else
        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe a sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next();

        var canDrive = age >= 18 || (age >= 16 && isEmancipated.equalsIgnoreCase("s"));
        var message = canDrive ? 
            name + ", você pode dirigir\n" : 
            name + ", você não pode dirigir\n";

        System.out.println(message);
    }
}
