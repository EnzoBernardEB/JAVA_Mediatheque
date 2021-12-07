package fr.mediatheque.tp;

public enum Criteres {
    auteur("auteur"),
    titre("titre"),
    type("type");

    public String critere;

    Criteres(String critere) {
        this.critere = critere;
    }
}
