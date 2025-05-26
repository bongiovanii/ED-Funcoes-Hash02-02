package view;

import controller.MoradorController;

public class Estacionamento {
    public static void main(String[] args) {
        MoradorController mrc = new MoradorController();

        for (int i = 0; i < 10; i++) {
            mrc.cadastrarMorador(i);
        }

        mrc.imprimirHashTable();
    }
}
