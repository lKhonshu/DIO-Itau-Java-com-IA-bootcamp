package p_o_objetos.modulo3.exercicios;

public class MarketingMessage implements Sms, Email, Whatsapp {
    private String message;

    public MarketingMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendMarketingSms(String message) {
        System.out.println("Enviando SMS: " + message);
    }

    @Override
    public void sendMarketingEmail(String message) {
        System.out.println("Enviando Email: " + message);
    }

    @Override
    public void sendMarketingWhatsapp(String message) {
        System.out.println("Enviando Whatsapp: " + message);
    }
}
