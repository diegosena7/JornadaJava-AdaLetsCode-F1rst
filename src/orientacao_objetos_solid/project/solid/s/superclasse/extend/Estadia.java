package orientacao_objetos_solid.project.solid.s.superclasse.extend;

import orientacao_objetos_solid.project.solid.s.superclasse.Servicos;

public class Estadia extends Servicos {

    @Override
    public Double calculaValorEstadia(Integer qtidadeDias, Double valorDiaria) {
        return super.calculaValorEstadia(qtidadeDias, valorDiaria);
    }
}
