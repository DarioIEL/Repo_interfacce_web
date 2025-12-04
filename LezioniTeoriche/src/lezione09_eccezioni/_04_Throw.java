package lezione09_eccezioni;

public class _04_Throw {

	public static void stampaTesto2(String testo) {
		try {
			System.out.println("Questo è il testo: " + testo);
		}catch (Exception e){
			//Ignoro l'eccezione
		}
	}
	
	//Qui genero un'eccezione completamente personalizzata. ATT: tutti i metodi che throws una exception sono da gestire, per forza, con un try & catch
	public static void stampaTesto3(String testo) throws MieJavaException, ArithmeticException, ArrayIndexOutOfBoundsException {
		if(testo == null) {
			throw new MieJavaException();
		} else if(testo == "Ciao") {
			throw new ArithmeticException();
		}else if (testo == "Addio") {
			throw new ArrayIndexOutOfBoundsException();
		}
	}	
	
	public static void calcola(int divisore) {
		if(divisore == 0) {
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) {
		
		//Richiamo stampaTesto2 nella quale ho ignorato l'eccezione
		stampaTesto2(null);
		
//		System.out.println("Il programma non viene interrotto");
		
		try {
			stampaTesto3("Addio");
		} catch (MieJavaException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Eccezione Aritmetica");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Eccezione di Array");
		}
		
		try {
			calcola(0);
			
		} catch (ArithmeticException e ) {
			System.out.println("Stai tentando di dividere per 0");
		}
		
		
		try {
			stampaTesto3("Addio");
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | MieJavaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
