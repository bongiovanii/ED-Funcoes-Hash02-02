package model;

public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private Morador morador;
    private int nmrApartamento;

    public Carro() {}

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

    public int getNmrApartamento() {
        return nmrApartamento;
    }

    public void setNmrApartamento(int nmrApartamento) {
        this.nmrApartamento = nmrApartamento;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
        if (morador != null) {
            this.nmrApartamento = morador.getNmrApartamento();
        }
    }
}
