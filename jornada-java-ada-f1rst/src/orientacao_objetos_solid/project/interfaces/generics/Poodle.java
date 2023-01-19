package orientacao_objetos_solid.project.interfaces.generics;


public class Poodle extends RacasCachorros{

    public Poodle(String nome) {
        super(nome);
    }

    @Override
    public String latir() {
        return "AuuuuAuuuuu"  + " latido do: " + this.getNome();
    }
}
