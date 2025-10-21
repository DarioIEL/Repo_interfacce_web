package lezione06_RelazioniTraClassi;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	String indirizzo;
	int numCivico;
	double area;
	boolean abitata;
	List<Stanza> stanze = new ArrayList<>();
	
	public Casa(String indirizzo, int numCivico) {
		this.indirizzo = indirizzo;
		this.numCivico = numCivico;
	}
	
	public void aggiungiStanza(Stanza stanza) {
		this.stanze.add(stanza);
	}
	
	public void rimuoviStanza(int indiceStanza) {
		this.stanze.remove(indiceStanza);
	}
	
	public void rimuoviStanza(Stanza stanza) {
		this.stanze.remove(stanza);
	}

	
	public double calcolaSuperfTotale() {
		double areaTotale = 0;
		
		for (Stanza stanza : stanze) {
			areaTotale += stanza.superficie;
		}
		this.area = areaTotale;
		return areaTotale;
	}

	public void calcolaPrezzo() {
		double prezzoFinale = 1500 * this.area;
		System.out.println("Costo casa: " + prezzoFinale + " €");
	}
	
	
	public void addVanoAcc(Stanza stanza) {
		if(stanza.nome.equalsIgnoreCase("cantina") || stanza.nome.equalsIgnoreCase("soffitta") || stanza.nome.equalsIgnoreCase("garage")) {
			this.aggiungiStanza(stanza);
		}else {
			System.out.println("Vano accessorio non corrispondente");
		}
	}
	
	public void visualizzaCasa() {
		System.out.println("La casa si trova in: " + this.indirizzo + " " + this.numCivico);
		System.out.println("Composizione della casa:");
		for (Stanza stanza : stanze) {
			System.out.println("Stanza n° " + stanza.id + " - " + stanza.nome + " - area: " + stanza.superficie);
		}
		
		System.out.println("Area Totale: " + this.area + " mq");
	}

	@Override
	public String toString() {
		return "Casa [indirizzo=" + indirizzo + ", numCivico=" + numCivico + ", area=" + area + ", stanze=" + stanze
				+ "]";
	}
	
	
}

