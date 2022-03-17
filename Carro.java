package br.senai.model;

public class Carro extends Veiculo {
    private int portas;

    public Carro (String nome){
        super(nome);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    public Carro(String nome, String marca, int portas){
        super(nome,marca);
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Portas : " + portas;
    }

}
