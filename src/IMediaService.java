import java.util.List;

public interface IMediaService {
	
	public boolean ajouterLivre(Livre l);
	
	public boolean ajouterCD (CD cd);
	
	public List<Medias> getAllMedia();

}
