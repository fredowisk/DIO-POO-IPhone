package strategies;

import protocols.Telephone;

public class TelephoneStrategy implements Telephone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void answer() {
        System.out.println("Answering call...");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail...");
    }
}
