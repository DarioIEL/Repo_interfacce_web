package lezione07_Incapsulamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Studente stud = new Studente();
		
		//Essendo nome una prop private non posso accedervi direttamente né in lettura né in scrittura
//		stud.nome = "Dario";
//		System.out.println(stud.nome);
		
		stud.setNome("DARIO");
		stud.setCognome("Mennillo");
		
		System.out.println(stud.getNome() + " " + stud.getCognome());
		
		Studente stud2 = new Studente("Anna", "Rossi", 2024);
		//Voglio cambiare solo il cognome perché in fase di registrazione l'ho scritto male 
		stud2.setCognome("Verdi");
		System.out.println(stud2.getNome() + stud2.getCognome() );
		System.out.println(stud2);
		
		StudenteCtrl studCtrl = new StudenteCtrl();
		
		studCtrl.registraStudente("LUISA", "VERDI", "1234");
		
		

		//NUOVO CORSO
		System.out.println("=== NUOVO CORSO ===");
		RespoCorso respo = new RespoCorso("Tina", "Ponte");
		studCtrl.registraStudente("Anna", "Rossi", "1234");
		studCtrl.registraStudente("Mario", "Gialli", "1234");
		
		Corso corsoWEB = new Corso("Interfacce WEB", 500);
		corsoWEB.setStudenti(studCtrl.getStudenti());
		corsoWEB.setRespo(respo);
		respo.setCorso(corsoWEB);
		
		System.out.println(corsoWEB);
		
	}
}
