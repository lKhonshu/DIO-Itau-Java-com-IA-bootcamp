package p_o_objetos.modulo3;

public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("Reproduzindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("Parando o vídeo");
    }

}
