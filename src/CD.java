
public class CD extends Medias{

	private int duree;
	private int nbTitre;
	

	public CD(int iD, String nom, float prix_achat, String auteur, 
				int duree, int nbTitre) {
		super(iD, nom, prix_achat, auteur, Type_media.CD);
		this.duree = duree;
		this.nbTitre = nbTitre;
	}


	@Override
	public float calculerPrix() {
		// TODO Auto-generated method stub
		return this.getPrix_achat() + 0.1F *(float) (duree/nbTitre);
	}


	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}


	public int getNbTitre() {
		return nbTitre;
	}


	public void setNbTitre(int nbTitre) {
		this.nbTitre = nbTitre;
	}

	
	
}
