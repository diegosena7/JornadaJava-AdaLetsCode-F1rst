package orientacao_objetos_solid.project.solid.o.exemplo;

import orientacao_objetos_solid.project.solid.s.exemplo.Funcionario;

/*
    Open Close
A classe deve ser aberta para extensão, mas fechada para modificação.
 */
public interface SalarioFuncionarios {

    public Double calculaSalarioFuncionarios(Funcionario funcionario);
}
