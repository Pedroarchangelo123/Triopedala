package senai.CrudEventos.entities;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_registros")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relacionamento ManyToOne com Evento
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    // Relacionamento ManyToOne com Participantes
    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Participantes participante;

    // Exemplo de campo extra: data da inscrição
    private LocalDateTime dataInscricao;

    // Construtores
    public Registro() {
        this.dataInscricao = LocalDateTime.now();
    }

    public Registro(Evento evento, Participantes participante) {
        this.evento = evento;
        this.participante = participante;
        this.dataInscricao = LocalDateTime.now();
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Participantes getParticipante() {
        return participante;
    }

    public void setParticipante(Participantes participante) {
        this.participante = participante;
    }

    public LocalDateTime getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDateTime dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
}
