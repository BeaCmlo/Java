package br.ufrn.imd.modelo;

public class Produto {
    protected String id;
    protected String nome;
    protected double preco;
    protected int diasImprestimo;
    protected boolean disponivel;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Produto() {
        id = "";
        preco =0;
        diasImprestimo = 0;
        disponivel = false;
    }

    public String getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public int getDiasImprestimo() {
        return diasImprestimo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setDiasImprestimo(int diasImprestimo) {
        this.diasImprestimo = diasImprestimo;

    }
}
