import java.util.List;
import dao.MediaDao;

import java.sql.SQLException;
import java.sql.Statement;

public class MediaService implements IMediaService{

	private Statement sts = new MediaDao().getStatement();
	
	private boolean ajouterMedia(String request) {
		
		try {
			sts.executeUpdate(request);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
		
	
	@Override
	public boolean ajouterLivre(Livre l) {
		
		String sql = String.format("INSERT INTO Medias	 (type_media, nom, prix_achat, artiste, nb_page)"
				+"VALUES ('%s', '%s', %s, '%s', %d)", 
				Type_media.LIVRE.toString(),
				l.getNom(),
				l.prix_toString(),
				l.getAuteur(),
				l.getNbpage());
		return ajouterMedia(sql);
	}
		
	@Override
	public boolean ajouterCD(CD cd) {
		String sql = String.format("INSERT INTO Medias	 (type_media, nom, prix_achat, artiste, duree, nb_titre)"
				+" VALUES ('%s', '%s', %s, '%s', %d, %d)", 
				Type_media.CD.toString(),
				cd.getNom(),
				cd.prix_toString(),
				cd.getAuteur(),
				cd.getDuree(),
				cd.getNbTitre());
		return ajouterMedia(sql);
	}

	@Override
	public List<Medias> getAllMedia() {
		// TODO Auto-generated method stub
		return null;
	}

}
