package br.ufrn.imd.modelo;

public class Disco extends Produto {
    private String artista;
    private String generoMusical;

    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getArtista() {
        return artista;
    }
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
    public String getGeneroMusical() {
        return generoMusical;
    }
}
