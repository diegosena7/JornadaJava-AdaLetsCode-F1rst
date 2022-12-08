package orientacao_objetos_solid.project.solid.s.interfaces.implement;

import orientacao_objetos_solid.project.solid.s.interfaces.Agenda;

import java.time.LocalDate;

public class Reservas implements Agenda {

    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public Reservas() {
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public boolean temVaga(LocalDate data) {
        if(data.isBefore(LocalDate.now())){
            return true;
        }
        return false;
    }

    @Override
    public String reserva(LocalDate dtInicial, LocalDate dtFinal) {
        if(temVaga(dtInicial)){
            return "Reserva efetuada com sucesso.";
        }
        return "Não temos vagas para a data informada.";
    }

    @Override
    public String agendaVisitar(LocalDate data) {
        if(temVaga(data)){
            return "Visita efetuada com sucesso.";
        }
        return "Não temos vagas para a data informada.";
    }
}
