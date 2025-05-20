package senai.CrudEventos.DTO;

import java.time.LocalDateTime;
import java.util.Optional;

import lombok.Data;

	public class ParticipantDTO {
	    private Long id;
	    private String name;
	    private String email;
	    private String phone;
	    private LocalDateTime createdAt;
		public Optional findById(Long participantId) {
			// TODO Auto-generated method stub
			return null;
		}
	}
