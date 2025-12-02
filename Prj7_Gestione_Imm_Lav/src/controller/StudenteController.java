package controller;

import dao.StudenteDAO;
import model.Studente;

public class StudenteController {

	public boolean aggiungiStudente(Studente studente) {
		return StudenteDAO.getStudenteDAO().create(Studente)
	}
	
}
