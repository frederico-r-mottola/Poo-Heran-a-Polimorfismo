package br.senai.model;

public class Caminhao extends Veiculo{
    private int portas;
    public Caminhao (String nome){
        super(nome);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPortas : " + portas ;
    }
}
