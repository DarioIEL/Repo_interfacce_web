package lezione01_Intro;

public class RecapIntro {

	public static void main(String[] args) {
		
		//dichiaro
		int numero = 10;
		//riassegno
		numero = 20;
		
		double numeroDB = (double) numero;
		System.out.println(numeroDB);
		

		
		
		//senza dichiarare i tipi ma non utilizzato
		var mioNome = "Dario";
		var mioNumero = 2.3;
		var tuoNumero = 5;
		var prodotto = mioNumero * tuoNumero;
		System.out.println(prodotto + " Ciao " + mioNome);
	}
}
