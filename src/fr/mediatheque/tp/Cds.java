package fr.mediatheque.tp;


public class Cds extends Media {
    private Format format;

    public Cds(Format format, String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.format = format;
    }
    @Override
    public String afficherMedia() {
        return ("\"" + this.titre + "\" par " + this.auteur+" ["+this.format+"]");
    }
}
