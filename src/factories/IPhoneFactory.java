package factories;

import components.IPhone;
import strategies.InternetBrowserStrategy;
import strategies.MusicPlayerStrategy;
import strategies.TelephoneStrategy;

public class IPhoneFactory {

    public static IPhone getInstance() {
        return new IPhone(new TelephoneStrategy(), new InternetBrowserStrategy(), new MusicPlayerStrategy());
    }
}
