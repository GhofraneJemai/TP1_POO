package ex2;

public class Fiche implements Comparable<Fiche> {
    private String nom;
    private String numero;
    private String adresse;
	public Fiche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fiche(String nom, String numero, String adresse) {
		super();
		this.nom = nom;
		this.numero = numero;
		this.adresse = adresse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Fiche [nom=" + nom + ", numero=" + numero + ", adresse=" + adresse + "]";
	}
    @Override
    public int compareTo(Fiche o) {
        return this.nom.compareTo(o.nom);
    }

}
