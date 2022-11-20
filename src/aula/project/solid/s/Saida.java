package aula.project.solid.s;

import aula.project.solid.s.model.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class Saida {

    private static List<Checkout> checkoutList = new ArrayList<>();

    public static Double getValorCheckout(Double estadia, Double banho, Double tosa, Cachorro cachorro){
        Checkout novoCheckout = new Checkout(estadia, banho, tosa, cachorro);
        checkoutList.add(novoCheckout);
        return novoCheckout.getValorFinal(false);
    }

    public static List<Checkout> getCheckout(){
        return checkoutList;
    }
}
