package orientacao_objetos_solid.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaDeAula {


    List<Participante> listaParticipantes = new ArrayList<>();

    public void addParticipante(Participante participante){
        listaParticipantes.add(participante);
    }

    public void imprimirLista(){
        for (Object participante:listaParticipantes){
            System.out.println(participante);
        }
    }

    public static void main(String[] args) {
        SalaDeAula salaDeAula = new SalaDeAula();

        salaDeAula.addParticipante(new Aluno(89744, "Nayara", "Nazinha"));
        salaDeAula.addParticipante(new Aluno(12345, "Diego", "Japonês"));
        salaDeAula.addParticipante(new Aluno(54321, "Ryan", "Minhocão"));

        salaDeAula.addParticipante(new Professor(12377, "Pedro", "Kotlin"));
        salaDeAula.addParticipante(new Professor(12797, "Kadu", "Java"));
        salaDeAula.addParticipante(new Professor(12479, "José", "JS"));

        System.out.println("-------------Ordena por nome----------------");
        Collections.sort(salaDeAula.listaParticipantes);
        salaDeAula.imprimirLista();

        System.out.println();

        System.out.println("-------------Ordena por matrícula----------------");
        Collections.sort(salaDeAula.listaParticipantes, new ComparaParticipantsPorMatricula());
        salaDeAula.imprimirLista();
    }
}
