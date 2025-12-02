package controller;

import java.util.List;

import dao.AssociazioniDAO;
import dao.CorsoDAO;
import dao.StudenteDAO;
import model.Corso;
import model.Studente;

public class StudenteController {

	public boolean aggiungiStudente(Studente studente) {
		boolean studenteCreato = StudenteDAO.getStudenteDAO().create(studente);
		if(studenteCreato) {
			AssociazioniDAO.getAssociazioniDAO().addAssociazione(studente.getCorsoIscritto(), studente.getCodFiscale());
		}
		return studenteCreato;
	}
	
	public void mostraStudenti() {
		List<Studente> studenti = StudenteDAO.getStudenteDAO().readAll();
		if(studenti.isEmpty()) {
			System.out.println("== NON ci sono studenti nel DB ==");
			return;
		}
		
		System.out.println("== Elenco degli studenti ==");
		for(Studente s: studenti) {
			System.out.println(s);
		}
	}
	
	public boolean eliminaStudente(int id) {
		return StudenteDAO.getStudenteDAO().delete(id);
	}
	
	public boolean aggiornaStudente(Studente stud) {
		return StudenteDAO.getStudenteDAO().update(stud);
	}
	
	public Studente findByCodiceFiscale(String codFisc) {
		return StudenteDAO.getStudenteDAO().findByCodiceFiscale(codFisc);
	}
	
	public List<Studente> findByCorso(String codiceCorso){
		return StudenteDAO.getStudenteDAO().findByCorso(codiceCorso);
	}
	
	public Studente findById(int id) {
		return StudenteDAO.getStudenteDAO().read(id);
	}
	
	
	//Da fare mostraStudentiPerCorso(String codiceCorso)
	
	public int getNextIDStudente() {
		return StudenteDAO.getStudenteDAO().getNextIDStudente();
	}	
}
