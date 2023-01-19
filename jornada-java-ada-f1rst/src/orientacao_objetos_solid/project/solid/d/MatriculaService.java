package orientacao_objetos_solid.project.solid.d;

public class MatriculaService {
    private final ComunicacaoService comunicacaoService;

    public MatriculaService(ComunicacaoService comunicacaoService) {
        this.comunicacaoService = comunicacaoService;
    }

    public void realizarMatricula(Aluno aluno) {
        this.comunicacaoService.send("Matrícula realizada.", aluno.getDestinatario());
    }
}
