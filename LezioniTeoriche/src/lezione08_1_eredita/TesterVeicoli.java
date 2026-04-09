package lezione08_eredita;

import java.util.ArrayList;
import java.util.List;

public class TesterVeicoli {

	public static void main(String[] args) {
		
		//Creo un'automobile
		System.out.println("=== AUTOMOBILE ===");
		Automobile auto = new Automobile("Peugeot", "2008", 2022, 4, 5);
		//ATT: marca modello e mostraInfo arrivano direttamente da Veicolo
		System.out.println(auto.marca);
		System.out.println(auto.modello);
		System.out.println(auto.NOME_VEICOLO);
		auto.start();
		auto.mostraInfo();
		
		//Posso anche creare un veicolo generico
		System.out.println("=== VEICOLO GENERICO ===");
		Veicolo veicoloGen = new Veicolo("Marca Generica", "Modello Generico", 2025, 0);
		veicoloGen.mostraInfo();
		veicoloGen.start();
		veicoloGen.stop();
		
		
		System.out.println("=== VEICOLO AUTOMOBILE ===");
		Veicolo automobile = new Automobile("BMW", "X5", 2020, 4, 5);
//		automobile.accendiAC(); //Non posso accendere l'aC perché automobile è di tipo Veicolo
		automobile.mostraInfo();
		automobile.start();
		automobile.stop();

		
		System.out.println("=== MOTO ===");
		Motocicletta moto = new Motocicletta("Kawasaki", "z750", 2016, "Stradale");
		moto.mostraInfo();
		
		System.out.println("=== MOTO NAKED ===");
		motoNaked motoNak = new motoNaked("Honda", "CBR", 2020, "Pista");
		motoNak.mostraInfo();
		motoNak.start(); //start() arriva da Motocicletta poiché Motocicletta lo sta mandando in override
		System.out.println(motoNak.modello); //modello arriva da Veicolo
	}

}
