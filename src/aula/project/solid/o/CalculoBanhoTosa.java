package aula.project.solid.o;

import aula.project.solid.s.Checkout;
import aula.project.solid.s.financeiro.RegistroContabil;

public class CalculoBanhoTosa extends Calculos {

    @Override
    public Double getValorFinal(Checkout checkout) {
        Double somaTotal = checkout.getBanho() + checkout.getTosa();
        RegistroContabil.addRegistroContabil(checkout.getCachorro(), somaTotal);
        return somaTotal;
    }
}
