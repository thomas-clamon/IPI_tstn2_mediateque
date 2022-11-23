
public abstract class Medias {
	
	private int ID;
	private String Nom;
	private float prix_achat;
	private String auteur;
	
	
	
	public Medias(int iD, String nom, float prix_achat, String auteur) {
		super();
		ID = iD;
		Nom = nom;
		this.prix_achat = prix_achat;
		this.auteur = auteur;
	}
	
	public String prix_toString() {
	
		return String.format("%.2f", prix_achat).replace(",", ".");
	}
	

	public String toString()
	{
		return String.format("Livre : %d | %s %f euros", getID(),getNom(), calculerPrix() );
	}

	public abstract float calculerPrix();

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public float getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(float prix_achat) {
		this.prix_achat = prix_achat;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	

}
