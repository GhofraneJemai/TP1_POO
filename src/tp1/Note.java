package tp1;

public class Note implements Statisticable , Comparable<Note>{
	private String intitule;
    private double valeur;
   
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(String intitule, double valeur) {
		super();
		this.intitule = intitule;
		this.valeur = valeur;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "Note [intitule=" + intitule + ", valeur=" + valeur + "]";
	}

	@Override
	public float getValue() {
		return (float) valeur;
	}
	@Override
    public int compareTo(Note autre) {
        return Double.compare(this.valeur, autre.valeur);
    }

}
