package fr.mediatheque.tp;

public enum Notes {
    uneEtoile(1),
    deuxEtoile(2),
    troisEtoile(3),
    quatreEtoile(4),
    cinqEtoile(5);

    public final int note;

    Notes(int note) {
        this.note = note;
    }
}
