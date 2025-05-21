package senai.CrudEventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senai.CrudEventos.Service.ParticipanteService;
import senai.CrudEventos.entities.Participantes;
import senai.CrudEventos.repository.ParticipanteRepository;
@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

	    @Autowired
	    private ParticipanteService participanteService;

	    @PostMapping("/criar")
	    public ResponseEntity<Participantes> cadastrarParticipante(@RequestBody Participantes participante) {
	        return ResponseEntity.ok(participanteService.cadastrarParticipante(participante));
	    }
}
