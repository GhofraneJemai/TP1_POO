package tp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Etudiant etu1 = new Etudiant("E1", "Manel Boulares", new ArrayList<>());
        etu1.addNote("Maths", 15);
        etu1.addNote("Physique", 12);
        etu1.addNote("Informatique", 18);

        Etudiant etu2 = new Etudiant("E2", "Farah Guelbi", new ArrayList<>());
        etu2.addNote("Maths", 10);
        etu2.addNote("Physique", 8);
        etu2.addNote("Informatique", 14);

        Etudiant etu3 = new Etudiant("E3", "Ghofrane Jemai", new ArrayList<>());
        etu3.addNote("Maths", 17);
        etu3.addNote("Physique", 16);
        etu3.addNote("Informatique", 19);


        System.out.println("===== Statistiques des étudiants =====");
        afficherStatsEtudiant(etu1);
        afficherStatsEtudiant(etu2);
        afficherStatsEtudiant(etu3);

        List<Etudiant> groupe = new ArrayList<>();
        groupe.add(etu2);
        groupe.add(etu1);
        groupe.add(etu3);


        System.out.println("\n===== Statistiques du groupe d'étudiants =====");
        System.out.println("Moyenne du groupe : " + Stats.calculerMoyenne(groupe));
        System.out.println("Meilleur étudiant : " + Stats.trouverMax(groupe));
        System.out.println("Moins bon étudiant : " + Stats.trouverMin(groupe));
        
        System.out.println("\nAvant tri  :");
        groupe.forEach(System.out::println);


        Collections.sort(groupe);
        System.out.println("\nAprès tri par matricule :");
        groupe.forEach(System.out::println);

        
        Collections.sort(groupe, new CompareMoyenne());
        System.out.println("\nAprès tri par moyenne :");
        groupe.forEach(System.out::println);

        
        Collections.sort(groupe, new CompareNom());
        System.out.println("\nAprès tri par nom :");
        groupe.forEach(System.out::println);
    }

    public static void afficherStatsEtudiant(Etudiant etu) {
        System.out.println("Étudiant : " + etu.getNom() + " (" + etu.getMatricule() + ")");
        System.out.println("Moyenne : " + etu.getMoyenne());
        System.out.println("Meilleure note : " + Stats.getMeilleureNote(etu));
        System.out.println("Moins bonne note : " + Stats.getMoinsBonneNote(etu));
        System.out.println("-----------------------------------");
    }

}
