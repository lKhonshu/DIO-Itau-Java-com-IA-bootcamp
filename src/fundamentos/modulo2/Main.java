package fundamentos.modulo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        // AULA 1 - Estrutura condicional if/else
        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe a sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next();

        var canDrive = age >= 18 || (age >= 16 && isEmancipated.equalsIgnoreCase("s"));
        var message = canDrive ? name + ", você pode dirigir\n" : name + ", você não pode dirigir\n";

        System.out.println(message);

        // AULA 2 - Estrutura condicional switch case
        System.out.println("Informe um numero de 1 ate 7");
        var option = scanner.nextInt();
        var message2 = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sabado";
                yield String.format("Hoje e %s, fim de semana!!", day);
                // return sai do metodo todo
                // yield é usado para retornar o valor do switch
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terca-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Numero invalido";
        };
        System.out.println(message2);

        // AULA 3 - Estruturas de repetição for
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            // mandar args na execução
            // java -cp bin fundamentos.modulo2.Main Java Developer 2026
        }

        // AULA 4 - Estruturas de repetição while e do while
        var j = 0;
        while (args.length > j) {
            System.out.println(args[j]);
            j++;
        }

        System.out.println("=========================");
        j = 0;
        do {
            System.out.println(args[j]);
            j++;
        } while (args.length > j);

    }
}
