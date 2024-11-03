package br.ufrn.imd.modelo;

import java.util.Date;

public class Animal {
    protected String nome;
    protected Date dataNascimento;
    protected int peso;
    protected boolean alimentado;
    protected String alimentacao;
    protected double quantidadeAlimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isAlimentado() {
        return alimentado;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public double getQuantidadeAlimento() {
        return quantidadeAlimento;
    }

    public void setQuantidadeAlimento(int quantidadeAlimento) {
        this.quantidadeAlimento = quantidadeAlimento;
    }

    public Animal() {
        nome = "";
        //dataNascimento = 00/00/0000;
        peso = 0;
        alimentado = false;
        alimentacao = "";
        quantidadeAlimento = 0;
    }

    public void comer() {
        quantidadeAlimento = peso * (5.0/100);

    }


    /*public int calcularIdade(Animal animal) {

		return ;
	}
	*/

}
