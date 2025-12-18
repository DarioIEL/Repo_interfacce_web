package lezione15_DAOv2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class StudenteDAOImpl implements GenericDAO<Studente>{
	
	private ConnectionDAO connectionDAO;
	
	public StudenteDAOImpl() {
		this.connectionDAO = ConnectionDAO.getInstance();
	}

	@Override
	public boolean create(Studente studente) {
		String sql = "INSERT INTO students (nome, cognome, corsoIscritto, codiceFiscale) VALUES (?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = connectionDAO.getConnessione();
			ps = conn.prepareStatement(sql);
			ps.setString(1, studente.getNome());
			ps.setString(2, studente.getCognome());
			ps.setString(3, studente.getCorsoIscritto());
			ps.setString(4, studente.getCodFiscale());
			
			ps.executeUpdate();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			connectionDAO.closeConnessione(conn);
		}
		
		return false;
	}

	@Override
	public Studente readByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Studente> readALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Studente entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
