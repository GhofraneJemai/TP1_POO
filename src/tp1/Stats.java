package tp1;

import java.util.Collections;
import java.util.List;

public class Stats {

    public static double calculerMoyenne(List<Etudiant> etudiants) {
        if (etudiants.isEmpty()) return 0;
        double somme = 0;
        for (Etudiant etudiant : etudiants) {
            somme += etudiant.getMoyenne();
        }
        return somme / etudiants.size();
    }

    public static Etudiant trouverMax(List<Etudiant> etudiants) {
        return etudiants.stream().max((e1, e2) -> Double.compare(e1.getMoyenne(), e2.getMoyenne())).orElse(null);
    }

    public static Etudiant trouverMin(List<Etudiant> etudiants) {
        return etudiants.stream().min((e1, e2) -> Double.compare(e1.getMoyenne(), e2.getMoyenne())).orElse(null);
    }

    public static Note getMeilleureNote(Etudiant etudiant) {
        return etudiant.getNotes().isEmpty() ? null : Collections.max(etudiant.getNotes());
    }

    public static Note getMoinsBonneNote(Etudiant etudiant) {
        return etudiant.getNotes().isEmpty() ? null : Collections.min(etudiant.getNotes());
    }
}
