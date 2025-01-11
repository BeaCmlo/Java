package br.ufrn.imd.modelo;

public class Jogo extends Produto{
    private String plataforma;
    private String genero;

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
}
