package controller;

import java.util.List;

import dao.CorsoDAO;
import model.Corso;

public class CorsoController {

	
	public CorsoController () {}
	
	public boolean aggiungiCorso(Corso corso) {
		return CorsoDAO.getCorsoDAO().create(corso);
//		return this.corsoDAO.create(corso);
	}
	
	public void mostraCorsi() {
		List<Corso> corsi = CorsoDAO.getCorsoDAO().readAll();
		if(corsi.isEmpty()) {
			System.out.println("== NON ci sono corsi nel DB ==");
			return;
		}
		
		System.out.println("== Elenco dei corsi attivi ==");
		for(Corso c: corsi) {
			System.out.println(c);
		}
	}
	
	public boolean eliminaCorso(int id) {
		return CorsoDAO.getCorsoDAO().delete(id);
	}
	
	public boolean aggiornaCorso(Corso corso) {
		return CorsoDAO.getCorsoDAO().update(corso);
	}
	
	public void cercaTitolo(String titolo){
		
		List<Corso> corsiTrovati = CorsoDAO.getCorsoDAO().findByPattern(titolo);
		
		if(!corsiTrovati.isEmpty()) {
			System.out.println("== Corsi Trovati ==");
			for(Corso c: corsiTrovati) {
				System.out.println(c);
			}
		}else {
			System.out.println("Nessun corso corrispondente");
		}
		
	}
	
	public int getNextIDCorso() {
		return CorsoDAO.getCorsoDAO().getNextIDCorso();
	}
}
