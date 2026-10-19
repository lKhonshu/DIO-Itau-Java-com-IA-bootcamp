package p_o_objetos.modulo3.exercicios;

public record Alimentacao(double price) implements Taxable {
    @Override
    public double calculateTax() {
        return price * 0.01; // 1%
    }
}
