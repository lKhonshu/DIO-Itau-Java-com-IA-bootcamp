package fundamentos.modulo3;

public class BankAccount {
    private double saldo;
    private double limiteChequeEspecial;
    private final double chequeEspecial;

    public BankAccount(double saldo) {
        this.saldo = saldo;
        this.chequeEspecial = saldo <= 500 ? 50 : saldo * 0.5;

    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = this.chequeEspecial + this.saldo;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void consultarChequeEspecial() {
        System.out.println("Cheque especial: " + this.chequeEspecial);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.limiteChequeEspecial) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public void pagarBoleto(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public void verificarChequeEspecial() {
        if (this.saldo < 0) {
            System.out.println("Conta está usando cheque especial");
            return;
        }
        System.out.println("Conta não está usando cheque especial");
    }

}
