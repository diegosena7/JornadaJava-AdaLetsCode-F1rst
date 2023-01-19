package orientacao_objetos_solid.project.exercicio_livraria.estoques;

import orientacao_objetos_solid.project.exercicio_livraria.superclass.Produtos;

import java.util.*;

public class Estoque<T extends Produtos> {

    Map<Integer, T> estoqueListaMap = new HashMap<>();

    public Estoque() {
    }

    public List<T> buscaItensDoEstoque() {
        List<T> listTest = new ArrayList(estoqueListaMap.values());
        return listTest;
    }

    public void adicionaItemAoEstoque(T estoqueAdd) {
        estoqueListaMap.put(estoqueAdd.getId(), estoqueAdd);
    }

    public void atualizaProdutoEmEstoque(T estoqueUpdate) {
        estoqueListaMap.replace(estoqueUpdate.getId(), estoqueUpdate);
    }

    public void removeItemEmEstoque(T estoqueRemove) {
        estoqueListaMap.remove(estoqueRemove.getId());
    }

    public T buscaProdutoPorNome(T estoqueBusca) {
        return estoqueListaMap.get(estoqueBusca.getId());
    }

    public Integer buscaQtidadeEmEstoque(T item){
        List<T> ts = buscaItensDoEstoque();
        if (ts.contains(item)){
            return ts.size();
        }else {
            return 0;
        }
    }
}
