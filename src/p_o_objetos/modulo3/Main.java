package p_o_objetos.modulo3;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

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

        // AULA 2

        List<User> users = List.of(new User("Maria", 21), new User("João", 30));
        printStringValue(Record::toString, users);

    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

}
