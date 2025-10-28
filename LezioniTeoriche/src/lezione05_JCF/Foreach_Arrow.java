package lezione05_JCF;

import java.util.Arrays;
import java.util.List;

public class Foreach_Arrow {
	public static void main(String[] args) {

		List<String> cognomi = Arrays.asList("Rossi", "Verdi", "Gialli");

//	cognomi.forEach(new Consumer<String>() {
//		
//		@Override
//		public void accept(String elemento) {
//			System.out.println(elemento);
//		}
//	});


		cognomi.forEach((cognome) ->
			System.out.println(cognome)
			);

		//DA SPIEGARE
		cognomi.stream()
		.map(cog -> cog + " ciao")
		.forEach(c -> System.out.println(c));
	}
}
