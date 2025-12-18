package lezione15_DAOv2;

public class Main {

	public static void main(String[] args) {
//		ConnectionDAO cD = ConnectionDAO.getInstance();
//		cD.testaConnessione();
		
		Studente stud = new Studente();
		stud.setNome("Dario");
		stud.setCognome("Mennillo");
		stud.setCodFiscale("MNNDRA98cknm");
		stud.setCorsoIscritto("JAVA");
		
		GenericDAO<Studente> gdS = new StudenteDAOImpl();
		
		gdS.create(stud);
	}
}
