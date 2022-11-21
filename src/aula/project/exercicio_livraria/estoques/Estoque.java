package aula.project.exercicio_livraria.estoques;

import aula.project.exercicio_livraria.superclass.Produtos;

import java.util.*;

public class Estoque<T extends Produtos> {

    Map<Integer, T> estoqueListaMap = new HashMap<>();

    public Estoque() {
    }

    public List<T> buscaItensDoEstoque() {
        List<T> listTest = new ArrayList(estoqueListaMap.entrySet());
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
}
