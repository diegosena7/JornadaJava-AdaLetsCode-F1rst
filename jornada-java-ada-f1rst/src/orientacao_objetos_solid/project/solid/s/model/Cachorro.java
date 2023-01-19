package orientacao_objetos_solid.project.solid.s.model;

public class Cachorro implements Comparable<Cachorro>{

    private String nome;
    private Integer idade;
    private String raca;

    public Cachorro(String nome, Integer idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

//    public void addCachorro(Cachorro cachorroList){
//        List<Cachorro> cachorros = new ArrayList<>();
//        cachorros.add(cachorroList);
//    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "Nome = " + nome  +
                " - Idade = " + idade +
                " - Raca = " + raca  +
                "}" + "\n";
    }

    @Override
    public int compareTo(Cachorro doguinho) {
        return this.nome.compareTo(doguinho.getNome());
    }
}
