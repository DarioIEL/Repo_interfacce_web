package giochi;

public class Triangoli {

	//Crea un programma per stampare i seguenti starpattern
//	Es1:
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
//
//		Es2:
//		*
//		* *
//		* * *
//		* * * *
//		* * *
//		* *
//		*
//
//		Es3:
//		     *
//		    * *
//		   * * *
//		  * * * *
//		 * * * * *
//
//		Es4
//		     *
//		    * *
//		   *   *
//		  *     *
//		 * * * * *  
	
	
	public static void triang1() {
		int n = 6; //numero di righe
	
		//Questo regola le righe
		for(int i = 1; i <= n; i++) {
			
			//Questo regola le colonne
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	
	public static void triang2() {
		int n = 6; //num righe
		
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		triang1();
		
		System.out.println("Triangolo retto al rovescio");
		
		triang2();
	}
}
