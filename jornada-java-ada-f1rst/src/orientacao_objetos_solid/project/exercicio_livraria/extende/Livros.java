package orientacao_objetos_solid.project.exercicio_livraria.extende;

import orientacao_objetos_solid.project.exercicio_livraria.enums.Generos;
import orientacao_objetos_solid.project.exercicio_livraria.superclass.Produtos;

public class Livros extends Produtos {

    private Generos genero;
    private String escritor;
    private String editora;

    public Livros(String nome, Integer id, Double preco, Generos genero, String escritor, String editora) {
        super(nome, id, preco);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "Genero = " + genero +
                ", Escritor = " + escritor + '\'' +
                ", Editora = " + editora + '\'' +
                ", Nome = " + getNome() + '\'' +
                ", Id = " + getId() +
                ", Preco = " + getPreco() +
                "}" + "\n";
    }
}
