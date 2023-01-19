package orientacao_objetos_solid.project.interfaces.generics;

import orientacao_objetos_solid.project.interfaces.Cachorro;

public class RacasCachorros implements Cachorro, Comparable<RacasCachorros> {

    private String nome;
    private String latido;

    public RacasCachorros(String nome) {
        this.nome = nome;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "RacasCachorros{" +
                "Nome= '" + nome + '\'' +
                "- Latido= '" + latir() + '\'' +
                '}';
    }

    @Override
    public int compareTo(RacasCachorros racasCachorros) {
        return this.nome.compareTo(racasCachorros.getNome());
    }

    @Override
    public String latir() {
        return this.latido;
    }
}
