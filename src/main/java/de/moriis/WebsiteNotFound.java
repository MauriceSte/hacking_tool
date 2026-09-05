package de.moriis;

@Deprecated
public class WebsiteNotFound extends RuntimeException {
    public WebsiteNotFound(String message) {
        super(message);
    }
}
