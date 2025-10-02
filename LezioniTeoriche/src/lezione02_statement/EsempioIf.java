package lezione02_statement;

import java.util.Date;

public class EsempioIf {
	public static void main(String[] args) {
		int oraDelGiorno = 14;
		

		if(oraDelGiorno < 0 && oraDelGiorno > 24) {
			System.out.println("Ora non valida !!!");
		}else if((oraDelGiorno >= 22 && oraDelGiorno <= 24) || (oraDelGiorno >= 0 && oraDelGiorno<5)) {
			System.out.println("Buonanotte");
		}else if(oraDelGiorno >= 5 && oraDelGiorno < 12) {
			System.out.println("Buongiorno");
		}else if(oraDelGiorno>=12 && oraDelGiorno < 16) {
			System.out.println("Buon pomeriggio");
		}else if(oraDelGiorno>=16 && oraDelGiorno<22) {
			System.out.println("Buona sera");
		}
		
		//In base all'ora scritta nella variabile inserisci il saluto: buongiorno(5-12), buon pomeriggio (12-16), buonasera (16-22), buonanotte(22-5)
	}
}
