package orientacao_objetos_solid.project.interfaces.generics;


public class Shitzu extends RacasCachorros{

    public Shitzu(String nome) {
        super(nome);
    }

    @Override
    public String latir() {
        return "Au Au"  + " latido do: " + this.getNome();
    }
}
