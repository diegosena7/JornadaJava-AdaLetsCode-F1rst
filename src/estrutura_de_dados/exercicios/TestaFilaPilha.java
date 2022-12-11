package estrutura_de_dados.exercicios;

import java.util.Scanner;

public class TestaFilaPilha {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a estrutura de dados desejada (1 para Fila e 2 para Pilha ou 0 para encerrar o programa): ");
        Integer escolhaUsuario = sc.nextInt();

        if (escolhaUsuario < 1 || escolhaUsuario > 2) throw new Exception("Estrutura de dados escolhida é inválida.");

        if (escolhaUsuario == 1){
            System.out.println("Estrutur de dados escolhida é FILA");

            Fila fila = new Fila();

            fila.adicionarItem("Diego");
            fila.adicionarItem("Nayara");
            fila.adicionarItem("Ryan");
            fila.adicionarItem("Ted");

            System.out.println("Primeiro item da fila: " + fila.getPosicao().toString());

            System.out.println();
            System.out.println("----- REMOVENDO FILA -----");
            System.out.println();
            fila.removerItem("Diego");
            System.out.println("Primeiro item da fila: " + fila.getPosicao().toString());
        }else if (escolhaUsuario == 2){
            System.out.println("Estrutur de dados escolhida é PILHA");

            Pilha pilha = new Pilha<>();

            pilha.adicionarItemPilha("Maria");
            pilha.adicionarItemPilha("Joaquim");
            pilha.adicionarItemPilha("Henrique");
            pilha.adicionarItemPilha("Collie");

            System.out.println("Primeiro item: " + pilha.getPrimeiroItem().getDado());

            System.out.println();
            System.out.println("----- REMOVENDO PILHA-----");
            System.out.println();
            pilha.removerItemPilha();
            System.out.println("Primeiro item: " + pilha.getPrimeiroItem().getDado());
        }
        sc.close();
    }
}
