package estrutura_de_dados;

import java.util.Comparator;

public class Lista <T> implements Comparable<Lista>{

    ListaEncadeada <T> primeiroItem;
    ListaEncadeada <T> ultimoItem;

    private Integer proximoItem;

    private Integer itemAnterior;

    private int tamanho = 0;

    public Lista() {}

    public T add(T dado){
        if(primeiroItem==null){
            this.primeiroItem = new ListaEncadeada<>();
            primeiroItem.setDado(dado);
            ultimoItem = primeiroItem;
        } else {
            ListaEncadeada<T> item = new ListaEncadeada<>();
            item.setDado(dado);
            ultimoItem.setProximo(item);
            ultimoItem = item;

        }
        tamanho  ++;
        return dado;
    }

    public T getPosicaoBinaria(Integer posicao) throws Exception {

        ListaEncadeada<T> item = null;

        if (tamanho / 2 <= posicao){

            if (posicao == 0) return primeiroItem.getDado();

            item = primeiroItem;

            for (int i = 0; i < posicao; i  ++) {
                item = item.getProximo();
            }
        }else{
            if (posicao == tamanho - 1) return ultimoItem.getDado();

             item = ultimoItem;

            for (int i = 1; i <= tamanho - posicao; i  ++) {
                item = item.getAnterior();
            }
        }
        return item.getDado();
    }

    public T getPosicao(int posicao) throws Exception {
        validaExcecoes(posicao);
        ListaEncadeada<T> item = primeiroItem;
        for (int i = 0; i < posicao; i  ++) {
            item = item.getProximo();
        }
        return item.getDado();
    }

    public T removeItemPorPosicao(int posicao) throws Exception {
        this.validaExcecoes(posicao);

        ListaEncadeada<T> itemAtual = primeiroItem;
        ListaEncadeada<T> itemAnterior = null;

        if (posicao == 0) {
            primeiroItem = itemAtual.getProximo();
            return primeiroItem.getDado();
        }

        for (int i = 0; i < posicao; i  ++) {
            if (i < posicao) itemAnterior = itemAtual;
            itemAtual = itemAtual.getProximo();
        }

        if (itemAtual == ultimoItem) {
            ultimoItem = itemAnterior;
            itemAnterior.setProximo(null);
        } else {
            itemAnterior.setProximo(itemAtual.getProximo());
            itemAtual.getProximo().setAnterior(itemAtual.getAnterior());
        }

        return itemAtual.getDado();
    }

    public T validaExcecoes(int posicao) throws Exception {
        if (posicao < 0) throw new Exception("Por favor,informe uma posição positiva");
        if (posicao == 0) return primeiroItem.getDado();
        if (posicao >= tamanho) throw new IndexOutOfBoundsException("Posição iformada émaior que o tamanho da lista");
        return null;
    }

    public static void main(String[] args) throws Exception {
        Lista<String> lista = new Lista<>();
        lista.add("Diego");
        lista.add("Nayara");
        lista.add("Ryan");

        System.out.println("Binary search: " + lista.getPosicaoBinaria(1));

//        lista.removeItemPorPosicao(2);
    }

    @Override
    public int compareTo(Lista list) {
        return list.proximoItem.compareTo(proximoItem);
    }
}
