package lezione11_Astrazione;

public class TestDipendenti {

	public static void main(String[] args) {
		Dipendente[] organico = {
				new InternoFullTime("Paolo", "Rossi", "PR9087LKJD89J", "01/01/2024", 1250, 300),
				new InternoFullTime("Anna", "Verdi", "ANNVRD323LKJD89J", "03/02/2024", 1580, 500),
				new Consulente("Dario", "Mennillo", "MNNDRA98u3uhcw", "04/03/2021", 30 , 600),
	
		};
		
		GestoreDipendenti gD = new GestoreDipendenti(organico);
		
		gD.stampaReport();
		
		//piccolo esempio di polimorfismo
		System.out.println("=== Lista nomi dipendenti ===");
		for (Dipendente dipendente : organico) {
			System.out.println(dipendente.getNome());
		}
	}
}
