package fr.mediatheque.tp;

import java.util.ArrayList;
import java.util.List;

public abstract class Media {
    protected List<Notes> notes = new ArrayList<Notes>();
    protected String titre;
    protected String auteur;

    public String afficherMedia() {
        return ("\""+this.titre+"\" par "+this.auteur);
    }

    public void noterMedia(Notes note) {
        notes.add(note);
    }

    public float moyenneNotes() {
        int retour = 0;
        for (Notes note: notes) {
            retour += note.note;
        }
        return retour/notes.size();
    }
}