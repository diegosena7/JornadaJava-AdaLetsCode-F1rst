package orientacao_objetos_solid.project.exercicio_livraria.extende;

import orientacao_objetos_solid.project.exercicio_livraria.enums.Generos;
import orientacao_objetos_solid.project.exercicio_livraria.superclass.Produtos;


public class Filmes extends Produtos {

    private Generos genero;
    private String diretores;
    private String produtores;
    private String estudio;

    public Filmes(String nome, Integer id, Double preco, Generos genero, String diretores, String produtores, String estudio) {
        super(nome, id, preco);
        this.genero = genero;
        this.diretores = diretores;
        this.produtores = produtores;
        this.estudio = estudio;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public String getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "Genero = " + genero +
                ", Diretores = " + diretores + '\'' +
                ", Produtores = " + produtores + '\'' +
                ", Estudio = " + estudio + '\'' +
                ", Nome = " + getNome() + '\'' +
                ", Id = " + getId() +
                ", Preco = " + getPreco() +
                "}" + "\n";
    }
}
