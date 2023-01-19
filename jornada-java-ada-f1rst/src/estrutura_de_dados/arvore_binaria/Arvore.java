package estrutura_de_dados.arvore_binaria;

public class Arvore {

    private Elemento raiz;

    public void inserirElemento(Integer info){

        if (raiz == null){
            raiz = new Elemento(info);
        }else{
            if (info > raiz.getInfo()){
                Elemento elemento = raiz.getDireita();
                raiz.setDireita(new Elemento(info));
            }
        }
    }
}
