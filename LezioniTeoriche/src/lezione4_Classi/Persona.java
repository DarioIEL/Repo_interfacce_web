package lezione4_Classi;

public class Persona {
//STATO DELLA CLASSE. Caratteristiche o proprietà
	public String nome;
	public String cognome;
	public int eta;
	public String codFisc;
	public double altezza;
	public int matricola;
	
	//Metodo Costruttore
	public Persona(String nome, String cognome, int eta, String codFisc, double altezza) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.codFisc = codFisc;
		this.altezza = altezza;
		this.matricola = matricolatore();
	}
	
	public static int matricolatore() {
		int matricola = (int) Math.ceil(Math.random() * 100);
		return matricola;
	}
	
	//Faccio l'overload del metodo saluta
	
	public String saluta(String nome) {
		String saluto = "Ciao " + nome + " io sono " + this.nome + " e ho " + this.eta + " anni. ";
		return saluto;
	}
	
	public String saluta(String nome, double altezzaSalto) {
		String saluto = "Ciao " + nome + " io sono " + this.nome + " e ho " + this.eta + " anni. Sai che quando salto raggiungo un'altezza di " + salta(altezzaSalto) + " metri." ;
		return saluto;
	}
	
	public double salta(double altezzaSalto) {
		double altezzaFinale = altezzaSalto + this.altezza;
		return altezzaFinale;
	}
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", codFisc=" + codFisc + ", altezza="
				+ altezza + ", matricola=" + matricola + "]";
	}
	
	
	
}
