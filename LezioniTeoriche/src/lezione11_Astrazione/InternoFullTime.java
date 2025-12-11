package lezione11_Astrazione;

public class InternoFullTime extends Dipendente {

	private double stipendioBase;
	private double bonus;
	
	public InternoFullTime(String nome, String cognome, String codFisc, String dataAssunzione, double stipendioBase, double bonus) {
		super(nome, cognome, codFisc, dataAssunzione);
		this.bonus = bonus;
		this.stipendioBase = stipendioBase;
	}

	@Override
	public double calcolaStipendio() {
		return stipendioBase + bonus;
	}

	@Override
	public String getBenefit() {
		return "Abbonamento in palestra - Buoni pasto";
	}

	
}
