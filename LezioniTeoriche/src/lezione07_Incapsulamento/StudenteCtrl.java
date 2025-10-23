package lezione07_Incapsulamento;

import java.util.ArrayList;
import java.util.List;

public class StudenteCtrl {

	private List<Studente> studenti;
	
	public StudenteCtrl() {
		this.studenti = new ArrayList<>();
	}
	
	
	public void registraStudente(String nome, String cognome, String accesso) {
		if(accesso.equals("1234")) {
			
			Studente stud = new Studente();
			stud.setNome(nome);
			stud.setCognome(cognome);
			stud.setAnnoIscrizione(2024);
			stud.setMatricola(0);
			
			this.studenti.add(stud);
		}
	}
	

	public List<Studente> getStudenti() {
		return studenti;
	}


	public void stampaStudenti() {
		for (Studente studente : studenti) {
			System.out.println(studente);
		}
	}
}
