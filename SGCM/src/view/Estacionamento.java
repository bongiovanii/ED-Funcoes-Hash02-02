package view;

import java.util.Scanner;

import controller.MoradorController;

public class Estacionamento {
	public static void main(String[] args) {
		MoradorController mrc = new MoradorController();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			mrc.cadastrarMorador(i);
		}

		mrc.imprimirHashTable();

		
		int opc = 0;
		while (opc != 9) {
			System.out.println("\n Deseja consultar um morador? Ou excluir um morador?");
			System.out.println("\n 1-Consultar \n 2-Excluir \n 9-Sair");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				System.out.println("Digite o Id a ser consultado: ");
				int idConsulta = sc.nextInt();
				mrc.consultarMorador(idConsulta);
				break;
			}
			case 2: {
				System.out.println("Digite o Id do morador a ser excluido: ");
				int idConsulta = sc.nextInt();
				mrc.excluirMorador(idConsulta);
				break;
			}
			case 9:{
				System.out.println("Saindo do sistema...");
				break;
			}
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);
			}
			
		}
		
		sc.close();
	}
}
