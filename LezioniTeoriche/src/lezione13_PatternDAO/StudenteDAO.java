package lezione13_PatternDAO;

import java.util.List;

public interface StudenteDAO {

	//L'interfaccia DAO contiene tutti i metodi del CRUD (Create, Read, Update, Delete)
	
	Studente getStudente(int rollNo);
	List<Studente> getAllStudenti();
	void addStudente(Studente studente);
	void updateStudente(Studente studente);
	void deleteStudente(Studente studente);
}
