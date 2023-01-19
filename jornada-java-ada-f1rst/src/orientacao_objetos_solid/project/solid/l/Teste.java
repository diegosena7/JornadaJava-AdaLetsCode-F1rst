package orientacao_objetos_solid.project.solid.l;

/*
    Liskov Substitution Principle:
Princípio da substituição de Liskov — Uma classe derivada deve ser substituível por sua classe base.
 */
public class Teste {
    public static void main(String[] args) {
        Colaborador pessoa = new Colaborador("Diego", 33);
        Desenvolvedor colaborador = new Desenvolvedor("Ryan", 16);
        TesterQA testerQA = new TesterQA("Nayara", 34);
        System.out.println(Teste.imprimeDados(pessoa));
        System.out.println(Teste.imprimeDados(colaborador));
        System.out.println(Teste.imprimeDados(testerQA));
    }

    public static String imprimeDados (Colaborador pessoa){
        return "Nome: " + pessoa.getNome() + " - Idade: " + pessoa.getIdade();
    }
}
