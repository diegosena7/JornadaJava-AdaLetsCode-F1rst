package orientacao_objetos_solid.project.exercicio_livraria.regra_servico;

public abstract class RegrasServicos {

    public abstract Boolean verificaIdadeParaCompra(Integer idade);

    public abstract Double descontoComprasLivrosMaiorQue200Reais(Double valorCompra);

}
