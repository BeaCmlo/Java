package br.ufrn.imd.modelo;

public class Elefante extends Animal {
    private int tamanhoTromba;



    public int getTamanhoTromba() {
        return tamanhoTromba;
    }



    public void setTamanhoTromba(int tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }

    public Elefante() {
        super();
        tamanhoTromba = 0;
    }

    public void comer(){
        quantidadeAlimento = peso * (15.0/100);
    }
}
