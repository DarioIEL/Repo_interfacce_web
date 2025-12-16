package lezione13_PatternDAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudenteDaoImpl implements StudenteDAO{
	
	//Questo sotto rappresenta il nostro DB
	private List<Studente> studenti;
	
	public StudenteDaoImpl() {
		studenti = new ArrayList<>();
		
		Studente stud1 = new Studente("Dario Mennillo", 1);
		Studente stud2 = new Studente("Oscar Vecchione", 2);
		Studente stud3 = new Studente("Milo Spandre", 3);
		
		studenti.add(stud1);
		studenti.add(stud2);
		studenti.add(stud3);
	}

	@Override
	public Studente getStudente(int rollNo) {
		
		for (Studente stud: studenti) {
			if(stud.getRollNo() == rollNo) {
				return stud;
			}
		}
		return null;
		
//		return studenti.stream()
//			   .filter(stud -> stud.getRollNo() == rollNo)
//			   .findFirst()
//			   .orElse(null);
	}

	@Override
	public List<Studente> getAllStudenti() {
		// TODO Auto-generated method stub
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
