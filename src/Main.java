
public class Main {

	private static  MediaService service = new MediaService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Livre l = new Livre(2, "rouge et le noir" , 4.5F, "STENDHAL", 300);
		
		CD cd = new CD(3, "92i0", 5.0F, "Bouba", 287, 1);
		boolean test = service.ajouterCD(cd);
		
		if (test)
			System.out.println("CD ajouter");
		else
			System.out.println("echec");
		
		
	}

}
