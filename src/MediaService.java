import java.util.ArrayList;
import java.util.List;
import dao.MediaDao;

import java.sql.ResultSet;
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
		
		String SQL = "SELECT * FROM Medias";
		
		List<Medias> list = new ArrayList<>();
		
		try {
			ResultSet rs = sts.executeQuery(SQL);
			
			while(rs.next()) {
				
				Type_media type = Type_media.valueOf(rs.getString("type_media"));
				
				// ce qui est commun ici :
				String nom = rs.getString("nom");
				float prix_achat = rs.getFloat("prix_achat");
				String auteur = rs.getString("artiste");
				
				
				switch (type) {
				
					case CD :
						
						int duree = rs.getInt("duree");
						int nb_titre = rs.getInt("nb_titre");
						CD cd = new CD(0, nom, prix_achat, auteur, duree, nb_titre);
						list.add(cd);
					break;
					case LIVRE :
					
						int nb_page = rs.getInt("nb_page");
						Livre livre = new Livre(0, nom, prix_achat, auteur, nb_page);
						list.add(livre);
					default :
						// on fait rien	
				
				}
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
