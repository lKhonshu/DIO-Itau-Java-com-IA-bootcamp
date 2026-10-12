package p_o_objetos.modulo2.exercicios;

public class RelogioAmericano extends Relogio {

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    public void atualizarHora(Relogio relogio) {
        this.hora = relogio.getHora();
        this.minuto = relogio.getMinuto();
        this.segundo = relogio.getSegundo();
    }

    // relogios americanos nao existem de 13 ate 24, entao, quando for 13, deve
    // ser 1 pm, das 00 até 11 tem que ser am das 12 ate as 23:59 deve ser pm
    @Override
    public String toString() {
        if (hora > 12) {
            hora = hora - 12;
            return hora + ":" + minuto + ":" + segundo + " PM";
        } else if (hora < 12) {
            return hora + ":" + minuto + ":" + segundo + " AM";
        } else {
            return hora + ":" + minuto + ":" + segundo;
        }
    }
}
