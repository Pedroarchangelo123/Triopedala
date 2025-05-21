package senai.CrudEventos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import senai.CrudEventos.entities.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {

	  int countByEventoId(Long eventoId);
}
