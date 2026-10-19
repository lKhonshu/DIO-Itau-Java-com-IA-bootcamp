package p_o_objetos.modulo3;

public record MusicBox(String music, boolean isPaused) implements MusicPlayer {

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

}
