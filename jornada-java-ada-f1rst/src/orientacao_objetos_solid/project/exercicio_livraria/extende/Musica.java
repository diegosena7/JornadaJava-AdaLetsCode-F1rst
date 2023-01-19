package orientacao_objetos_solid.project.exercicio_livraria.extende;

import orientacao_objetos_solid.project.exercicio_livraria.enums.Generos;
import orientacao_objetos_solid.project.exercicio_livraria.superclass.Produtos;

public class Musica extends Produtos {
    private Generos genero;
    private String banda;
    private String selos;

    public Musica(String nome, Integer id, Double preco, Generos genero, String banda, String selos) {
        super(nome, id, preco);
        this.genero = genero;
        this.banda = banda;
        this.selos = selos;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getSelos() {
        return selos;
    }

    public void setSelos(String selos) {
        this.selos = selos;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "Genero = " + genero +
                ", Banda = " + banda + '\'' +
                ", Selos = " + selos + '\'' +
                ", Nome = " + getNome() + '\'' +
                ", Id = " + getId() +
                ", Preco = " + getPreco() +
                "}" + "\n";
    }
}
