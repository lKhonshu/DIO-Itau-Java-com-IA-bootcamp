package p_o_objetos.modulo3.exercicios;

public final class Imposto {
    private Imposto() {
    }

    public static Alimentacao alimentacao(double price) {
        return new Alimentacao(price);
    }

    public static Saude saude(double price) {
        return new Saude(price);
    }

    public static Vestuario vestuario(double price) {
        return new Vestuario(price);
    }
}
