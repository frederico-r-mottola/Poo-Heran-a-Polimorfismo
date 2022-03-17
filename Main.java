package br.senai;

import br.senai.model.Caminhao;
import br.senai.model.Carro;
import br.senai.model.Veiculo;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro ("Uno\n");
        carro.setMarca("Fiat");
        carro.setPortas(7);
        System.out.println(carro);

        Caminhao caminhao = new Caminhao("Hotwheels\n");
        caminhao.setMarca("Mercedes");
        caminhao.setPortas(12);
        System.out.println(caminhao);

        Carro carro1 = new Carro("Fusca","Wv",5);
        System.out.println(carro1);
    }
}
