package br.ufrn.imd.visao;
import br.ufrn.imd.dao.BancoDeDados;
import br.ufrn.imd.modelo.Disco;
import br.ufrn.imd.modelo.DvD;
import br.ufrn.imd.modelo.Produto;

public class LocadoraGandalf {
    public static void main(String[] args) {

        DvD dvd1 = new DvD();
        dvd1.setNome("Gandalf");
        dvd1.setDiretor("Cornelio Dante");
        dvd1.setGenero("Comédia");
        dvd1.setId("123");
        dvd1.setDisponivel(true);
        dvd1.setPreco(3.80);

        DvD dvd2 = new DvD();
        dvd2.setNome("A Jornada Inesperada");
        dvd2.setDiretor("Peter Oak");
        dvd2.setGenero("Aventura");
        dvd2.setId("122");
        dvd2.setDisponivel(true);
        dvd2.setPreco(5.90);

        DvD dvd3 = new DvD();
        dvd3.setNome("O Guerreiro do Futuro");
        dvd3.setDiretor("Linda Knight");
        dvd3.setGenero("Ação");
        dvd3.setId("125");
        dvd3.setDisponivel(false);
        dvd3.setPreco(4.50);

        DvD dvd4 = new DvD();
        dvd4.setNome("Mistério da Meia-Noite");
        dvd4.setDiretor("Sara Parker");
        dvd4.setGenero("Suspense");
        dvd4.setId("126");
        dvd4.setDisponivel(false);
        dvd4.setPreco(5.80);

        DvD dvd5 = new DvD();
        dvd5.setNome("As Crônicas do Tempo");
        dvd5.setDiretor("John Maverick");
        dvd5.setGenero("Fantasia");
        dvd5.setId("128");
        dvd5.setDisponivel(true);
        dvd5.setPreco(4.80);

        Disco disco1 = new Disco();
        disco1.setNome("Os clássicos de David Bowie");
        disco1.setArtista("David Bowie");
        disco1.setId("130");
        disco1.setGeneroMusical("Rock/Pop");
        disco1.setPreco(4.90);

        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.adicionarProduto(dvd1);
        bancoDeDados.adicionarProduto(dvd2);
        bancoDeDados.adicionarProduto(dvd3);
        bancoDeDados.adicionarProduto(dvd4);
        bancoDeDados.adicionarProduto(dvd5);
        bancoDeDados.adicionarProduto(disco1);

        bancoDeDados.verificarListaVazia();
        bancoDeDados.listarDvDDisponivel();
        bancoDeDados.procurarPorId("130");

    }
}