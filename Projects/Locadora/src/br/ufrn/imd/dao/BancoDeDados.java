package br.ufrn.imd.dao;

import br.ufrn.imd.modelo.Disco;
import br.ufrn.imd.modelo.DvD;
import br.ufrn.imd.modelo.Jogo;
import br.ufrn.imd.modelo.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BancoDeDados {
    private ArrayList <Produto> produtosCadastrados;
    private Map<String, Produto> produtosMapeados;


    public BancoDeDados(){
        produtosCadastrados = new ArrayList<>();
        produtosMapeados = new HashMap<String, Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtosCadastrados.add(produto);
        produtosMapeados.put(produto.getId(), produto);
    }
    public void removerProduto(Produto produto) {
        produtosCadastrados.remove(produto);
        produtosMapeados.remove(produto.getNome());
    }
    public void listarDvDDisponivel(){
        System.out.println("----------------------------------------");
        System.out.println("DvDs disponivel: ");
        for (Produto produto : produtosCadastrados){
            if(produto instanceof DvD && produto.isDisponivel()) {
                System.out.println(getClass());
                System.out.println("ID: " + produto.getId());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: R$ " + String.format("%.2f", produto.getPreco()));
                DvD dvD = (DvD) produto;
                System.out.println(dvD.getDiretor());
                System.out.println(dvD.getGenero());
                System.out.println();
                System.out.println("---------------------------------------");
            }
        }
    }
    
    public void verificarListaVazia(){
        System.out.println("---------------------------------------");
        System.out.println("Verificação da lista");
        if (produtosCadastrados.isEmpty()){
            System.out.println("Nenhum produto encontrado");
            System.out.println("---------------------------------------");
        } else {
            System.out.println("Produtos encontrados: " + produtosCadastrados.size());
            System.out.println("-----------------------------------------");
        }
    }

    public void procurarPorId(String idProcurada){
        Produto produto = produtosMapeados.get(idProcurada);

        if (produto != null) {
            System.out.println("Produto encontrado:");
            System.out.println("ID: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$ " + String.format("%.2f", produto.getPreco()));

            // Identifica o tipo de produto
            if (produto instanceof DvD) {
                System.out.println("Tipo: DvD");
                DvD dvd = (DvD) produto;
                System.out.println("Diretor: " + dvd.getDiretor());
                System.out.println("Gênero: " + dvd.getGenero());
            } else if (produto instanceof Disco) {
                System.out.println("Tipo: Disco");
                Disco disco = (Disco) produto;
                System.out.println("Artista: " + disco.getArtista());
                System.out.println("Gênero musical: " + disco.getGeneroMusical());
            } else if (produto instanceof Jogo) {
                System.out.println("Tipo: Jogo");
                Jogo jogo = (Jogo) produto;
                System.out.println("Plataforma: " + jogo.getPlataforma());
                System.out.println("Gênero do jogo: " + jogo.getGenero());
            }

        } else {
            System.out.println("Produto com ID " + idProcurada + " não encontrado.");
        }

    }

}
