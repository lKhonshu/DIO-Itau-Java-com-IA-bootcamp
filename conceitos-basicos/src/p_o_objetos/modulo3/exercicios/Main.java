package p_o_objetos.modulo3.exercicios;

public class Main {
    public static void main(String[] args) {

        // Exercicios

        // 1 - Escreva um código para enviar mensagens de marketing, para isso você deve
        // ter a possibilidade de enviar a mesma mensagem para serviços diferentes,
        // esses serviços devem ter um método para receber a mensagem como parâmetro, os
        // serviços que devem estar disponíveis são:

        // SMS;
        // E-mail;
        // WhatsApp;

        MarketingMessage marketingMessage = new MarketingMessage("Promoção imperdível!");
        marketingMessage.sendMarketingSms("Promoção imperdível!");
        marketingMessage.sendMarketingEmail("Promoção imperdível!");
        marketingMessage.sendMarketingWhatsapp("Promoção imperdível!");

        // 2 - Escreva um código que calcule o valor de tributos de produtos, os
        // produtos disponíveis devem ser dos seguintes tipos: Alimentação, Saude e bem
        // estar, Vestuário e Cultura. Todos os produtos devem ter um método para
        // retornar o seu valor de imposto, de acordo com seu tipo:

        // Alimentação 1%;
        // Saude e bem estar 1.5%;
        // Vestuário 2.5%;
        // Cultura 4%.

        double preco = 100.0; // exemplo de preço
        System.out.println("Imposto Alimentação: " + Imposto.alimentacao(preco).calculateTax());
        System.out.println("Imposto Saúde: " + Imposto.saude(preco).calculateTax());
        System.out.println("Imposto Vestuário: " + Imposto.vestuario(preco).calculateTax());
    }
}
