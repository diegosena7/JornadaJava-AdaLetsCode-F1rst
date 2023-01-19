package orientacao_objetos_solid.project;

import java.util.Comparator;

public class ComparaParticipantsPorMatricula implements Comparator<Participante> {
    @Override
    public int compare(Participante p1, Participante p2) {
        return p1.getMatriculaParticipante().compareTo(p2.getMatriculaParticipante());
    }
}
