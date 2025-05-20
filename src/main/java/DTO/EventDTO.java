package DTO;

import java.time.LocalDateTime;

import lombok.Data;


public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime date;
    private String location;
    private Integer maxParticipants;
    private LocalDateTime createdAt;
}