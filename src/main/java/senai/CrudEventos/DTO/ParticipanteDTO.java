package senai.CrudEventos.DTO;

import senai.CrudEventos.entities.Participantes;

public class ParticipanteDTO {
private Long id;
    
    private String nome;

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

	public ParticipanteDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public ParticipanteDTO() {
	}
	   public ParticipanteDTO(Participantes participante) {
	        this.id = participante.getId();
	        this.nome = participante.getNome();
	    }
}
