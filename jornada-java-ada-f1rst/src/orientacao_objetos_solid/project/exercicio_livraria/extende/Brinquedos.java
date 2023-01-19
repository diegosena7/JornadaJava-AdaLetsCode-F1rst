package orientacao_objetos_solid.project.exercicio_livraria.extende;

import orientacao_objetos_solid.project.exercicio_livraria.superclass.Produtos;


public class Brinquedos extends Produtos {

    private String tipo;


    public Brinquedos(String nome, Integer id, Double preco, String tipo) {
        super(nome, id, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedos{" +
                "Tipo = " + tipo + '\'' +
                ", Nome = " + getNome() + '\'' +
                ", Id = " + getId() +
                ", Preco = " + getPreco() +
                "}" + "\n";
    }
}
