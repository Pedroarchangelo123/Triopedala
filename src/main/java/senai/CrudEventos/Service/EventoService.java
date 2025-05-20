package senai.CrudEventos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import Repository.EventoRepository;
import Repository.ParticipanteRepository;
import jakarta.transaction.Transactional;
import senai.CrudEventos.entites.Evento;
import senai.CrudEventos.entites.Participantes;


@Service
public class EventoService {

    private final EventoRepository eventoRepository;
    private final ParticipanteRepository participanteRepository;

    @Autowired
    public EventoService(EventoRepository eventoRepository, 
                        ParticipanteRepository participanteRepository) {
        this.eventoRepository = eventoRepository;
        this.participanteRepository = participanteRepository;
    }

    @SuppressWarnings("rawtypes")
	@Transactional
    public void inscreverParticipante(Long eventoId, Long participanteId) throws Exception {
        Evento evento = eventoRepository.findById(eventoId)
                .orElseThrow(() -> new IllegalArgumentException("Evento não encontrado"));
        
        ParticipanteRepository participante = participanteRepository.findById(participanteId)
                .orElseThrow(() -> new IllegalArgumentException("Participante não encontrado"));

            throw new Exception("Evento sem vagas disponíveis");
}
    }
