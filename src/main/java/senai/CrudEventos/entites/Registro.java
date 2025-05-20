package senai.CrudEventos.entites;

import io.micrometer.observation.Observation.Event;
import senai.CrudEventos.DTO.ParticipantDTO;

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
			// TODO Auto-generated method stub
		}
}
