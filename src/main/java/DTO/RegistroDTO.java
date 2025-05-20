package DTO;

	import lombok.Data;
	import java.time.LocalDateTime;

	public class RegistroDTO {
	    private Long id;
	    private Long eventId;
	    private Long participantId;
	    private LocalDateTime registrationDate;
	    private String status;
	}