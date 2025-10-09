package giochi;

public class Multipli {

	public static void calcolaMultipli35() {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " BANGARANG");
			}else if(i % 3 == 0) {
				System.out.println(i + " ZOOM");
			}else if (i % 5 == 0) {
				System.out.println(i + " BOOM");
			}else {
				System.out.println(i);
			}
		}	
	}
	
	// nel caso in cui si vuole testare solo una classe, solo un metodo posso usare il main in questa classe

	public static void main(String[] args) {
		calcolaMultipli35();
	}
	
	
}
