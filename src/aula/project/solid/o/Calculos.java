package aula.project.solid.o;

import aula.project.solid.s.Checkout;

//Open CLose Principle: A classe deve ser aberta para extensão, mas fechada para modificação.
public class Calculos {

    public Double getValorFinal(Checkout checkout){
        double somaTotal = checkout.getEstadia()
                + checkout.getBanho()
                + checkout.getTosa();
        return somaTotal;
    }
}
