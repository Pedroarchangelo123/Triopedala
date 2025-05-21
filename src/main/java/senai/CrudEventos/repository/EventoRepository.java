
package senai.CrudEventos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import senai.CrudEventos.entities.Evento;
@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
	
}

