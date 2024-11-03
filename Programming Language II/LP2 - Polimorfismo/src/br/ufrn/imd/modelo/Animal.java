package br.ufrn.imd.modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class Animal {
    protected String nome;
    protected Date dataNascimento;
    protected int peso;
    protected boolean alimentado;
    protected String alimentacao;
    protected double quantidadeAlimento;
    protected int idade;

    public void setQuantidadeAlimento(double quantidadeAlimento) {
        this.quantidadeAlimento = quantidadeAlimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

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
        dataNascimento = null;
        peso = 0;
        alimentado = false;
        alimentacao = "";
        quantidadeAlimento = 0;
    }

    public void comer() {
        quantidadeAlimento = peso * (5.0 / 100);

    }


    public void calcularIdade() {

        if (dataNascimento == null) {
            throw new IllegalArgumentException("Data de nascimento não pode ser nula.");
        }

        LocalDate diaNascimento = dataNascimento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate hoje = LocalDate.now();
        idade = Period.between(diaNascimento, hoje).getYears();
    }
}

