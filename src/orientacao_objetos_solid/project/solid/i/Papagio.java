package orientacao_objetos_solid.project.solid.i;

public class Papagio implements AnimaisQueVoam{

    @Override
    public String comer() {
        return "Cruuu, Cruuu";
    }

    @Override
    public Double alturaDoVoo() {
        return 50.0;
    }
}
