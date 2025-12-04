package lezione09_eccezioni;

public class _02_EccezioniArray {

	public static void main(String[] args) {
		
		int[] mioArray = new int[4];
		mioArray[0] = 10;
		mioArray[1] = 20;
		mioArray[2] = 30;
		mioArray[3] = 40;
		
		String[] frutta = {"mele", "pera", "banana", "arancia"};
		
		try {
			String s = frutta[2];
			int l = s.length();
			System.out.println( 10 / 0);
			System.out.println(frutta[l]);

		}catch (ArithmeticException e) {
			System.out.println("Eccezione aritmetica");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Eccezione Array");
		}
		catch (Exception e) {
			System.out.println("Operazione non valida");
		}
		
	
	}
}
