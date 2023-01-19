package orientacao_objetos_solid.project.solid.s.exemplo;

import java.time.LocalDate;

public class FuncionarioMain {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Diego", "Sena", LocalDate.now(), 6500.0, TipoFuncionario.CLT);
        Funcionario funcionario2 = new Funcionario("Rodolfo", "Braga", LocalDate.now(), 15000.0, TipoFuncionario.PJ);

        System.out.println("Funcionario 1: " + funcionario1);
        System.out.println("Funcionario 2: " + funcionario2);
        Double salarioDescontoFuncionario1 = ServicosFuncionario.calulaSalario(funcionario1);
        Double salarioDescontoFuncionario2 = ServicosFuncionario.calulaSalario(funcionario2);
        System.out.println("Salario com desconto funcionario 1 R$: " + salarioDescontoFuncionario1);
        System.out.println("Salario com desconto funcionario 1 R$: " + salarioDescontoFuncionario2);

    }
}
