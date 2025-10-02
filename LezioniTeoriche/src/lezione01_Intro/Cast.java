package lezione01_Intro;

public class Cast {
	
	public static void main(String[] args) {
		int num1 = 12345;
		int num2 = 8;
		
		int somma = num1 + num2;
		int differenza = num1 - num2;
		int prodotto = num1 * num2;
//		devo forzare il dato ad essere di un determinato tipo: cast 
		double divisione = (double) (num1)/ (double) (num2);
		
		System.out.println("le 4 operazioni valgono ");
		System.out.println("Somma " + somma);
		System.out.println("Prodotto " + prodotto);
		System.out.println("Differenza " + differenza);
		System.out.println("Divisione " + divisione);
		
//		CAST tra un tipo più grande ad uno più piccolo
		int i1 = 10, i2 = 30, i3 = 300;
		
		byte b1 = (byte) i1;
		System.out.println(b1);
		
		byte b2 = (byte) i2;
		System.out.println(b2);
		
		
		byte b3 = (byte) i3;
		System.out.println(b3); //ATT: qui perdo il dato
	
		
		//passo da un tipo più piccolo ad uno più grande
		byte b4 = -128;
		int i4 = (int) b4;
		System.out.println(i4);
	}

}
