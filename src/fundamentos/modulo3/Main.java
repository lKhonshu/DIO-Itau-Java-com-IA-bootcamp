package fundamentos.modulo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // AULA 1 - Criando a primeira Classe
        var male = new Person("João", 12);
        var female = new Person("Maria", 23);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());

        // AULA 2 - Trabalhando com records
        var recordPerson = new PersonRecord("Pedro", 23);
        System.out.println(recordPerson.getInfo());

        var recordPerson2 = new PersonRecord("Maria");
        System.out.println(recordPerson2.getInfo());

        // Exercicios
        /*
         * todos os execicios devem ter um menu de interativo para chamar as funções e
         * ter uma opção de sair para finalizar a execução
         * 
         * 1 - Escreva um código onde temos uma conta bancaria que possa realizar as
         * seguintes operações:
         * Consultar saldo
         * consultar cheque especial
         * Depositar dinheiro;
         * Sacar dinheiro;
         * Pagar um boleto.
         * Verificar se a conta está usando cheque especial.
         * 
         * Siga as seguintes regras para implementar
         * 
         * A conta bancária deve ter um limite de cheque especial somado ao saldo da
         * conta;
         * O o valor do cheque especial é definido no momento da criação da conta, de
         * acordo com o valor depositado na conta em sua criação;
         * Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque
         * especial deve ser de R$50,00
         * Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor
         * depositado;
         * Caso o limite de cheque especial seja usado, assim que possível a conta deve
         * cobrar uma taxa de 20% do valor usado do cheque especial.
         * 
         * 2 - Escreva um código onde controlamos as funções de um carro, ele deve ter
         * as
         * seguintes funções:
         * Ligar o carro;
         * Desligar o carro;
         * Acelerar;
         * diminuir velocidade;
         * virar para esquerda/direita
         * verificar velocidade;
         * trocar a marcha
         * 
         * Siga as seguintes regras na implementação
         * 
         * Quando o carro for criado ele deve começar desligado, em ponto morto e com
         * sua velocidade em 0
         * O carro desligado não pode realizar nenhuma função;
         * Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode
         * chegar no máximo a 120km);
         * Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua
         * velocidade (pode chegar no minimo a 0km);
         * o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no
         * carro;
         * A velocidade do carro deve respeitar os seguintes limites para cada
         * velocidade
         * se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
         * se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
         * se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
         * se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
         * se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
         * se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
         * se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
         * O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua
         * velocidade em 0 km
         * O carro só pode virar para esquerda/direita se sua velocidade for de no
         * mínimi 1km e no máximo 40km;
         * 
         * 3 - Escreva um código onde temos o controle de banho de um petshop, a maquina
         * de
         * banhos dos pets deve ter as seguintes operações:
         * Dar banho no pet;
         * Abastecer com água;
         * Abastecer com shampoo;
         * verificar nivel de água;
         * verificar nivel de shampoo;
         * verificar se tem pet no banho;
         * colocar pet na maquina;
         * retirar pet da máquina;
         * limpar maquina.
         * 
         * Siga as seguintes regras para implementação
         * 
         * A maquina de banho deve permitir somente 1 pet por vez;
         * Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
         * A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
         * Se o pet for retirado da maquina sem estar limpo será necessário limpar a
         * máquina para permitir a entrada de outro pet;
         * A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
         * O abastecimento de água e shampoo deve permitir 2 litros por vez que for
         * acionado;
         */
        var scanner = new Scanner(System.in);
        var option = 0;

        while (option != 4) {
            System.out.println("MENU");
            System.out.println("1 - Conta bancária");
            System.out.println("2 - Carro");
            System.out.println("3 - Petshop");
            System.out.println("4 - Sair");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    BankAccount bankAccount = new BankAccount(1000);
                    var optionBank = 0;
                    while (optionBank != 7) {
                        System.out.println("Conta bancária:");
                        System.out.println("1 - Consultar saldo");
                        System.out.println("2 - Consultar cheque especial");
                        System.out.println("3 - Depositar dinheiro");
                        System.out.println("4 - Sacar dinheiro");
                        System.out.println("5 - Pagar um boleto");
                        System.out.println("6 - Verificar se a conta está usando cheque especial");
                        System.out.println("7 - Sair");
                        optionBank = scanner.nextInt();
                        switch (optionBank) {
                            case 1:
                                System.out.println("Consultar saldo");
                                bankAccount.consultarSaldo();
                                break;
                            case 2:
                                System.out.println("Consultar cheque especial");
                                bankAccount.consultarChequeEspecial();
                                break;
                            case 3:
                                System.out.println("Depositar dinheiro");
                                System.out.println("Digite o valor a ser depositado");
                                bankAccount.depositar(scanner.nextDouble());
                                System.out.printf("Valor depositado, saldo atual: %s%n", bankAccount.consultarSaldo());
                                break;
                            case 4:
                                System.out.println("Sacar dinheiro");
                                System.out.println("Digite o valor a ser sacado");
                                bankAccount.sacar(scanner.nextDouble());
                                System.out.printf("Valor sacado, saldo atual: %s%n", bankAccount.consultarSaldo());
                                break;
                            case 5:
                                System.out.println("Pagar um boleto");
                                System.out.println("Digite o valor do boleto");
                                double valorBoleto = scanner.nextDouble();
                                bankAccount.pagarBoleto(valorBoleto);
                                System.out.printf("Valor do boleto pago, saldo atual: %s%n",
                                        bankAccount.consultarSaldo());
                                break;
                            case 6:
                                System.out.println("Verificar se a conta está usando cheque especial");
                                bankAccount.verificarChequeEspecial();
                                break;
                            case 7:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Carro");
                    Car car = new Car();
                    var optionCar = 0;
                    while (optionCar != 10) {
                        System.out.println("1 - Ligar o carro");
                        System.out.println("2 - Desligar o carro");
                        System.out.println("3 - Acelerar");
                        System.out.println("4 - Diminuir velocidade");
                        System.out.println("5 - Virar para esquerda");
                        System.out.println("6 - Virar para direita");
                        System.out.println("7 - Verificar velocidade");
                        System.out.println("8 - Aumentar marcha");
                        System.out.println("9 - Diminuir marcha");
                        System.out.println("10 - Sair");
                        optionCar = scanner.nextInt();
                        switch (optionCar) {
                            case 1:
                                System.out.println("Ligar o carro");
                                car.ligarCarro();
                                break;
                            case 2:
                                System.out.println("Desligar o carro");
                                car.desligarCarro();
                                break;
                            case 3:
                                System.out.println("Acelerar");
                                car.acelerar();
                                break;
                            case 4:
                                System.out.println("Diminuir velocidade");
                                car.diminuirVelocidade();
                                break;
                            case 5:
                                System.out.println("Virar para esquerda");
                                car.virarEsquerda();
                                break;
                            case 6:
                                System.out.println("Virar para direita");
                                car.virarDireita();
                                break;
                            case 7:
                                System.out.println("Verificar velocidade");
                                car.verificarVelocidade();
                                break;
                            case 8:
                                System.out.println("Aumentar marcha");
                                car.trocarMarcha(true);
                                break;
                            case 9:
                                System.out.println("Diminuir marcha");
                                car.trocarMarcha(false);
                                break;
                            case 10:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 3:
                    PetShower petShower = new PetShower();
                    Pet pet = new Pet(false);
                    System.out.println("Petshop");
                    var optionPetshop = 0;
                    while (optionPetshop != 10) {
                        System.out.println("1 - Dar banho no pet");
                        System.out.println("2 - Abastecer com água");
                        System.out.println("3 - Abastecer com shampoo");
                        System.out.println("4 - Verificar nível de água");
                        System.out.println("5 - Verificar nível de shampoo");
                        System.out.println("6 - Verificar se tem pet no banho");
                        System.out.println("7 - Colocar pet na máquina");
                        System.out.println("8 - Retirar pet da máquina");
                        System.out.println("9 - Limpar máquina");
                        System.out.println("10 - Sair");
                        optionPetshop = scanner.nextInt();
                        switch (optionPetshop) {
                            case 1:
                                System.out.println("Dar banho no pet");
                                petShower.darBanho(pet);
                                break;
                            case 2:
                                System.out.println("Abastecer com água");
                                petShower.abastecerAgua();
                                break;
                            case 3:
                                System.out.println("Abastecer com shampoo");
                                petShower.abastecerShampoo();
                                break;
                            case 4:
                                System.out.println("Verificar nível de água");
                                petShower.verificarAgua();
                                break;
                            case 5:
                                System.out.println("Verificar nível de shampoo");
                                petShower.verificarShampoo();
                                break;
                            case 6:
                                System.out.println("Verificar se tem pet no banho");
                                petShower.verificarPetNoBanho();
                                break;
                            case 7:
                                System.out.println("Colocar pet na máquina");
                                petShower.colocarPet();
                                break;
                            case 8:
                                System.out.println("Retirar pet da máquina");
                                petShower.retirarPet(pet);
                                break;
                            case 9:
                                System.out.println("Limpar máquina");
                                petShower.limparMaquina();
                                break;
                            case 10:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();

    }

}
