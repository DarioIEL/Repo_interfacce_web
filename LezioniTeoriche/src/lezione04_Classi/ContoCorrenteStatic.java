package lezione5_Classi;

public class ContoCorrenteStatic {
	
	private static int numeroConto; //Questa è una prop che appartiene alla classe. Viene generata una sola copia in memoria che risulta essere indipendente dal numero di istanze create
	private String proprietario;
	private double saldo;
	private static final String BANCA = "Banca I&L"; //Costruisco una costante condivisa per tutte le istanze della classe ContoCorrente
	
	

	public ContoCorrenteStatic(String proprietario, double saldo) {
		this.proprietario = proprietario;
		this.saldo = saldo;
		numeroConto++; //posso accedere alle prop static da tutti i metodi
	}
	
	public void deposita(double importo) {
		this.saldo += importo;
		System.out.println("Hai depositato " + importo + " €. Il tuo saldo attuale è: " + saldo + " €");
		
	}
	
	public void getInfoConto() {
		System.out.println("Proprietario: " + proprietario + "\nNumero Conto: " + numeroConto + "\nSaldo: "+  saldo + "Grazie da: " + BANCA);
	}
	
	public static int getNumeroConto() {
		//Nei metodi static non posso accedere alle prop, varibili o metodi d'istanza (cioè quelli non static)
		return numeroConto;
	}


	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	

}
