package lezione11_Astrazione;

public class Consulente extends Dipendente{

	private double tariffaOraria;
	private double oreLavorate;
	
	public Consulente(String nome, String cognome, String codFisc, String dataAssunzione, double tariffaOraria, double oreLavorate) {
		super(nome, cognome, codFisc, dataAssunzione);
		this.tariffaOraria = tariffaOraria;
		this.oreLavorate = oreLavorate;
	}

	@Override
	public double calcolaStipendio() {
		return tariffaOraria * oreLavorate;
	}

	@Override
	public String getBenefit() {
		return "Nessun benefit";
	}

	
}
