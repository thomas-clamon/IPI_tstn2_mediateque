package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MediaDao {

	private String url = "jdbc:sqlserver://thomasclamon.database.windows.net:1433;databaseName=MediathequeDB";
	private String user = "toto";
	private String pwd = "Soleil123";
	
	private Statement statement;
	
	public MediaDao() {
		
		try {
			Connection con = DriverManager.getConnection(url, user, pwd);
			this.statement = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		return statement;
	}
}
