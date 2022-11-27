package aula.project.solid.o.exemplo;

import aula.project.solid.s.exemplo.Funcionario;

public class CalculaSalarioFuncionarioTerceirizado implements SalarioFuncionarios{

    @Override
    public Double calculaSalarioFuncionarios(Funcionario funcionario) {
        return funcionario.getSalario() - funcionario.getSalario() * 0.08;
    }
}
