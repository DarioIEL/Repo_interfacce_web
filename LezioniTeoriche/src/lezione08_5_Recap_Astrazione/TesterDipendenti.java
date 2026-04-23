package lezione10_Recap_Astrazione;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class TesterDipendenti {
	public static void main(String[] args) {
		
		Developer dev = new Developer("Anna", "Rossi", "ANNRSS99P99F999W", new Date());
//		double stipendioDev = dev.calcolaStipendio();
//		System.out.println(dev.stampaInfo() + "\nStipendio: €" + stipendioDev);
		System.out.println(dev.stampaInfo());
		
		
		//Questo sotto è proprio un esempio del polimorfismo (dynamic dispatch)
		Dipendente cons2 = new Consulente("Marco", "Bianchi", "MRCBNC33P12F098M", new Date(), 10, 1.1);
		double stipendioCons2 = cons2.calcolaStipendio();
		System.out.println(cons2.stampaInfo());
		System.out.println("SOLO STIPENDIO: €" + stipendioCons2);
		

		
		Consulente cons = new Consulente("Maria", "Gialli", "MRIGLL88F88R123X", new Date());
		cons.setOreLavorate(28); //ATT: i setters possono essere richiamati solo su Oggetti di tipo Consulente
		cons.setBonus(1.4);
//		double stipendioCons = cons.calcolaStipendio();
//		System.out.println(cons.stampaInfo() + "\nStipendio: €" + stipendioCons);
		System.out.println(cons.stampaInfo());
		
		
		List<Dipendente> listaDipendenti = new ArrayList<>();
		listaDipendenti.add(new Developer("Dario", "Mennillo", "qwertyui", new Date()));
		
		//Upcasting
		Dipendente consulenteIT = new Consulente("Anna", "Verdi", "qwerty", new Date());
		consulenteIT.calcolaStipendio(); //Questo è il metodo del Dipendente (questo è un po' un limite)
		//Questo sotto si chiama downcasting
		Consulente cIT = (Consulente) consulenteIT;
		cIT.calcolaStipendio(); //QUesto metodo è di consulente
		
	}
}
