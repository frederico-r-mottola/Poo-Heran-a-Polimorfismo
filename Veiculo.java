package br.senai.model;

public abstract class Veiculo {
    private String nome;
    private String marca;

    public Veiculo(String nome)
    {
        this.nome = nome;
    }
    public Veiculo(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "\nNome : " + nome + " \nMarca : " + marca ;
    }
}

