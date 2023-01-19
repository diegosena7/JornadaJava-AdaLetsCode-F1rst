package orientacao_objetos_solid.project.solid.s.interfaces;


import java.time.LocalDate;

public interface Agenda {

    public boolean temVaga(LocalDate data);

    public String reserva(LocalDate dtInicial, LocalDate dtFinal);

    public  String agendaVisitar(LocalDate data);
}
