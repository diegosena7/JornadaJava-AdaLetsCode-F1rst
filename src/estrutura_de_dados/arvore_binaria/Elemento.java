package estrutura_de_dados.arvore_binaria;

import java.security.PrivateKey;

public class Elemento {

    private Integer info;

    private Elemento esquerda;

    private Elemento direita;

    public Elemento(Integer info) {
        this.info = info;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public Elemento getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento esquerda) {
        this.esquerda = esquerda;
    }

    public Elemento getDireita() {
        return direita;
    }

    public void setDireita(Elemento direita) {
        this.direita = direita;
    }
}
