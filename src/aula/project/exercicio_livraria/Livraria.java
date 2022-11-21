package aula.project.exercicio_livraria;

import aula.project.exercicio_livraria.enums.Generos;
import aula.project.exercicio_livraria.estoques.Estoque;
import aula.project.exercicio_livraria.extende.Livros;

import java.util.Collections;

public class Livraria {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        Livros livro1 = new Livros("A Arte da Guerra", 1, 25.00, Generos.AVENTURA, "Robert Sims","Editora Globo");
        Livros livro2 = new Livros("Domain Drive Design", 2, 50.00, Generos.TECNOLOGIA, "Eric Evans","DDD");
        Livros livro3 = new Livros("Java Efetivo", 1, 50.00, Generos.TECNOLOGIA, "Pearson Wesley","Bloch");
        Livros livro4 = new Livros("Java Efetivo", 1, 50.00, Generos.TECNOLOGIA, "Pearson Wesley","Bloch");
        Livros livro5 = new Livros("Java Efetivo", 1, 50.00, Generos.TECNOLOGIA, "Pearson Wesley","Bloch");

        Estoque<Livros> estoqueLivros = new Estoque<>();
        estoqueLivros.adicionaItemAoEstoque(livro1);
        estoqueLivros.adicionaItemAoEstoque(livro2);
        estoqueLivros.adicionaItemAoEstoque(livro3);
        estoqueLivros.adicionaItemAoEstoque(livro4);
        estoqueLivros.adicionaItemAoEstoque(livro5);
        System.out.println(estoqueLivros.buscaItensDoEstoque());

//        Collections.sort(estoqueLivros);


        estoqueLivros.removeItemEmEstoque(livro2);
        System.out.println(estoqueLivros.buscaItensDoEstoque());

        estoqueLivros.atualizaProdutoEmEstoque(livro3);
        System.out.println(estoqueLivros.buscaItensDoEstoque());
        System.out.println("Produto encontrado: " + estoqueLivros.buscaProdutoPorNome(livro3));
    }
}
