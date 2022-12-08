package orientacao_objetos_solid.project;

public class Professor implements Participante{

    private Integer matricula;
    private String nome;
    private String disciplina;

    public Professor(Integer matricula, String nome, String disciplina) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "Matricula = " + matricula +
                ", Nome = '" + nome + '\'' +
                ", Disciplina = '" + disciplina + '\'' +
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public Integer getMatriculaParticipante() {
        return matricula;
    }

    @Override
    public String getNomeParticipante() {
        return "Prof. " + this.getNome() + " - " + this.getDisciplina();
    }

    @Override
    public int compareTo(Participante o) {
        return this.nome.compareTo(o.getNomeParticipante());
    }
}
