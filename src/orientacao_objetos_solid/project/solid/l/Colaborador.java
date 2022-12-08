package orientacao_objetos_solid.project.solid.l;

public class Colaborador {
    public String nome;

    public Integer idade;

    public Colaborador(String nomePessoa, Integer idadePessoa){
        this.nome = nomePessoa;
        this.idade = idadePessoa;
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

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
