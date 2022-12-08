package orientacao_objetos_solid.project.solid.s;

import orientacao_objetos_solid.project.solid.s.financeiro.Financeiro;
//import orientacao_objetos_solid.project.solid.s.financeiro.RegistroContabil;
import orientacao_objetos_solid.project.solid.s.interfaces.implement.Reservas;
import orientacao_objetos_solid.project.solid.s.model.Cachorro;
import orientacao_objetos_solid.project.solid.s.superclasse.extend.Banho;
import orientacao_objetos_solid.project.solid.s.superclasse.extend.Estadia;
import orientacao_objetos_solid.project.solid.s.superclasse.extend.Tosa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Secretaria {

    static Double valorBanho;
    static Double valorTosa;

    static Double valorEstadia;

    public static void main(String[] args) {

        //Verifica se tem vaga para a data
        Reservas reservas = new Reservas();
        reservas.reserva(LocalDate.of(20, 12, 22),LocalDate.of(30, 12, 22));

        reservas.agendaVisitar(LocalDate.of(20, 12, 22));

        //Adiciono o cachorro
        Cachorro cachorro1 = new Cachorro("Ted", 6, "Poodle");
        Cachorro cachorro2 = new Cachorro("Pop", 4, "Shitzu");
        Cachorro cachorro3 = new Cachorro("Zig", 2, "PitBull");

        List<Cachorro> listaCachorros = new ArrayList<>();
        listaCachorros.add(cachorro1);
        listaCachorros.add(cachorro2);
        listaCachorros.add(cachorro3);

        Collections.sort(listaCachorros);//Ordenação por nome em ordem alfabéica
        listaCachorros.forEach(cachorro -> System.out.println(cachorro));

        //Chama o serviço de banho após o cliente ter pedido no cadastro a quantidade de banhos durante a hospedgem
        Banho banho = new Banho();
        valorBanho = banho.calculaValorBanhosCachorro(2, 25.00);
        System.out.println("Valor banho R$: " + valorBanho);

        //Chama o serviço de tosa após o cliente ter pedido no cadastro a quantidade de tosa durante a hospedgem
        Tosa tosa = new Tosa();
        valorTosa = tosa.calulaValorTosaCachorro(2, 45.00);
        System.out.println("Valor tosa R$: " + valorTosa);

        Estadia estadia = new Estadia();
        valorEstadia = estadia.calculaValorEstadia(5, 100.0);
        System.out.println("Valor estadias R$: " + valorEstadia);

        System.out.println("------------------------------------");

        //Checkout do cachorro
        listaCachorros.forEach(cachorro -> sair(cachorro));

        //Implementar checkout
//        Financeiro.getRelatorioFinanceiro(RegistroContabil.livroContabil);
    }

    public static void sair(Cachorro cachorro){
        Saida.getValorCheckout(valorEstadia, valorBanho, valorTosa, cachorro);
        System.out.println(Saida.getValorCheckout(valorEstadia, valorBanho, valorTosa, cachorro));
    }
}
