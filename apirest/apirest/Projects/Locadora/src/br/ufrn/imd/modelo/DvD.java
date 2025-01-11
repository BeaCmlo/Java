package br.ufrn.imd.modelo;

public class DvD extends Produto {
    private String diretor;
    private String genero;
    private int duracaoMinutos;

    public DvD() {
        super();
        diretor = "";
        genero = "";
        duracaoMinutos = 0;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
