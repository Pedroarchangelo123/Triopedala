package senai.CrudEventos.DTO;

import senai.CrudEventos.entities.Evento;

public class EventDTO {
    private Long id;
    private String nome;  
    private int vagas;  
    private String Local;
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
		return Local;
	}
	public void setLocal(String local) {
		Local = local;
	}
	public EventDTO(Long id, String nome, int vagas, String local) {
		this.id = id;
		this.nome = nome;
		this.vagas = vagas;
		Local = local;
	}
	public EventDTO() {
	}
	public EventDTO(Evento evento) {
       id = evento.getId();
       nome = evento.getNome();
        vagas = evento.getVagas();
        Local = evento.getLocal();
    }

}