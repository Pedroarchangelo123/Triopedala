package senai.CrudEventos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senai.CrudEventos.entities.Participantes;
import senai.CrudEventos.repository.ParticipanteRepository;


@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public Participantes cadastrarParticipante(Participantes participante) {
        return participanteRepository.save(participante);
    }
}
