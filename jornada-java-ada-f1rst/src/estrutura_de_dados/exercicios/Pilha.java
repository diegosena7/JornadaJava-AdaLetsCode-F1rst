package estrutura_de_dados.exercicios;

import estrutura_de_dados.ListaEncadeada;

public class Pilha <T> {

    private ListaEncadeada lista;
    ListaEncadeada<T> primeiroItem;
    ListaEncadeada<T> ultimoItem;
    private int tamanho = 0;


    public Pilha() {
        this.lista = new ListaEncadeada<>();
    }

    public Object adicionarItemPilha(Object dado) {
        ListaEncadeada<T> novo = new ListaEncadeada<>(dado);

        if(primeiroItem == null && ultimoItem == null){
            primeiroItem = novo;
            ultimoItem = novo;
        }else{
            novo.setProximo(this.primeiroItem);
            this.primeiroItem = novo;
        }
        tamanho ++;
        return dado;
    }

    public T getItemPilha() throws Exception {
        ListaEncadeada<T> item = primeiroItem;
        item = item.getProximo();

        return item.getDado();
    }

    public void removerItemPilha() throws Exception {
        ListaEncadeada<T> atual = this.primeiroItem;
        ListaEncadeada<T> anterior = null;
        for (int i = 0; i < this.getTamanho(); i++) {
                if (atual == primeiroItem && atual == ultimoItem) {
                    this.primeiroItem = null;
                    this.ultimoItem = null;
                } else if (atual == primeiroItem) {
                    this.primeiroItem = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimoItem) {
                    this.ultimoItem = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
        }
    }

    public ListaEncadeada<T> getPrimeiroItem() {
        return primeiroItem;
    }

    public int getTamanho() {
        return tamanho;
    }
}
