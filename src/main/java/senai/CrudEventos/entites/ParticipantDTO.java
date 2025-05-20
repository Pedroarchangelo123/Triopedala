package senai.CrudEventos.entites;

import java.time.LocalDateTime;
import java.util.Optional;

	public class ParticipantDTO {
	    private Long id;
	    private String name;
	    private String email;
	    private String phone;
	    private LocalDateTime createdAt;
		public Optional findById(Long participantId) {
			return null;
		}
	}
