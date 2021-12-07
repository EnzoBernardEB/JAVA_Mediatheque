package fr.mediatheque.tp;

public class Dvds extends Media{
    private Zone zone;

    public Dvds(Zone zone, String titre, String auteur) {
        this.zone = zone;
        this.titre = titre;
        this.auteur = auteur;
    }

    public boolean estLisible(Zone zone) {
        if(this.zone == Zone.touteZones || this.zone == zone) {
            return true;
        }
        return false;
    }
}
