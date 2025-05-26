package model;

public class Morador {
	int id;
	int nmrApartamento;
	String nome;
	Carro carro;

	public Morador() {
		super();
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
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public Carro getCarro() {
		return carro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	

}
