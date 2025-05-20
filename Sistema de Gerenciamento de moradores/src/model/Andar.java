package model;

public class Andar {
	Morador morador;
	int andar;
	
	public Andar(Morador morador, int andar) {
		super();
		this.morador = morador;
		this.andar = andar;
	}
	
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	
	
}
