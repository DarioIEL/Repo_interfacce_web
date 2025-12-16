package lezione13_PatternDAO;

import java.util.List;

public class StudenteDaoSqlImpl implements StudenteDAO {

	@Override
	public Studente getStudente(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Studente> getAllStudenti() {
		String sql = "SELECT * FROM studenti";
		return null;
	}

	@Override
	public void addStudente(Studente studente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudente(Studente studente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudente(Studente studente) {
		// TODO Auto-generated method stub
		
	}

}
