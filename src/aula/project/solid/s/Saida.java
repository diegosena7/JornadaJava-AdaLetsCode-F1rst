package aula.project.solid.s;

import aula.project.solid.o.CalculoBanhoTosa;
import aula.project.solid.o.CalculoSoEstadia;
import aula.project.solid.o.Calculos;
import aula.project.solid.s.model.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class Saida {

    private static List<Checkout> checkoutList = new ArrayList<>();

    public static Double getValorCheckout(Double estadia, Double banho, Double tosa, Cachorro cachorro){
        Checkout novoCheckout = new Checkout(estadia, banho, tosa, cachorro);
        checkoutList.add(novoCheckout);

        Calculos calculos = null;

        if(estadia == 0.0 && banho == 0.0 && tosa == 0.0){
            calculos = new CalculoSoEstadia();
        } else if(banho == 0.0 && tosa == 0.0)  {//banho e tosa
            calculos = new CalculoBanhoTosa();
        } else {
            calculos = new Calculos();
        }
        return novoCheckout.getValorFinal(calculos);
    }

    public static List<Checkout> getCheckout(){
        return checkoutList;
    }
}
