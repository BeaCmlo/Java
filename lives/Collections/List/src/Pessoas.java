package src;

public class Pessoas {
    String nome;
    int id;

    public Pessoas(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public int getId() {return this.id;}

    public String getNome() {return this.nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String toString() {
        return "Nome: " + this.nome + "\nId: " + this.id;
    }
}
