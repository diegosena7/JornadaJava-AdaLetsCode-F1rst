package estrutura_de_dados.map;

import java.util.*;

/*
Ao usarmos a implementação do LinkedHashMap garantimos a ordem de inserçao de valores
Já com o HashMap a ordem não é garantida
Podemos usar a implementação do TreeMap para odenar via chave, caso não passe o comparator ele usa a ordem natural, no caso de string
ele usa ordem alfabetica, integer usa a ordem dos números... Podemos passar um Comparator e retornar de acordo com a regra desejada.
Fonte: https://www.differbetween.com/storage/img/images_3/java_collections_interview_questions.png
 */
public class MainLinkedHashMap {

    static Map<String, Map<String, String>> agendaContatos = new TreeMap<>();

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Sem ordenação");
        Map<String,String> mapaDesordenado =new HashMap<>();
        mapaDesordenado.put("nome0", "Maria");
        mapaDesordenado.put("nome1", "Joaquim");
        mapaDesordenado.put("nome2", "Ted");
        mapaDesordenado.put("nome3", "Thais");
        mapaDesordenado.put("nome4", "Marlene");
        System.out.println(mapaDesordenado);

        System.out.println();
        System.out.println("Ordem de inserção");
        Map<String,String> mapaOrdemInsercao =new LinkedHashMap<>();
        mapaOrdemInsercao.put("nome0", "Diego");
        mapaOrdemInsercao.put("nome2", "Ryan");
        mapaOrdemInsercao.put("nome1", "Nayara");
        System.out.println(mapaOrdemInsercao);

        System.out.println();
        System.out.println("Ordem alfabética");
        Map<String,String> mapaOrdemAlfabetica =new TreeMap<>();
        mapaOrdemAlfabetica.put("diegoemail", "Diego");
        mapaOrdemAlfabetica.put("nayaraemail", "Nayara");
        mapaOrdemAlfabetica.put("ryanemail", "Ryan");
        mapaOrdemAlfabetica.put("abeuemail", "Abreu");
        System.out.println(mapaOrdemAlfabetica);

        Comparator<Aluno> alunoComparator = Comparator.comparing(Aluno::getMatricula).reversed();
        Map<Aluno, String> mapaAlunos = new TreeMap<>(Comparator.comparing(Aluno::getMatricula));
        Map<Aluno, String> mapaAlunosReversed = new TreeMap<>(alunoComparator);

        System.out.println();
        System.out.println("Comparando e retornando ordenado por matrícula");
        mapaAlunos.put(new Aluno("Diego", 77), "diego.sena@ada.com.br");
        mapaAlunos.put(new Aluno("Ryan", 78), "ryan.adjs@ada.com.br");
        mapaAlunos.put(new Aluno("Nayara", 177), "nayara.andradesena@ada.com.br");
        mapaAlunos.put(new Aluno("Ted", 17), "ted.andradesena@ada.com.br");
        System.out.println(mapaAlunos);

        System.out.println();
        System.out.println("Usando a função de revesão de ordenação");
        mapaAlunosReversed.put(new Aluno("Diego", 77), "diego.sena@ada.com.br");
        mapaAlunosReversed.put(new Aluno("Ryan", 78), "ryan.adjs@ada.com.br");
        mapaAlunosReversed.put(new Aluno("Nayara", 177), "nayara.andradesena@ada.com.br");
        mapaAlunosReversed.put(new Aluno("Ted", 17), "ted.andradesena@ada.com.br");
        System.out.println(mapaAlunosReversed);

        System.out.println();
        System.out.println("--------------------------------------");
        agendaContatos.put("Diego", new LinkedHashMap<>());
        agendaContatos.put("Nayara", new LinkedHashMap<>());
        agendaContatos.put("Ryan", new LinkedHashMap<>());

        Map<String, String> mapaAgenda;

        mapaAgenda = agendaContatos.get("Diego");
        mapaAgenda.put("email1", "dsena@gmail.com");
        mapaAgenda.put("email2", "dsena7@gmail.com");

        mapaAgenda = agendaContatos.get("Nayara");
        mapaAgenda.put("email1", "nayara.andrade@gmail.com");
        mapaAgenda.put("email2", "nayara.andrade.djs@gmail.com");

        mapaAgenda  = agendaContatos.get("Ryan");
        mapaAgenda.put("email1", "ryan.andrade@gmail.com");
        mapaAgenda.put("email2", "ryan.andrade.211206@gmail.com");
        System.out.println(agendaContatos);

        System.out.println();
        System.out.println("AGENDA DE ALUNOS ADD");
        addAlunos("Diego Sena", Map.entry("email1", "diegosilva.sena7@gmail.com"));
        System.out.println(agendaContatos);
    }

    public static void addAlunos(String nomeAluno, Map.Entry<String, String > contato){
        if (!agendaContatos.containsKey(nomeAluno)){
            agendaContatos.put(nomeAluno, new HashMap<>());
        }
        Map<String, String> mapAlunos = agendaContatos.get(nomeAluno);
        mapAlunos.put(contato.getKey(), contato.getValue());
    }
}
