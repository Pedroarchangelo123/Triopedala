
package senai.CrudEventos.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import senai.CrudEventos.entities.Participantes;
@Repository
public interface ParticipanteRepository extends JpaRepository<Participantes, Long> {}