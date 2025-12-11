package lezione12_Interfacce;

public class InterfacciaImpl implements MiaPrimaInterfaccia {

	private String nome;
	
	public InterfacciaImpl(String nome) {
		this.nome = nome;
	}

	@Override
	public void primoMetodo() {
		System.out.println("Sono nella classe e questo è il primo metodo");
	}

	@Override
	public String secondoMetodo() {
		return "Sono nel secondo metodo";
	}

	@Override
	public Integer terzoMetodo() {
		return 5;
	}

	@Override
	public Boolean quartoMetodo() {
		return true;
	}

	
}
