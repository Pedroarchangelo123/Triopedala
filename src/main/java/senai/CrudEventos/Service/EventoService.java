package senai.CrudEventos.Service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import senai.CrudEventos.entities.Evento;
import senai.CrudEventos.entities.Participantes;
import senai.CrudEventos.repository.EventoRepository;
import senai.CrudEventos.repository.ParticipanteRepository;





@Service
public class EventoService {
	 @Autowired
	    private EventoRepository eventoRepository;

	    @Autowired
	    private ParticipanteRepository participanteRepository;

	    public Evento criarEvento(Evento evento) {
	        return eventoRepository.save(evento);
	    }
	    @Transactional
	    public List<Evento> listarEventos() {
	        return eventoRepository.findAll();
	    }
	    @Transactional
	    public Evento atualizarEvento(Long id, Evento novoEvento) {
	        Evento evento = eventoRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

	        evento.setNome(novoEvento.getNome());
	        evento.setLocal(novoEvento.getLocal());
	        evento.setVagas(novoEvento.getVagas());

	        return eventoRepository.save(evento);
	    }
	    @Transactional
	    public void deletarEvento(Long id) {
	        eventoRepository.deleteById(id);
	    }
	    @Transactional
	    public String inscreverParticipante(Long eventoId, Long participanteId) {
	        Evento evento = eventoRepository.findById(eventoId)
	                .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

	        Participantes participante = participanteRepository.findById(participanteId)
	                .orElseThrow(() -> new RuntimeException("Participante não encontrado"));

	        if (evento.getParticipantes().contains(participante)) {
	            return "Participante já inscrito neste evento.";
	        }

	        if (evento.getParticipantes().size() >= evento.getVagas()) {
	            return "Evento lotado.";
	        }

	        evento.getParticipantes().add(participante);
	        eventoRepository.save(evento);
	        return "Inscrição realizada com sucesso!";
	    }
	    @Transactional
	    public String cancelarInscricao(Long eventoId, Long participanteId) {
	        Evento evento = eventoRepository.findById(eventoId)
	                .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

	        Participantes participante = participanteRepository.findById(participanteId)
	                .orElseThrow(() -> new RuntimeException("Participante não encontrado"));


	        if (!evento.getParticipantes().contains(participante)) {
	            return "Participante não está inscrito neste evento.";
	        }

	        evento.getParticipantes().remove(participante);
	        eventoRepository.save(evento);
	        return "Inscrição cancelada com sucesso.";
	    }
	    @Transactional
	    public Set<Participantes> listarParticipantes(Long eventoId) {
	        Evento evento = eventoRepository.findById(eventoId)
	                .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

	        return evento.getParticipantes();
	    }
	}