package senai.CrudEventos.entity;

import io.micrometer.observation.Observation.Event;
import senai.CrudEventos.entites.Evento;
import senai.CrudEventos.entites.ParticipantDTO;
import senai.CrudEventos.entites.Participantes;

public class Registro {
	    private Long id;
	    private Evento evento;
	    private ParticipantDTO participante;
	    private String status;

	    // Getters and setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }
	    public Evento getEvento() { return evento; }
	    public void setStatus(String status) { this.status = status; }
		public void setEvento(Event evento2) {
		}
}
