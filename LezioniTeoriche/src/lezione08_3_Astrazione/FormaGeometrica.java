package lezione11_Astrazione;

public abstract class FormaGeometrica {
	
	//Posso avere delle proprietà
	protected String nome;
	protected String colore;
	
	//Posso avere ( ma anche no ) un costruttore pur essendo la classe astratta NON istanziabile
	public FormaGeometrica(String nome, String colore) {
		this.nome = nome;
		this.colore = colore;
	}
	
	//Sviluppo dei metodi astratti SENZA CORPO. Questi metodi dovranno obbligatoriamente essere implementati dalle sottoclassi
	abstract double calcolaArea();
	abstract double calcolaPerimetro();
	
	//Posso però anche avere dei metodi concreti che sfruttano i metodi astratti sapendo che questi verranno implementati obbligatoriamente nella sottoclasse
	public void mostraInfo() {
		System.out.println("Forma: " + nome + " - Colore: " + colore + " - Valore area " + calcolaArea() + " - Valore Perimetro: " + calcolaPerimetro());
	}
	
}
