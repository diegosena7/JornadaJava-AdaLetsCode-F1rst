package aula.project.solid.s.superclasse.extend;

import aula.project.solid.s.superclasse.Servicos;

public class Estadia extends Servicos {

    @Override
    public Double calculaValorEstadia(Integer qtidadeDias, Double valorDiaria) {
        return super.calculaValorEstadia(qtidadeDias, valorDiaria);
    }
}
