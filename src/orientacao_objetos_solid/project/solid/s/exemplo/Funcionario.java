package orientacao_objetos_solid.project.solid.s.exemplo;

import java.time.LocalDate;

/*
    Single Responsibility
Uma classe sempre deve ter uma responsabilidade e deve haver apenas um único motivo para alterá-la.
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private LocalDate dataContratacao;
    private Double salario;

    private TipoFuncionario tipoFuncionario;

    public Funcionario(String nome, String sobrenome, LocalDate dataContratacao, Double salario, TipoFuncionario tipoFuncionario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", salario=" + getSalario() +
                ", tipoFuncionario=" + tipoFuncionario +
                '}';
    }
}
