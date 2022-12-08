package orientacao_objetos_solid.project.solid.s.superclasse.extend;

import orientacao_objetos_solid.project.solid.s.superclasse.Servicos;

public class Banho extends Servicos {

    @Override
    public Double calculaValorBanhosCachorro(Integer qtidadeBanhos, Double valorBanho) {
        return super.calculaValorBanhosCachorro(qtidadeBanhos, valorBanho);
    }
}
