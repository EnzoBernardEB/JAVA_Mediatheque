package fr.mediatheque.tp;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Dvds dvd1 = new Dvds(Zone.zone1,"dvd1", "riz annanas");
        Dvds dvd2 = new Dvds(Zone.zone1,"dvd2", "rizzczd annanas");
        Dvds dvd3 = new Dvds(Zone.zone1,"dvd3", "rizdd annanas");
        Cds cd1 = new Cds(Format.CDMusical, "cd1","lesdcdc petits oiseaux");
        Cds cd2 = new Cds(Format.CDMusical, "cd2","lesd petits oiseaux");
        Livre livre1 = new Livre("livreauteur", "livre1");
        Mediatheque mediatheque = new Mediatheque();

        System.out.println(mediatheque.ajouterMedia(dvd1));
        System.out.println(mediatheque.ajouterMedia(cd1));
        System.out.println(mediatheque.ajouterMedia(cd1));
        System.out.println(mediatheque.ajouterMedia(dvd2));
        System.out.println(mediatheque.ajouterMedia(dvd3));
        System.out.println(mediatheque.ajouterMedia(cd2));
        System.out.println(mediatheque.ajouterMedia(livre1));

        ArrayList<Media> mediasFiltre =mediatheque.filtre(Criteres.type,"CD");
        for (Media media : mediasFiltre  ) {
            System.out.println(media.afficherMedia());
        }

        //        String texte =dvd1.afficherMedia();
//        String texte2 =cd1.afficherMedia();
//        System.out.println(texte2);
//
//        cd1.noterMedia(Notes.quatreEtoile);
//        cd1.noterMedia(Notes.quatreEtoile);
//        cd1.noterMedia(Notes.deuxEtoile);
//        cd1.noterMedia(Notes.cinqEtoile);
//        float moyenne = cd1.moyenneNotes();
//        System.out.println("moyenne "+moyenne);
    }
}
