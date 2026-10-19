package p_o_objetos.modulo2.exercicios;

public class Vendedor extends Funcionario {

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    // getters e setters
    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public void realizarVenda(double valor) {
        this.quantidadeVendas++;
        System.out.println("Realizando venda de " + valor);
    }

    public int consultarVendas() {
        return this.quantidadeVendas;
    }

}
