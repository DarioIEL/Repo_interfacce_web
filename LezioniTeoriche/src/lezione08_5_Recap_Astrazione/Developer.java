package lezione10_Recap_Astrazione;

import java.util.Date;

public class Developer extends Dipendente {
	
	private double moltiplicatoreStipendio = 1.5;

	public Developer(String nome, String cognome, String codFisc, Date dataAssunzione) {
		super(nome, cognome, codFisc, dataAssunzione);
	}

	//Qui sono OBBLIGATO a sviluppare il metodo calcolaStipendio()
	@Override
	public double calcolaStipendio() {
		double stipendio = stipendioBase * moltiplicatoreStipendio;
		return stipendio;
	}

	//Qui non sono obbligato a fare l'override di un metodo concreto
	@Override
	public String stampaInfo() {
		return "Developer: " + super.stampaInfo();
	}

	
}
