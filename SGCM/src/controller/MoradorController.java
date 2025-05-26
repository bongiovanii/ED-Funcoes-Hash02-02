package controller;

import java.util.Random;

import model.Carro;
import model.Morador;
import br.edu.fateczl.Lista;

public class MoradorController implements IMorador {

	private Lista<Morador>[] predio;

	@SuppressWarnings("unchecked")
	public MoradorController() {
		predio = new Lista[10];
		for (int i = 0; i < predio.length; i++) {
			predio[i] = new Lista<>();
		}
	}

	@Override
	public Morador cadastrarMorador(int i) {
		Random random = new Random();
		int id = random.nextInt(101);
		int numPlaca = random.nextInt(999);
		String nome = "Joao" + i;
		String modelo = "celta" + i;
		String cor = "rosa";
		String placa = numPlaca + "-ABC";

		Morador morador = new Morador();
		Carro carro = new Carro();

		morador.setId(id);
		morador.setNome(nome);
		morador.setNmrApartamento(id % 10); // usa a posição como número de apê

		carro.setCor(cor);
		carro.setModelo(modelo);
		carro.setPlaca(placa);
		carro.setNmrApartamento(morador.getNmrApartamento());

		morador.setCarro(carro);

		hashTable(morador); // armazena na hash
		return morador;
	}

	@Override
	public void consultarMorador(int id) {
		int posicao = id % 10;

		try {
			Lista<Morador> lista = (Lista<Morador>) predio[posicao];
			if (lista == null || lista.isEmpty()) {
				System.out.println("Nenhum morador na posição " + posicao);
				return;
			}
			
			
			int tamanho = lista.size();
	        for (int i = 0; i < tamanho; i++) {
	            Morador m = lista.get(i); 
	            if (m.getId() == id) {
	                System.out.println("Morador encontrado: ");
	                System.out.println("Nome: " + m.getNome());
	                System.out.println("Apartamento: " + m.getNmrApartamento());
	                System.out.println("Carro: " + m.getCarro().getModelo() + " - " + m.getCarro().getPlaca());
	                return;
	            }
	        }
			

		} catch (Exception e) {
			 System.out.println("Erro ao consultar morador: " + e.getMessage());
		}

	}

	@Override
	public void excluirMorador(int id) {
		int posicao = id % 10;

		try {
			Lista<Morador> lista = (Lista<Morador>) predio[posicao];
			if (lista == null || lista.isEmpty()) {
				System.out.println("Nenhum morador na posição " + posicao);
				return;
			}
			
			
			int tamanho = lista.size();
	        for (int i = 0; i < tamanho; i++) {
	            Morador m = lista.get(i); 
	            if (m.getId() == id) {
	                System.out.println("Morador encontrado: ");
	                System.out.println("Nome: " + m.getNome());
	                
	                System.out.println("Excluindo morador " + m.getNome()+ "....");
	                
	                lista.remove(i);
	                
	                System.out.println("Morador " + m.getNome() + " excluido com sucesso");
	                
	                return;
	            }
	        }
			

		} catch (Exception e) {
			 System.out.println("Erro ao consultar morador: " + e.getMessage());
		}
	}

	public void hashTable(Morador morador) {
		int posicao = morador.getId() % 10;

		try {
			if (predio[posicao].isEmpty()) {
				predio[posicao].addFirst(morador);
			} else {
				predio[posicao].addLast(morador);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void imprimirHashTable() {
		for (int i = 0; i < predio.length; i++) {
			System.out.print("Posição " + i + ": ");
			try {
				Lista<Morador> lista = (Lista<Morador>) predio[i];
				if (lista == null || lista.isEmpty()) {
					System.out.println("Vazia");
				} else {
					int tamanho = lista.size();
					for (int j = 0; j < tamanho; j++) {
						Morador m = lista.get(j);
						System.out.print("[" + m.getNome() + " | ID: " + m.getId() + "] ");
					}
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("Erro ao acessar a lista");
			}
		}
	}

	@Override
	public void excluirMorador() {
		// TODO Auto-generated method stub
		
	}

	

}
