package orientacao_objetos_solid.project.solid.o.exemplo;

import orientacao_objetos_solid.project.solid.s.exemplo.Funcionario;

public class CalculaSalarioFuncionarioTerceirizado implements SalarioFuncionarios{

    @Override
    public Double calculaSalarioFuncionarios(Funcionario funcionario) {
        return funcionario.getSalario() - funcionario.getSalario() * 0.08;
    }
}
