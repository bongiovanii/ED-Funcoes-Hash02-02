package controller;

import model.Morador;

public interface IMorador {
	public Morador cadastrarMorador(int i);
	public void consultarMorador();
	public void excluirMorador();
	
}
