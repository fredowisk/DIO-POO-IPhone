import components.IPhone;
import factories.IPhoneFactory;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = IPhoneFactory.getInstance();
        iphone.executeTelephone();
        iphone.executeInternetBrowser();
        iphone.executeMusicPlayer();
    }
}