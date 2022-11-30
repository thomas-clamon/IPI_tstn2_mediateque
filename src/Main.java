import java.util.List;


public class Main {

	private static  MediaService service = new MediaService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Medias> list = service.getAllMedia();
		
		System.out.println(list);
		
		
	}

}
