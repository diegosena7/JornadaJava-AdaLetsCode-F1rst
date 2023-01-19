package orientacao_objetos_solid.project;

public class Aluno implements Participante{

    private Integer matricula;
    private String nome;
    private String apelido;

    public Aluno(Integer matricula, String nome, String apelido) {
        this.matricula = matricula;
        this.nome = nome;
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Matricula = " + matricula +
                ", Nome = '" + nome + '\'' +
                ", Apelido = '" + apelido + '\'' +
                '}';
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public Integer getMatriculaParticipante() {
        return matricula;
    }

    @Override
    public String getNomeParticipante() {
        return "Aluno: " + this.getNome() + " - " + "Apelido: " + this.getApelido();
    }

    @Override
    public int compareTo(Participante o) {
        return this.nome.compareTo(o.getNomeParticipante());
    }
}
