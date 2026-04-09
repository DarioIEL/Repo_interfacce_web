package gestionePokemon;

public abstract class Pokemon {

	private String nome;
	private int hp;
	private int livello;
	
	public Pokemon(String nome, int hp, int livello) {
		this.nome = nome;
		this.hp = hp;
		this.livello = livello;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}


	public abstract void attacca();
	
}
