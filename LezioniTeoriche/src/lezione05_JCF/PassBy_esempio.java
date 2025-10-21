package lezione05_JCF;

public class PassBy_esempio {

	//Pass By Value: quando passo una variabile ad un metodo viene costruita una copia del valore della variabile. Quando modifico, dentro il metodo, la variabile non influisce sulla variabile originale.
	public static void modificaValore(int n) {
		n = 10; //qui sto cambiando il valore di una copia non della variabile che passerà
		System.out.println("Il numero n vale: " + n);
	
	}
	
	//Pass By Reference: passando un oggetto ad un metodo viene passata una copia del RIFERIMENTO all'oggetto. Quindi sia la copia sia il riferimento puntano alla area di memoria
	static class Persona{
		String nome;
	}
	
	public static void modificaNome(Persona pers) {
		pers.nome = "Dario";
		System.out.println("Sono nel metodo e il nome é: " + pers.nome);
	}
	
	public static void modificaValoreInteger (Integer n) {
		n = 10;
		System.out.println("Il numero n vale: " + n);
	}
	
	public static void main(String[] args) {
		//PASS BY VALUE
		int numero = 40;
		modificaValore(numero);
		System.out.println("Fuori dal metodo il numero vale " + numero);
		
		//PASS BY REFERENCE. In questo caso sto passando il riferimento
		Persona nuovaPers = new Persona();
		nuovaPers.nome = "Anna";
		modificaNome(nuovaPers);
		System.out.println("Fuori dal metodo il nome è: " + nuovaPers.nome);
		
		
		//ATT: pur essendo un oggetto continua a comportarsi come un primitivo 
		Integer mioNumero = 50;
		modificaValoreInteger(mioNumero);
		System.out.println("Fuori dal metodo vale: " + mioNumero);
	}
	
	
//	OSS: 
//	Con i primitivi viene sempre passata una copia del valore
//	Con gli oggetti viene sempre passata una copia del riferimento
	
}
