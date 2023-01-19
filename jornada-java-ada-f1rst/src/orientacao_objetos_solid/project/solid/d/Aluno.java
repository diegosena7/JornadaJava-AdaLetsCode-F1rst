package orientacao_objetos_solid.project.solid.d;

public class Aluno {

    private String nome;
    private Long matricula;

    private String destinatario;

    public Aluno(String nome, Long matricula, String destinatario) {
        this.nome = nome;
        this.matricula = matricula;
        this.destinatario = destinatario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
