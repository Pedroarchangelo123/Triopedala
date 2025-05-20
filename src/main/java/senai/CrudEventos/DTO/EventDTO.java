package senai.CrudEventos.DTO;

import java.time.LocalDateTime;

public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime date;
    private String location;
    private Integer maxParticipants;
    private LocalDateTime createdAt;
}