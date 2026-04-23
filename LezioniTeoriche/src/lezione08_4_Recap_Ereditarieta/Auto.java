package lezione09_Recap_Ereditarieta;

//Una classe concreta può ereditare da UNA SOLA altra classe (concreta o astratta)
public class Auto extends Veicolo{

	private int numeroPorte;
	
	public Auto(String marca, String modello, int annoProd, int numRuote, int numeroPorte) {
		//richiamo il costruttore della superclasse Veicolo
		super(marca, modello, annoProd, numRuote);
		this.numeroPorte = numeroPorte;
	}


	public int getNumeroPorte() {
		return numeroPorte;
	}
	
//	public int getNumeroPorte(int numeroPortelloni) {
//		return numeroPorte + numeroPortelloni;
//	}
//	
//	public int getNumeroPorte(int numeroPortelloni, int numeroTetto) {
//			return numeroPorte + numeroPortelloni + numeroTetto;
//	}
//	
//	public int getNumeroPorte(String porteBasculanti) {
//		System.out.println("Ci sono delle porte baculanti chiamate: " + porteBasculanti);
//		return 0;
//	}
//	

	//Posso sviluppare dei metodi personalizzati
	public void accendiAC() {
		System.out.println("Hai acceso l'aria condizionata");
	}

	//Inm questo toString richiamo il toString di super
	@Override
	public String toString() {
		return "Auto [numeroPorte=" + numeroPorte + ", toString()=" + super.toString() + "]";
	}
	
	//le prop che esistono nella superclasse sono accessibili grazie al mod protected
//	public void stampaInformazioni() {
//		System.out.println("Automobile info:\n" + this.marca + " " + this.modello + "\nAnno produzione: " + this.annoProd);
//	}
	
	//Posso fare l'override di qualsiasi metodo
	@Override
	public String getInfo() {
		return "Automobile:\n" + super.getInfo();
	}
	

}
