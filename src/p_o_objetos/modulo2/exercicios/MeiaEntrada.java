package p_o_objetos.modulo2.exercicios;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(float valor, String filme, boolean tipo) {
        super(valor, filme, tipo);
    }

    // getters e setters
    @Override
    public float getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(float valor) {
        super.setValor(valor / 2);
    }

}
