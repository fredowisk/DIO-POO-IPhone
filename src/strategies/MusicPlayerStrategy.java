package strategies;

import protocols.MusicPlayer;

public class MusicPlayerStrategy implements MusicPlayer {

    @Override
    public void play() {
        System.out.println("Playing the song...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the song...");
    }

    @Override
    public void selectSong() {
        System.out.println("Selecting the song...");
    }
}
