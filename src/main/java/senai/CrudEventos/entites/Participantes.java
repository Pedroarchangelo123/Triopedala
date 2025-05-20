package senai.CrudEventos.entites;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Participantes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;

    @ManyToMany(mappedBy = "participantes")
    private Set<Evento> eventos = new HashSet<>();

    // Getters e Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Set<Evento> getEventos() { return eventos; }

    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }

	public int getVagas() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getParticipantes() {
		// TODO Auto-generated method stub
		return null;
	}

	}