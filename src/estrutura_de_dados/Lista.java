package estrutura_de_dados;

import java.util.Comparator;

public class Lista <T> implements Comparable<Lista>{

    ListaEncadeada <T> primeiroItem;
    ListaEncadeada <T> ultimoItem;

    private Integer proximoItem;

    private Integer itemAnterior;

    private int tamanho = 0;

    public Lista(){
        this.primeiroItem = new ListaEncadeada<>();
    }

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
        System.out.println(primeiroItem.getDado());
        System.out.println(ultimoItem==null?"":ultimoItem.getDado());
        System.out.println(primeiroItem);
        System.out.println(ultimoItem);
        System.out.println();
        System.out.println();
        tamanho  ++;
        return dado;
    }

    public <T> int getPosicaoBinaria(Lista<? extends T> list, T key, Comparator<? super T> comparator) throws Exception {
        int inicio = 0;
        int fim = list.proximoItem - 1;
        int itemBuscado = 0;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparador = comparator.compare(key, list.getPosicao(meio));
            if (comparador == 0) {
                itemBuscado = meio;
                return itemBuscado;
            } else if (comparador < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return itemBuscado;
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

        System.out.println(lista.getPosicaoBinaria(lista, "Diego",  Comparator.naturalOrder()));

        lista.removeItemPorPosicao(2);
    }

    @Override
    public int compareTo(Lista list) {
        return list.proximoItem.compareTo(proximoItem);
    }
}
