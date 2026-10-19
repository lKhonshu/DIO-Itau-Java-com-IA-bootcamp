package p_o_objetos.modulo2.exercicios;

public class IngressoFamilia extends Ingresso {

    private int pessoas;

    public IngressoFamilia(int pessoas, float valor, String filme, boolean tipo) {
        super(valor, filme, tipo);
        this.pessoas = pessoas;
    }

    // getters e setters
    @Override
    public float getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(float valor) {
        if (pessoas >= 3) {
            super.setValor((valor * pessoas) - ((valor * pessoas) * 0.05f));
        } else {
            super.setValor(valor * pessoas);
        }
    }

}
