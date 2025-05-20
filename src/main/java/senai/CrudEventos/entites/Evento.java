package senai.CrudEventos.entites;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private int vagas;
    
    private String Local;
    

    public Evento(Long id, String nome, int vagas, String local, Set<Participantes> participantes) {
		this.id = id;
		this.nome = nome;
		this.vagas = vagas;
		Local = local;
		this.participantes = participantes;
	}

	public Evento() {
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}

	@ManyToMany
    @JoinTable(
        name = "evento_participante",
        joinColumns = @JoinColumn(name = "evento_id"),
        inverseJoinColumns = @JoinColumn(name = "participante_id")
    )
    private Set<Participantes> participantes = new HashSet<>();

    public void setParticipantes(Set<Participantes> participantes) {
        this.participantes = participantes;
    }

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

	public Set<Participantes> getParticipantes() {
		return participantes;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}




}
