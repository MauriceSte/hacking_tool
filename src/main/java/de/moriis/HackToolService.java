package de.moriis;

public class HackToolService {

    public static void hackBirthdayGift(Website website, String linkExtension) {

        WebsiteData data = Server.accessData(website + linkExtension);
        data.delete();
    }
}
