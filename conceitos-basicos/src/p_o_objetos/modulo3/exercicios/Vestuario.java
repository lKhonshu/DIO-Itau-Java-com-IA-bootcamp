package p_o_objetos.modulo3.exercicios;

public record Vestuario(double price) implements Taxable {
    @Override
    public double calculateTax() {
        return price * 0.025; // 2.5%
    }
}
