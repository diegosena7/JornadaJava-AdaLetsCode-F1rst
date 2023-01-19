package orientacao_objetos_solid.project.exercicio_livraria.financeiro;


import orientacao_objetos_solid.project.exercicio_livraria.enums.TiposProdutos;
import orientacao_objetos_solid.project.exercicio_livraria.estoques.Estoque;
import orientacao_objetos_solid.project.exercicio_livraria.regra_servico.RegrasServicos;
import orientacao_objetos_solid.project.exercicio_livraria.superclass.Produtos;

public class Caixa<T extends Produtos> extends RegrasServicos {

    private Double dinheiro;

    public Double getDinheiro() {
        return dinheiro;
    }

    public Caixa() {

    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "Dinheiro R$ = " + dinheiro +
                '}';
    }


    public Double venda(T produto, Integer qtidade,Integer idadeComprador, TiposProdutos tiposProdutos){
        Double soma = 0.0;
        dinheiro = 0.0;
        if(verificaIdadeParaCompra(idadeComprador)){
            soma = qtidade * produto.getPreco();
            dinheiro += soma;
            Estoque<T> estoque = new Estoque<>();
            estoque.removeItemEmEstoque(produto);
        } if (tiposProdutos.equals(TiposProdutos.FILMES)){
            System.out.println("Venda finalizada com descontoR$: " + soma);
            descontoComprasLivrosMaiorQue200Reais(soma);
        }
        System.out.println("Venda finalizada R$: " + soma);
        return soma;
    }


    @Override
    public Boolean verificaIdadeParaCompra(Integer idade) {
        if (idade >= 18)
            return true;
        else
            return false;
    }

    @Override
    public Double descontoComprasLivrosMaiorQue200Reais(Double valorCompra) {
        if (valorCompra > 200.0){
            valorCompra -= 0.15;
        }
        return valorCompra;
    }
}
