package fr.mediatheque.tp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mediatheque {
    private List<Media> medias = new ArrayList<Media>();

    public String ajouterMedia(Media media) {
        if(medias.contains(media)) {
            return "Média déja présent dans la base de données";
        }
        medias.add(media);
        return "Média bien ajouté";
    }

    public ArrayList<Media> filtre(Criteres critere, String valeur) {
        ArrayList<Media> retour = new ArrayList<Media>();

        switch (critere) {
            case titre:
                retour = medias.stream().filter(media -> media.titre == valeur).collect(Collectors.toCollection(ArrayList::new));
            case auteur:
                retour = medias.stream().filter(media -> media.auteur == valeur).collect(Collectors.toCollection(ArrayList::new));
            case type:
                if(valeur.equals("CD")){
                    retour = medias.stream().filter(media -> media instanceof Cds ).collect(Collectors.toCollection(ArrayList::new));
                } else if( valeur.equals("DVD")) {
                   retour = medias.stream().filter(media -> media instanceof Dvds ).collect(Collectors.toCollection(ArrayList::new));
                } else if (valeur.equals("Livre")) {
                    retour = medias.stream().filter(media -> media instanceof Livre ).collect(Collectors.toCollection(ArrayList::new));
                }
        }
        return retour;
    }
}
