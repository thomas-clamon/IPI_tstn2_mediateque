
public abstract class Medias {
	
	private int ID;
	private String Nom;
	private float prix_achat;
	private String auteur;
	private Type_media type;
	
	
	
	public Medias(int iD, String nom, float prix_achat, String auteur, Type_media type) {
		super();
		ID = iD;
		Nom = nom;
		this.prix_achat = prix_achat;
		this.auteur = auteur;
		this.type = type;
	}
	
	public String prix_toString() {
	
		return String.format("%.2f", prix_achat).replace(",", ".");
	}
	

	public String toString()
	{
		return String.format("%s : %d | %s %f euros\n", getType().toString(), getID(),getNom(), calculerPrix() );
		
	}

	public abstract float calculerPrix();
	

	public Type_media getType() {
		return type;
	}

	public void setType(Type_media type) {
		this.type = type;
	}

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
