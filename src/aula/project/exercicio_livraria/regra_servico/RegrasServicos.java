package aula.project.exercicio_livraria.regra_servico;

import aula.project.exercicio_livraria.enums.TiposProdutos;
import aula.project.exercicio_livraria.superclass.Produtos;

public abstract class RegrasServicos {

    public abstract Boolean verificaIdadeParaCompra(Integer idade);

    public abstract Double descontoComprasLivrosMaiorQue200Reais(Double valorCompra);

}
