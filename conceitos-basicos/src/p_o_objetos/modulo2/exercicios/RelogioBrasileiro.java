package p_o_objetos.modulo2.exercicios;

public class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    public void atualizarHora(Relogio relogio) {
        this.hora = relogio.getHora();
        this.minuto = relogio.getMinuto();
        this.segundo = relogio.getSegundo();
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
