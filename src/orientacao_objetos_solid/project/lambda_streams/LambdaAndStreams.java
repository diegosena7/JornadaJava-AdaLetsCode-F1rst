package orientacao_objetos_solid.project.lambda_streams;

import java.util.*;
import java.util.stream.Collectors;

/*
 Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso
 As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo)
 Expressões lambda basicamente expressam instâncias de interfaces funcionais (uma interface com método abstrato único é chamada de interface funcional)
 BY: https://rinaldo.dev/java-8-streams-pare-de-usar-for-e-simplifique-seu-codigo/
. */
public class LambdaAndStreams {

    public static void main(String[] args) {

        List<Pessoa> listPessoas = Arrays.asList(new Pessoa("Eduardo", 50),
                new Pessoa("Luiz", 32), new Pessoa("Bruna", 26),
                new Pessoa("Diego",33), new Pessoa("Ryan", 16));
        listPessoas.sort((p1,p2) -> p1.getNome().compareTo(p2.getNome()));
        System.out.println("Pessoas ordenadas por nome: " + listPessoas);

        System.out.println();
        String nome = "Diego";
        List<Pessoa> newList =  listPessoas.stream().filter(p -> p.getNome().equals(nome)).collect(Collectors.toList());
        System.out.println("Busca pessoa por nome: " + newList);

        System.out.println();
        Long count = listPessoas.stream().count();
        System.out.println("Quantidade de pessoas: " + count);

        System.out.println();
        System.out.println("Ordenando pessoas pelo nome:");
        Collections.sort(listPessoas, (Pessoa pessoa1, Pessoa pessoa2)
                -> pessoa1.getNome().compareTo(pessoa2.getNome()));
        listPessoas.forEach(p -> System.out.println(p.getNome()));

        System.out.println();
        System.out.println("Ordenando pessoas pela idade:");
        Collections.sort(listPessoas, (Pessoa pessoa1, Pessoa pessoa2)
                -> pessoa1.getIdade().compareTo(pessoa2.getIdade()));
        listPessoas.forEach(p -> System.out.println(p.getNome()));

        System.out.println();
        System.out.println("Pessoas com mais de 30 anos:");
        List<Pessoa> maioresTrinta = listPessoas.stream().filter(p
                -> p.getIdade() > 30).collect(Collectors.toList());
        maioresTrinta.forEach(p -> System.out.println(p.getNome()));

        System.out.println();
        System.out.println("Pessoas que o nome iniciam com E:");
        List<Pessoa> nomesIniciadosE = listPessoas.stream().filter(p
                -> p.getNome().startsWith("E")).collect(Collectors.toList());
        nomesIniciadosE.forEach(p -> System.out.println(p.getNome()));

        System.out.println();
        System.out.println("Imprimindo numeros pares:");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 20, 25);
        nums.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.println(num));

        System.out.println();
        System.out.println("Ordenando numeros e elimina duplicados:");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(10);
        list.add(10);
        list.add(9);
        list.sort((item1, item2) -> Integer.compare(item1, item2));
        list.stream()
                .distinct()
                .forEach(item -> System.out.println(item));

        //Alterando a lista inicial e criando uma nova lista com Collectors.toList()
        System.out.println();
        listPessoas.stream().filter(p -> p.getIdade() > 30).collect(Collectors.toList()).forEach(pessoa -> System.out.println("Pessoa com mais de 20 anos: " + pessoa));

        //Alterando a lista de numeros e transformando valores
        Map<Boolean, List<Integer>> mapa = nums.stream().map(n -> n * 3).collect(Collectors.groupingBy(e -> e % 2 == 0));
        System.out.println(mapa);

        System.out.println();
        //Busca o menor e maior valor da lista de numeros
        Optional<Integer> min = nums.stream().min(Comparator.naturalOrder());
        Optional<Integer> max = nums.stream().max(Comparator.naturalOrder());
        System.out.println("Menor numero: " + min + " - Maior numero: " + max);
    }
}
