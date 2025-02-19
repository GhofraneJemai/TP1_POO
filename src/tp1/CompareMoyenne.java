package tp1;

import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return Double.compare(e1.getMoyenne(), e2.getMoyenne());
    }
}
