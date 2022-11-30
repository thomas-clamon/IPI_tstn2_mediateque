
public class Livre extends Medias{

	private int nbpage;

	@Override
	public float calculerPrix() {
		
		return getPrix_achat() + 0.01F*nbpage;
	}

	public Livre(int iD, String nom, float prix_achat, String auteur, int nbpage) {
		super(iD, nom, prix_achat, auteur, Type_media.LIVRE);
		this.nbpage = nbpage;
	}

	public int getNbpage() {
		return nbpage;
	}

	public void setNbpage(int nbpage) {
		this.nbpage = nbpage;
	}
	

	
	
	
	

}
