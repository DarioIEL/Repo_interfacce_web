package lezione09_eccezioni;

public class _01_ArithmeticExc {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		double r = 0.0;
		
		try {
			r = x/y;
			System.out.println(r);
		}catch (ArithmeticException e) {
			System.out.println("Eccezione aritmetica, stai provando a fare un calcolo non concesso");
//			e.printStackTrace();
		}finally {
			System.out.println("Questo blocco verrà sempre eseguito, con o senza eccezione in corso");
		}
		
		System.out.println("Ciao, sono dopo l'operazione matematica");
		
	}
	
}
