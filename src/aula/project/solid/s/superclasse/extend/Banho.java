package aula.project.solid.s.superclasse.extend;

import aula.project.solid.s.superclasse.Servicos;

public class Banho extends Servicos {

    @Override
    public Double calculaValorBanhosCachorro(Integer qtidadeBanhos, Double valorBanho) {
        return super.calculaValorBanhosCachorro(qtidadeBanhos, valorBanho);
    }
}
