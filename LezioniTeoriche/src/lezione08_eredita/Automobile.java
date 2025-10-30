package lezione08_eredita;

//per poter ereditare da una superclasse utilizzo la parola chiave extends. Da questo momento la mia classe Automobile avrà le stesse identiche caratteristiche e metodi della superclasse Veicolo
public class Automobile extends Veicolo{
	
	private int numeroPorte;

	public Automobile(String marca, String modello, int annoProduzione, int numRuote, int numeroPorte) {
		//Questo super chiama direttamente il costruttore della superclasse Veicolo
		super(marca, modello, annoProduzione, numRuote);
		this.numeroPorte = numeroPorte;
	}

	
	//L'automobile ha l'aria condizionata quindi posso specificare un metodo SOLO di questa classe e non della superclasse
	public void accendiAC() {
		System.out.println("Sto accendendo l'aria condizionata nell'auto ");
	}


	//Sovrascrivo un metodo della superclasse andando ad aggiungere un pezzo in più
	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Numero porte: " + this.numeroPorte);
	}


	//posso anche sovrascrivere completamente un metodo, non è obbligatorio
	@Override
	public void start() {
		System.out.println("Sto accendendo la mia Automobile");
	}
	
	
	
	
	
}
