package senai.CrudEventos.DTO;
import java.util.Set;
import java.util.stream.Collectors;

import senai.CrudEventos.entities.Evento;

public class EventoComParticipantesDTO {

    private Long id;
    private String nome;
    private int vagas;
    private String local;
    private Set<ParticipanteDTO> participantes;

    public EventoComParticipantesDTO(Evento evento) {
        this.id = evento.getId();
        this.nome = evento.getNome();
        this.vagas = evento.getVagas();
        this.local = evento.getLocal();
        // Convertendo participantes para DTOs
        this.participantes = evento.getParticipantes().stream()
            .map(ParticipanteDTO::new)
            .collect(Collectors.toSet());
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Set<ParticipanteDTO> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Set<ParticipanteDTO> participantes) {
		this.participantes = participantes;
	}

    
}
