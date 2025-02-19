package tp1;

import java.util.ArrayList;
import java.util.Collections;

public class Etudiant implements Statisticable, Comparable<Etudiant> {
	private String matricule;
    private String nom;
    private ArrayList<Note> notes;
    
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String matricule, String nom, ArrayList<Note> notes) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.notes = notes;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", notes=" + notes + "]";
	}
	public void addNote(String intitule, double valeur) {
        notes.add(new Note(intitule, valeur));
    }
	
    public double getMoyenne() {
        if (notes.isEmpty()) return 0;
        double somme = 0;
        for (Note note : notes) {
            somme += note.getValeur();
        }
        return somme / notes.size();
    }
    public Note getMeilleureNote() {
        return notes.isEmpty() ? null : Collections.max(notes);
    }

    public Note getMoinsBonneNote() {
        return notes.isEmpty() ? null : Collections.min(notes);
    }

	@Override
	public float getValue() {
		return (float) getMoyenne();
	}
	 @Override
	    public int compareTo(Etudiant autre) {
	        return Double.compare(this.getMoyenne(), autre.getMoyenne());
	    }
    
}
