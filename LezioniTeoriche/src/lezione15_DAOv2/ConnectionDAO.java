package lezione15_DAOv2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
	
	private static final String URL = "jdbc:mysql://localhost:3306/gestione_scuola";
	private static final String USER = "admin";
	private static final String PASS = "mennilloDario_89";
	
	//Faccio con un SIngleton per la connessione
	private static ConnectionDAO instance;
	
	private ConnectionDAO() {
		//Inviare un messaggio di avvenuto collegamento
		try {
			System.out.println("Collegamento con JDBC stabilito");
		} catch (Exception e) {
			System.out.println("Impossibile connettersi attraverso JDBC");
		}
	}

	//restituisce l'istanza singleton della connessione
	public static ConnectionDAO getInstance() {
		if(instance== null) {
			instance = new ConnectionDAO();
		}
		return instance;
	}

	
	public Connection getConnessione() {
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void closeConnessione(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void testaConnessione() {
		Connection conn = null;
		try {
			conn = getConnessione();
			System.out.println("Connessione OK");
			
		} catch (Exception e) {
			System.out.println("Connessione non avvenuta");
		}finally {
			closeConnessione(conn);
		}
	}
}
