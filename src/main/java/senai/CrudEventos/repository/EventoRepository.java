package senai.CrudEventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import senai.CrudEventos.entites.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
	
}

