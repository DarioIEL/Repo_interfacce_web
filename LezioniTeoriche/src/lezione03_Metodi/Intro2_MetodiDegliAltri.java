package lezione03_Metodi;

public class Intro2_MetodiDegliAltri {

	public static void main(String[] args) {
		System.out.println("Sto utilizzando i metodi di altre classi");
		//Posso utilizzare metodi static di altre classi però devono essere obbligatoriamente public
		//ATT: succede solo con gli static: nomeClasse.nomeMetodo();
		Intro.salutaDocente();
		Intro.salutaRespo("Egle Risola", "Elementi di programmazione");
	}
	
}
