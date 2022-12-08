package orientacao_objetos_solid.project.exercicio_livraria.extende;

import orientacao_objetos_solid.project.exercicio_livraria.enums.Generos;
import orientacao_objetos_solid.project.exercicio_livraria.superclass.Produtos;

public class Jogos extends Produtos {

    private Generos genero;
    private String distribuidora;
    private String estudio;

    public Generos getGenero() {
        return genero;
    }

    public Jogos(String nome, Integer id, Double preco, Generos genero, String distribuidora, String estudio) {
        super(nome, id, preco);
        this.genero = genero;
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "Genero= " + genero +
                ", Distribuidora= " + distribuidora + '\'' +
                ", Estudio= " + estudio + '\'' +
                ", Nome = " + getNome() + '\'' +
                ", Id = " + getId() +
                ", Preco = " + getPreco() +
                "}" + "\n";
    }
}
