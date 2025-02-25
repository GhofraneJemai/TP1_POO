package ex2;

import java.util.HashMap;
import java.util.Map;

public class Annuaire {
    private Map<String, Fiche> contacts;
    
    public Annuaire() {
        contacts = new HashMap<>(); 
    }
    public void ajouterFiche(String nom, String numero, String adresse) {
        contacts.put(nom, new Fiche(nom, numero, adresse));
    }

    public Fiche rechercherFiche(String nom) {
        return contacts.get(nom);
    }

    public void afficherAnnuaire() {
        if (contacts.isEmpty()) {
            System.out.println("L'annuaire est vide.");
        } else {
            for (Fiche fiche : contacts.values()) {
                System.out.println(fiche);
            }
        }
    }

}
