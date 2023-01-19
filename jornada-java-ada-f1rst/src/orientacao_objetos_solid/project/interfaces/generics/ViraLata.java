package orientacao_objetos_solid.project.interfaces.generics;


public class ViraLata extends RacasCachorros {

    public ViraLata(String nome) {
        super(nome);
    }

    @Override
    public String latir() {
        return "Ruuf Ruuf"  + " latido do: " + this.getNome();
    }
}
