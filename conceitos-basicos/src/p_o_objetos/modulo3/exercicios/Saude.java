package p_o_objetos.modulo3.exercicios;

public record Saude(double price) implements Taxable {
    @Override
    public double calculateTax() {
        return price * 0.015; // 1.5%
    }
}
