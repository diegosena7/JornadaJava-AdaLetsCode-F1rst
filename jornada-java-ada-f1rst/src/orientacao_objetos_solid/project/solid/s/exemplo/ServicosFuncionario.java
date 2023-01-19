package orientacao_objetos_solid.project.solid.s.exemplo;

public abstract class ServicosFuncionario {

    public static Double calulaSalario(Funcionario funcionario){
        if (funcionario.getTipoFuncionario() == TipoFuncionario.CLT){
            return funcionario.getSalario() - funcionario.getSalario() * 0.10;
        }else {
            return funcionario.getSalario() - funcionario.getSalario() * 0.05;
        }
    }
}
