package lezione02_statement;

import java.util.Date;

public class EsempioIf {
	public static void main(String[] args) {
		int oraDelGiorno = 21;
		

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
	
//		Un sistema di sicurezza fa scattare un allarme se la temp è maggiore di 40° oppure se l'umidità supera il 75%
		
		int temp = 43;
		int umid = 80;
		
		if(temp >= 40 || umid >= 75) {
			System.out.println("ALLARME: uno dei valori sta superando la soglia");
			
			String avvisoSoglie = "";
			
			if(temp >= 40) {
				avvisoSoglie += "Att: la temperatura è oltre la soglia. Valore attuale: " + temp + "° ";
			}
			
			if(umid >= 75) {
				avvisoSoglie += "\nAtt: l'umidità è oltre la soglia. Valore attuale: " +  umid +  "%";
			}
			
			System.out.println(avvisoSoglie);
			
		}else {
			System.out.println("Tutto ok");
		}
		
	
		
		int mioNum = 0;
		
		mioNum = 2;
		mioNum = 6;
		
		System.out.println(mioNum);
		
		String saluto  = "";
		
		saluto += "Ciao Dario, come stai ?";
		saluto += "\nCosa fai oggi ?";
		
		System.out.println(saluto);
		
		
		
		
	
	}
}
