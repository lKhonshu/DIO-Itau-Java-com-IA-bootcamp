package p_o_objetos.modulo3;

public class Main {
    public static void main(String[] args) {
        var MusicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Tocando a música");
            }

            @Override
            public void pauseMusic() {
                System.out.println("Pausing music");
            }

            @Override
            public void stopMusic() {
                System.out.println("Stopping music");
            }

        };
        MusicPlayer.playMusic();
        MusicPlayer.pauseMusic();
        MusicPlayer.stopMusic();

        MusicPlayer musicPlayer2 = new MusicBox("Musica", false);
        runMusic(musicPlayer2);
        musicPlayer2.pauseMusic();
        musicPlayer2.stopMusic();

        VideoPlayer videoPlayer = new Smartphone();
        runVideo(videoPlayer);
        videoPlayer.pauseVideo();
        videoPlayer.stopVideo();

    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

}
