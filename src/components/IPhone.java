package components;

import protocols.InternetBrowser;
import protocols.MusicPlayer;
import protocols.Smartphone;
import protocols.Telephone;

public class IPhone implements Smartphone {
    InternetBrowser internetBrowser;
    MusicPlayer musicPlayer;
    Telephone telephone;

    public IPhone(Telephone TelephoneStrategy, InternetBrowser InternetBrowserStrategy, MusicPlayer MusicPlayerStrategy) {
        this.telephone = TelephoneStrategy;
        this.internetBrowser = InternetBrowserStrategy;
        this.musicPlayer = MusicPlayerStrategy;
    }

    public void executeTelephone() {
        System.out.println("##### Call #####");

        this.telephone.call();
        this.telephone.answer();
        this.telephone.startVoicemail();
    }

    public void executeInternetBrowser() {
        System.out.println("##### Browser #####");

        this.internetBrowser.displayPage();
        this.internetBrowser.addNewTab();
        this.internetBrowser.refreshPage();
    }

    public void executeMusicPlayer() {
        System.out.println("##### Music Player #####");

        this.musicPlayer.selectSong();
        this.musicPlayer.play();
        this.musicPlayer.pause();
    }

}
