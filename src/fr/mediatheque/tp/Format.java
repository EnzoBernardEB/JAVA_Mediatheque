package fr.mediatheque.tp;

public enum Format {
    CDMusical("CD musical"),
    OGG("OGG"),
    MP3("MP3");

    public final String format;

    Format(String format) {
        this.format = format;
    }
}
