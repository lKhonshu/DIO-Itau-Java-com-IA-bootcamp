package p_o_objetos.modulo2.exercicios;

public class Gerente extends Funcionario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    // getters e setters
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatório financeiro...");
    }

    public void consultarVendas(Vendedor vendedor) {
        System.out.println("Consultando vendas do vendedor: " + vendedor.consultarVendas());
    }

}
