package model;

public class Morador {
	int nmrApartamento;
	String nome;
	Carro carro;
	
	public Morador(int nmrApartamento, String nome) {
		super();
		this.nmrApartamento = nmrApartamento;
		this.nome = nome;
	}

	public int getNmrApartamento() {
		return nmrApartamento;
	}

	public void setNmrApartamento(int nmrApartamento) {
		this.nmrApartamento = nmrApartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
