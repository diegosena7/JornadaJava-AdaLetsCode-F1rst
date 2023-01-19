package orientacao_objetos_solid.project.exercicio_livraria;

import orientacao_objetos_solid.project.exercicio_livraria.enums.Generos;
import orientacao_objetos_solid.project.exercicio_livraria.enums.TiposProdutos;
import orientacao_objetos_solid.project.exercicio_livraria.estoques.Estoque;
import orientacao_objetos_solid.project.exercicio_livraria.extende.Brinquedos;
import orientacao_objetos_solid.project.exercicio_livraria.extende.Filmes;
import orientacao_objetos_solid.project.exercicio_livraria.extende.Livros;
import orientacao_objetos_solid.project.exercicio_livraria.extende.Musica;
import orientacao_objetos_solid.project.exercicio_livraria.financeiro.Caixa;


import static java.util.Collections.*;

public class Livraria {
    public static void main(String[] args) {

        Livros livro1 = new Livros("A Arte da Guerra", 1, 25.00, Generos.AVENTURA, "Robert Sims","Editora Globo");
        Livros livro2 = new Livros("Domain Drive Design", 2, 50.00, Generos.TECNOLOGIA, "Eric Evans","DDD");
        Estoque<Livros> estoqueLivros = new Estoque<>();
        estoqueLivros.adicionaItemAoEstoque(livro1);
        estoqueLivros.adicionaItemAoEstoque(livro2);

        sort(estoqueLivros.buscaItensDoEstoque());

        System.out.println("----------LIVROS ORDENADOS-------------");
        System.out.println(estoqueLivros.buscaItensDoEstoque());

        estoqueLivros.removeItemEmEstoque(livro2);
        System.out.println(estoqueLivros.buscaItensDoEstoque());

        estoqueLivros.atualizaProdutoEmEstoque(livro2);
        System.out.println(estoqueLivros.buscaItensDoEstoque());
        System.out.println("Livro encontrado: " + estoqueLivros.buscaProdutoPorNome(livro1));

        System.out.println();
        Brinquedos brinquedo1 = new Brinquedos("Lego", 1, 150.0, "Diversao");
        Brinquedos brinquedo2 = new Brinquedos("PS5", 2, 4450.0, "Video-Games");
        Brinquedos brinquedo3 = new Brinquedos("Lego-StarWars", 1, 150.0, "Diversao");
        Estoque<Brinquedos> estoqueBrinquedos = new Estoque<>();
        estoqueBrinquedos.adicionaItemAoEstoque(brinquedo1);
        estoqueBrinquedos.adicionaItemAoEstoque(brinquedo2);
        estoqueBrinquedos.adicionaItemAoEstoque(brinquedo3);

        System.out.println("----------BRINQUEDOS ORDENADOS-------------");
        sort(estoqueBrinquedos.buscaItensDoEstoque());
        System.out.println(estoqueBrinquedos.buscaItensDoEstoque());

        estoqueBrinquedos.removeItemEmEstoque(brinquedo2);
        estoqueBrinquedos.atualizaProdutoEmEstoque(brinquedo3);
        System.out.println(estoqueBrinquedos.buscaItensDoEstoque());
        System.out.println("Brinquedo encontrado: " + estoqueBrinquedos.buscaProdutoPorNome(brinquedo1));

        System.out.println();
        Filmes filme1 = new Filmes("Todo mundo em pânico", 1, 25.0, Generos.COMEDIA, "Kadu", "Diego","ADA");
        Filmes filme2 = new Filmes("A era do gelo", 2, 35.0, Generos.FICCAO, "Diego", "Kadu","ADA");
        Filmes filme3 = new Filmes("Efeito Borboleta", 1, 35.0, Generos.COMEDIA, "Kadu", "Diego","ADA");
        Estoque<Filmes> estoqueFilmes = new Estoque<>();
        estoqueFilmes.adicionaItemAoEstoque(filme1);
        estoqueFilmes.adicionaItemAoEstoque(filme2);
        estoqueFilmes.adicionaItemAoEstoque(filme3);
        System.out.println("----------FILMES ORDENADOS-------------");
        sort(estoqueFilmes.buscaItensDoEstoque());
        System.out.println(estoqueFilmes.buscaItensDoEstoque());
        estoqueFilmes.removeItemEmEstoque(filme2);
        estoqueFilmes.atualizaProdutoEmEstoque(filme3);
        System.out.println("Filme encontrado: " + estoqueFilmes.buscaProdutoPorNome(filme1));

        System.out.println();
        Musica musica1 = new Musica("Vida Loka", 1, 15.00, Generos.RAP, "Racionais", "Rap-Naional");
        Musica musica2 = new Musica("Por 1 Minuto", 2, 25.00, Generos.SERTANEJO, "Bruno e Marrone", "Sertanejo-Raiz");
        Musica musica3 = new Musica("Vida Loka PT1", 1, 20.00, Generos.RAP, "Racionais", "RapNaional");
        Estoque<Musica> estoqueMusicas = new Estoque<>();
        estoqueMusicas.adicionaItemAoEstoque(musica1);
        estoqueMusicas.adicionaItemAoEstoque(musica2);
        estoqueMusicas.adicionaItemAoEstoque(musica3);
        System.out.println("----------MUSICAS ORDENADOS-------------");
        sort(estoqueMusicas.buscaItensDoEstoque());
        System.out.println(estoqueBrinquedos.buscaItensDoEstoque());
        estoqueMusicas.removeItemEmEstoque(musica2);
        estoqueMusicas.atualizaProdutoEmEstoque(musica3);
        System.out.println("Musica encontrada: " + estoqueMusicas.buscaProdutoPorNome(musica1));
        System.out.println("Quantidade itens: " + estoqueMusicas.buscaQtidadeEmEstoque(musica3));

        Caixa caixa =new Caixa<>();
        caixa.venda(musica1, 2, 20, TiposProdutos.MUSICA);
    }
}
