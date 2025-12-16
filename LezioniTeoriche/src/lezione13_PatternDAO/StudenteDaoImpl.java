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
		return new ArrayList<>(studenti); //restituisce una copia dell'arraylist
	}

	@Override
	public void addStudente(Studente studente) {
		studenti.add(studente);
		System.out.println("Hai aggiunto lo studente: " + studente.getNome() + " - Matricola: " + studente.getRollNo());
	}

	@Override
	public void updateStudente(Studente studente) {
		for(int i = 0 ; i < studenti.size(); i++) {
			if(studenti.get(i).getRollNo() == studente.getRollNo()) {
				studenti.set(i, studente);
				System.out.println("Studente modificato");
				return;
			}
		}
		System.out.println("Studente non trovato per eseguire le modifiche");		
	}

	@Override
	public void deleteStudente(Studente studente) {
//		for(int i = 0 ; i < studenti.size(); i++) {
//			if(studenti.get(i).getRollNo() == studente.getRollNo()) {
//				studenti.remove(i);
//				break;
//			}
//		}
		
		studenti.removeIf(stud -> stud.getRollNo() == studente.getRollNo());
		System.out.println("Studente " + studente.getNome() + " rimosso");
	}
	

}
