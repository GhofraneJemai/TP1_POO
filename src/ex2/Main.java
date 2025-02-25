package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Annuaire2 annuaire = new Annuaire2();
        String commande;

        System.out.println("Bienvenue dans l'annuaire. Entrez une commande :");

        while (true) {
            System.out.print("> ");
            commande = scanner.nextLine().trim();

            if (commande.equals(".")) {
                System.out.println("Fin du programme.");
                break;
            } else if (commande.startsWith("+")) {
                String nom = commande.substring(1).trim();
                System.out.print("Numéro : ");
                String numero = scanner.nextLine().trim();
                System.out.print("Adresse : ");
                String adresse = scanner.nextLine().trim();
                annuaire.ajouterFiche(nom, numero, adresse);
                System.out.println("Fiche ajoutée !");
            } else if (commande.startsWith("?")) {
                String nom = commande.substring(1).trim();
                Fiche fiche = annuaire.rechercherFiche(nom);
                if (fiche != null) {
                    System.out.println(fiche);
                } else {
                    System.out.println("Aucune fiche trouvée pour " + nom);
                }
            } else if (commande.equals("!")) {
                annuaire.afficherAnnuaire();
            } else {
                System.out.println("Commande invalide. Utilisez +nom, ?nom, ! ou .");
            }
        }
        
        scanner.close();
    }
}