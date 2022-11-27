package aula.project.solid.o.exemplo;

import aula.project.solid.s.exemplo.Funcionario;

/*
    Open Close
A classe deve ser aberta para extensão, mas fechada para modificação.
 */
public interface SalarioFuncionarios {

    public Double calculaSalarioFuncionarios(Funcionario funcionario);
}
