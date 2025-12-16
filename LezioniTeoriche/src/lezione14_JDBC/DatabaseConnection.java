package lezione14_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/cinema";
	private static final String USER = "root";
	private static final String PASS = "vecchione";
	private static Connection connection = null;
	
	public Connection getConn() {
		return connection;
	}

	
	public void connetti() {
		
		try {
			connection = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Siamo connessi al DB");
		} catch (SQLException e) {
			System.err.println("ERRORE NELLO STABILIRE UNA CONNESSIONE");
			System.err.println(e.getMessage());
		}
	}
	
	public void chiudiConnessione() {
		try {
			connection.close();
			System.out.println("Connessione chiusa");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
