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

        // EXERCICIOS
        /*
         * 
         * 1 - Escreva um código onde o usuário entra com um número e seja gerada a
         * tabuada de 1 até 10 desse número;
         * 
         * 2 - Escreva um código onde o usuário entra com sua altura e peso, seja feito
         * o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem
         * de acordo com o resultado:
         * 
         * Se for menor ou igual a 18,5 "Abaixo do peso";
         * se for entre 18,6 e 24,9 "Peso ideal";
         * Se for entre 25,0 e 29,9 "Levemente acima do peso";
         * Se for entre 30,0 e 34,9 "Obesidade Grau I";
         * Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
         * Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
         * 
         * 3 - Escreva um código que o usuário entre com um primeiro número, um segundo
         * número maior que o primeiro e escolhe entre a opção par e impar, com isso o
         * código deve informar todos os números pares ou ímpares (de acordo com a
         * seleção inicial) no intervalo de números informados, incluindo os números
         * informados e em ordem decrescente;
         * 
         * 4 - Escreva um código onde o usuário informa um número inicial,
         * posteriormente irá informar outros N números, a execução do código irá
         * continuar até que o número informado dividido pelo primeiro número tenha
         * resto diferente de 0 na divisão, números menores que o primeiro número devem
         * ser ignorados
         * 
         */

        // 1
        System.out.println("Informe um numero:");
        var number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // 2
        System.out.println("Informe sua altura:");
        var height = scanner.nextDouble();
        System.out.println("Informe seu peso:");
        var weight = scanner.nextDouble();
        var imc = weight / (height * height);
        System.out.println("Seu IMC e: " + imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        // 3
        System.out.println("Informe o primeiro número:");
        var number1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var number2 = scanner.nextInt();
        while (number2 < number1) {
            System.out.println("O segundo número deve ser maior que o primeiro, tente novamente:");
            number2 = scanner.nextInt();
        }
        System.out.println("Informe a opção (1 para par, 2 para impar): ");
        var option2 = scanner.nextInt();
        if (option2 == 1) {
            for (int i = number2; i >= number1; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = number2; i >= number1; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        // 4
        System.out.println("Informe um número inicial:");
        var number3 = scanner.nextInt();
        System.out.println("Informe outro número:");
        var number4 = scanner.nextInt();
        while (number3 % number4 == 0) {
            System.out.println("O resto deve ser diferente de 0");
            number4 = scanner.nextInt();
        }
    }
}
