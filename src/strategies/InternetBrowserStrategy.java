package strategies;

import protocols.InternetBrowser;

public class InternetBrowserStrategy implements InternetBrowser {
    @Override
    public void displayPage() {
        System.out.println("Displaying web page...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding new tab...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing web page...");
    }
}
