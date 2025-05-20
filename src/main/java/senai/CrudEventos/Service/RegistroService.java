package senai.CrudEventos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.micrometer.observation.Observation.Event;
import senai.CrudEventos.entites.Participantes;
import senai.CrudEventos.entity.Registro;
import senai.CrudEventos.repository.RegistrationRepository;

@Service
public class RegistroService {

    private static final String Observation = null;
	private final RegistrationRepository registroRepository;
    private final senai.CrudEventos.Service.EventoRepository eventoRepository;
    private final Participantes participanteRepository;

    @Autowired
    public RegistroService(RegistrationRepository registroRepository,
                           EventoRepository eventoRepository,
                           Participantes participanteRepository) {
        this.registroRepository = registroRepository;
        this.eventoRepository = eventoRepository;
        this.participanteRepository = participanteRepository;
    }

    @Transactional
    public void registrarParticipante(Long eventoId, Long participanteId) {
        Event evento =  (Event) eventoRepository;
            
        Participantes participante = (Participantes)  participanteRepository;

        if ((RegistrationRepository) registroRepository != null);
            throw new IllegalStateException("Participante já está inscrito neste evento");
    }
}