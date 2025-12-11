package lezione12_Interfacce;

public interface MiaPrimaInterfaccia {
	
	String TIPO = "Ciao";
	//Tradizionalmente (prima di Java 8) le interfacce sono un elenco di metodi seva implementazione
	
	//ATT: i metodi sono implicitamente public abstract
	void primoMetodo();
	String secondoMetodo();
	Integer terzoMetodo();
	Boolean quartoMetodo();
	
	//Posso anche dichiarare delle costanti
	//ATT: le costanti sono public abstract finall
	int COSTANTE = 1;
	
	//A partire da Java 8 posso anche avere dei metodi statici
	static void metodoDellaInterfaccia() {
		System.out.println("Sono un metodo statico dell'interfaccia ");
	}
	

}
