package senai.CrudEventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.servlet.Registration;

import java.util.List;
import java.util.Optional;

	public interface RegistrationRepository extends JpaRepository<Registration, Long> {
	    boolean existsByEventIdAndParticipantId(Long eventId, Long participantId);
	    
	    @Query("SELECT COUNT(r) FROM Registration r WHERE r.event.id = :eventId AND r.status = 'ACTIVE'")
	    int countActiveRegistrationsByEventId(@Param("eventId") Long eventId);
	    
	    List<Registration> findByEventId(Long eventId);
	    
	    Optional<Registration> findByEventIdAndParticipantId(Long eventId, Long participantId);

		int countByEventIdAndStatus(Long eventId, String string);

		Object findByEventoIdAndParticipanteId1(Long eventoId, Long participanteId);

	}