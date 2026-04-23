package lezione09_Recap_Ereditarieta;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Sto testando l'ereditarietà di classi concrete
		
		Auto miaAuto = new Auto("Peugeot", "2008", 2019, 4, 5);
		
		//Questi due metodi appartengono a Veicolo e possono essere richiamati su miaAuto
		miaAuto.start();
		miaAuto.stop();
		
		//Questo metodo è tipico dell'Auto e non esiste su Veicolo
		miaAuto.accendiAC();
		
		System.out.println( miaAuto.getInfo() );
		
		Bicicletta miaBici = new Bicicletta("Bianchi", "Street MJ", 2020, 2, "rosso");
		System.out.println(miaBici.getInfo());
		miaBici.start();
		miaBici.stop();

		System.out.println("Creo il mio Garage");
		Veicolo nuovaAuto = new Auto("Fiat", "Panda", 2026, 4, 5); //Upcasting
		Veicolo nuovaBici = new Bicicletta("Cannondale", "Pista", 2026, 2, "blu");
		
		//Adesso i metodi getInfo() vengono direttamente da Veicolo e poi specificati nelle singole classi
		System.out.println(nuovaAuto.getInfo());
		System.out.println(nuovaBici.getInfo());
		
		List<Veicolo> garage = new ArrayList<>();
		garage.add(nuovaAuto);
		garage.add(nuovaBici);
		garage.add(miaBici); //puoi comunque inserire oggetti di tipo Auto e Bicicletta
		garage.add(miaAuto);
		
		System.out.println("Stampo tutti i veicoli nel mio garage");
		garage.forEach(veicolo -> {
			System.out.println(veicolo.getInfo());
		});
	
		//Proprio perché abbiamo classi concrete posso creare oggetti di tipo Veicolo
		Veicolo veicoloGenerico = new Veicolo("BMW", "X2", 2015, 4);
		
	}
}
