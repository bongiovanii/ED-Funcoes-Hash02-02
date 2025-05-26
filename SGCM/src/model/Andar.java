package model;

import java.util.Objects;

public class Andar {
	int num;
	Morador morador;

	public Andar(int num, Morador morador) {
		super();
		this.num = num;
		this.morador = morador;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}



}
