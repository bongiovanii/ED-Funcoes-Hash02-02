package model;

public class Carro {
	private String modelo;
	private String cor;
	private String placa;
	private Morador morador;
	private int cracha = morador.nmrApartamento;

	public Carro(String modelo, String cor, String placa, int cracha) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.cracha =  cracha;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCracha() {
		return cracha;
	}

	public void setCracha(int cracha) {
		this.cracha = cracha;
	}
	
	
	
	
	
	
	
}
