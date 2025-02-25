package ex2;

import java.util.Map;
import java.util.TreeMap;

class Annuaire2 {
    private Map<String, Fiche> contacts;

    public Annuaire2() {
        contacts = new TreeMap<>(); 
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
