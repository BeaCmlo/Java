package br.ufrn.imd.modelo;
import br.ufrn.imd.modelo.Animal;

public class Tigre extends Animal {
    private String tipoTigre;



    public Tigre () {
        super();
        tipoTigre = "";
    }



    public String getTipoTigre() {
        return tipoTigre;
    }



    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }

    @Override
    public void comer() {
        quantidadeAlimento = peso * (15.0/100);
    }
}
