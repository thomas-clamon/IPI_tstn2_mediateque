import java.util.List;
import dao.MediaDao;

import java.sql.SQLException;
import java.sql.Statement;

public class MediaService implements IMediaService{

	private Statement sts = new MediaDao().getStatement();
	
	@Override
	public boolean ajouterLivre(Livre l) {
		
		String sql = String.format("INSERT INTO Medias	 (type_media, nom, prix_achat, artiste, nb_page)"
				+"VALUES ('%s', '%s', %s, '%s', %d)", 
				Type_media.LIVRE.toString(),
				l.getNom(),
				l.prix_toString(),
				l.getAuteur(),
				l.getNbpage());
		System.out.println(sql);
		
		try {
			sts.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean ajouterCD(CD cd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Medias> getAllMedia() {
		// TODO Auto-generated method stub
		return null;
	}

}
