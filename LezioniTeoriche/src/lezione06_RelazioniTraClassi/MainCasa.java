package lezione06_RelazioniTraClassi;

public class MainCasa {
	public static void main(String[] args) {

		Casa miaCasa = new Casa("via Tal dei Tali", 10);
		
		Stanza cucina = new Stanza("cucina", 20);
		Stanza soggiorno = new Stanza("soggiorno", 35);
		Stanza bagno = new Stanza("bagno", 9);
		Stanza camera = new Stanza("camera", 25);
		
		miaCasa.aggiungiStanza(cucina);
		miaCasa.aggiungiStanza(soggiorno);
		miaCasa.aggiungiStanza(bagno);
		miaCasa.aggiungiStanza(camera);
		
		miaCasa.rimuoviStanza(1);
		miaCasa.rimuoviStanza(cucina);
		
		miaCasa.addVanoAcc(new Stanza("garage", 16));
		
		miaCasa.calcolaSuperfTotale();
		miaCasa.visualizzaCasa();
		miaCasa.calcolaPrezzo();
		
	}
}
