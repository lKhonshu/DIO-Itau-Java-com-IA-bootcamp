package p_o_objetos.modulo2.exercicios;

public class Funcionario {

    protected String nome;
    protected String email;
    protected String senha;
    protected boolean isAdmin;

    public Funcionario(String nome, String email, String senha, boolean isAdmin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void realizarLogin() {
        System.out.println("Realizando login...");
    }

    public void realizarLogoff() {
        System.out.println("Realizando logoff...");
    }

    public void alterarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void alterarSenha(String senha) {
        this.senha = senha;
    }

}
