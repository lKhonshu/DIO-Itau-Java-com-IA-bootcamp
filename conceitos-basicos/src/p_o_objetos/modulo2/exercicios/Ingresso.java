package p_o_objetos.modulo2.exercicios;

public class Ingresso {
    private float valor;
    private String filme;
    private boolean tipo;
    // true = legendado, false = dublado

    public Ingresso(float valor, String filme, boolean tipo) {
        this.valor = valor;
        this.filme = filme;
        this.tipo = tipo;
    }

    // getters e setters
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

}
