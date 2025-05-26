package controller;

import model.Morador;

public interface IMorador {
	public Morador cadastrarMorador(int i);
	public void excluirMorador();
	void consultarMorador(int id);
	void excluirMorador(int id);
	
}
