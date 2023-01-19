package orientacao_objetos_solid.project.interfaces;

import orientacao_objetos_solid.project.interfaces.generics.Poodle;
import orientacao_objetos_solid.project.interfaces.generics.RacasCachorros;
import orientacao_objetos_solid.project.interfaces.generics.Shitzu;
import orientacao_objetos_solid.project.interfaces.generics.ViraLata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelCachorros<T> {

    List<T> listCachorros = new ArrayList<>();

    public List<T> getHospedes(){
        return listCachorros;
    }

    public void addHospedes(T t){
        listCachorros.add(t);
    }

    public void imprimirLista(){
        for (T t : listCachorros){
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        HotelCachorros<RacasCachorros> hotelCachorros = new HotelCachorros();

        hotelCachorros.addHospedes(new Shitzu("Zion"));
        hotelCachorros.addHospedes(new Poodle("Ted"));
        hotelCachorros.addHospedes(new ViraLata("Caramelo"));

        Collections.sort(hotelCachorros.getHospedes());

        hotelCachorros.imprimirLista();
    }
}
