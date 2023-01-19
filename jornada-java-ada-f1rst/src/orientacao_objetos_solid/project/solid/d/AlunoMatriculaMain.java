package orientacao_objetos_solid.project.solid.d;

/*
DIP — Dependency Inversion Principle:
Princípio da Inversão de Dependência — Dependa de abstrações e não de implementações.
 */
public class AlunoMatriculaMain {
    public static void main(String[] args) {

        ComunicacaoService comunicacaoService = new EmailService();
        MatriculaService matriculaService = new MatriculaService(comunicacaoService);
        matriculaService.realizarMatricula(new Aluno("Diego", 766l, "diego.sena@gmail.com"));//envia e-mail
    }
}
