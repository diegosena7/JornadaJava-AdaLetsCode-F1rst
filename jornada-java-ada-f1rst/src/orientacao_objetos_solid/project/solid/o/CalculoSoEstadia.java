package orientacao_objetos_solid.project.solid.o;

import orientacao_objetos_solid.project.solid.s.Checkout;
//import orientacao_objetos_solid.project.solid.s.financeiro.RegistroContabil;

public class CalculoSoEstadia extends Calculos {
    @Override
    public Double getValorFinal(Checkout checkout) {
        Double somaTotal = checkout.getEstadia();
//        RegistroContabil.addRegistroContabil(checkout.getCachorro(), somaTotal);
        return somaTotal;
    }
}
