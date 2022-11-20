package aula.project.solid.s.superclasse.extend;

import aula.project.solid.s.superclasse.Servicos;

public class Tosa extends Servicos {

    @Override
    public Double calulaValorTosaCachorro(Integer qtidadeTosas, Double valorTosa) {
        return super.calulaValorTosaCachorro(qtidadeTosas, valorTosa);
    }
}
