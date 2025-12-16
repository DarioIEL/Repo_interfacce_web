package lezione13_PatternDAO;

public class Main {
	public static void main(String[] args) {
		
//		StudenteDAO studenteDaoSql = new StudenteDaoSqlImpl();
		StudenteDAO studenteDao = new StudenteDaoImpl(); //Programming to Interface, accoppiamento loose, approccio corretto nella programmazione con i DAO

//		StudenteDaoImpl studenteDao = new StudenteDaoImpl(); //accoppiamento stretto, non è il giusto approccio nella programmazione con i DAO e rispetta i principi SOLID
		
		
		System.out.println("=== Tutti gli studenti ===");
		for(Studente stud: studenteDao.getAllStudenti()) {
			System.out.println(stud.toString());
		}
		
		System.out.println("=== Singolo Studente ===");
		System.out.println(studenteDao.getStudente(1).toString());
		
	}

}
