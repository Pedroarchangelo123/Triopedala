package senai.CrudEventos.DTO;

import senai.CrudEventos.entities.Evento;
import senai.CrudEventos.entities.Participantes;

public class RegistroDTO {
	    private Long eventoId;
	    private Long participanteId;
		public Long getEventoId() {
			return eventoId;
		}
		public void setEventoId(Long eventoId) {
			this.eventoId = eventoId;
		}
		public Long getParticipanteId() {
			return participanteId;
		}
		public void setParticipanteId(Long participanteId) {
			this.participanteId = participanteId;
		}
		public RegistroDTO() {
		}
		public RegistroDTO(Long eventoId, Long participanteId) {
			this.eventoId = eventoId;
			this.participanteId = participanteId;
		} 
		public RegistroDTO(Evento entity) {
			eventoId = entity.getId();
		} 
		public RegistroDTO(Participantes tia) {
			participanteId = tia.getId();
		} 
		
}