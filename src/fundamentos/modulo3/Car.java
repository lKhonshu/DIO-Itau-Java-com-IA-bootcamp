package fundamentos.modulo3;

public class Car {
    // ele deve ter as
    // seguintes funções:
    // Ligar o carro;
    // Desligar o carro;
    // Acelerar;
    // diminuir velocidade;
    // virar para esquerda/direita
    // verificar velocidade;
    // trocar a marcha

    private int velocidade;
    private int marcha;
    private boolean ligado;
    private boolean direction;

    public Car() {
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
        this.direction = false;
    }

    public void ligarCarro() {
        this.ligado = true;
    }

    public void desligarCarro() {
        if (this.marcha == 0 && this.velocidade == 0)
            this.ligado = false;
    }

    public void acelerar() {
        if (this.ligado) {
            switch (this.marcha) {
                case 0:
                    System.out.println("Não pode acelerar em ponto morto");
                    break;
                case 1:
                    if (this.velocidade < 20) {
                        this.velocidade += 1;
                        System.out.println("Acelerando" + this.velocidade);
                    }
                    break;
                case 2:
                    if (this.velocidade < 40) {
                        this.velocidade += 1;
                        System.out.println("Acelerando" + this.velocidade);
                    }
                    break;
                case 3:
                    if (this.velocidade < 60) {
                        this.velocidade += 1;
                        System.out.println("Acelerando" + this.velocidade);
                    }
                    break;
                case 4:
                    if (this.velocidade < 80) {
                        this.velocidade += 1;
                        System.out.println("Acelerando" + this.velocidade);
                    }
                    break;
                case 5:
                    if (this.velocidade < 100) {
                        this.velocidade += 1;
                        System.out.println("Acelerando" + this.velocidade);
                    }
                    break;
                case 6:
                    if (this.velocidade < 120) {
                        this.velocidade += 1;
                        System.out.println("Acelerando" + this.velocidade);
                    }
                    break;
            }

        }
    }

    public void diminuirVelocidade() {
        if (this.ligado) {
            switch (this.marcha) {
                case 0:
                    System.out.println("Não pode diminuir velocidade em ponto morto");
                    break;
                case 1:
                    if (this.velocidade > 0) {
                        this.velocidade -= 1;
                    }
                    break;
                case 2:
                    if (this.velocidade > 20) {
                        this.velocidade -= 1;
                    }
                    break;
                case 3:
                    if (this.velocidade > 40) {
                        this.velocidade -= 1;
                    }
                    break;
                case 4:
                    if (this.velocidade > 60) {
                        this.velocidade -= 1;
                    }
                    break;
                case 5:
                    if (this.velocidade > 80) {
                        this.velocidade -= 1;
                    }
                    break;
                case 6:
                    if (this.velocidade > 100) {
                        this.velocidade -= 1;
                    }
                    break;
            }

        }
    }

    public void virarEsquerda() {
        if (this.ligado) {
            if (this.velocidade >= 1 && this.velocidade <= 40) {
                this.direction = true;
            }
        }
    }

    public void virarDireita() {
        if (this.ligado) {
            if (this.velocidade >= 1 && this.velocidade <= 40) {
                this.direction = false;
            }
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade: " + this.velocidade);
    }

    public void trocarMarcha(boolean troca) {
        if (this.ligado && troca == true) {
            if (this.marcha == 6) {
                System.out.println("já está na marcha máxima!");
            } else {
                this.marcha += 1;
            }

        }
        if (this.ligado && troca == false) {
            if (this.marcha == 0) {
                System.out.println("já está em ponto morto");
            } else {
                this.marcha -= 1;
            }
        }
    }
}
