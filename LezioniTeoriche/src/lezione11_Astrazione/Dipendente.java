package lezione11_Astrazione;

public abstract class Dipendente {

	protected String nome;
	protected String cognome;
	protected String codFisc;
	protected String dataAssunzione;
	
	
	public Dipendente(String nome, String cognome, String codFisc, String dataAssunzione) {
		this.nome = nome;
		this.cognome = cognome;
		this.codFisc = codFisc;
		this.dataAssunzione = dataAssunzione;
	}
	

	public abstract double calcolaStipendio();
	
	public abstract String getBenefit();
	
	public String getNome() {
		return this.nome + " " + this.cognome;
	}
	
	public String getDataAssunzione() {
		return "Sei stato assunto il: " + this.dataAssunzione;
	}
	
	public void stampaInfo() {
		System.out.println(getNome());
		System.out.println("C.F. " + this.codFisc);
		System.out.println(getDataAssunzione());
		System.out.println("Stipendio: " + calcolaStipendio());
		System.out.println("Benefit assegnati: " + getBenefit());
	}
}
