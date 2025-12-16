package lezione13_PatternDAO;

public class Studente {

	private String nome;
	private int rollNo;

	public Studente(String nome, int rollNo) {
		this.nome = nome;
		this.rollNo = rollNo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", rollNo=" + rollNo + "]";
	}
	
}
