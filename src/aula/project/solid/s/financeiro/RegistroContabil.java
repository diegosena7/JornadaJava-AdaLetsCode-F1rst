package aula.project.solid.s.financeiro;

import aula.project.solid.s.model.Cachorro;

import java.util.ArrayList;
import java.util.List;

public record RegistroContabil(Cachorro cachorro, Double valorFinal) {

        public static List<RegistroContabil> livroContabil = new ArrayList<>();

        public static void addRegistroContabil(Cachorro cachorro, Double valorFinal){
                livroContabil.add(new RegistroContabil(cachorro, valorFinal));
        }
}