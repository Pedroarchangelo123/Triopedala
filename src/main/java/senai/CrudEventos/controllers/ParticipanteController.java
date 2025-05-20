package senai.CrudEventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import senai.CrudEventos.Service.ParticipanteService;
import senai.CrudEventos.entites.Participantes;

public class ParticipanteController {
	 @Autowired
	    private ParticipanteService participanteService;

	    @PostMapping
	    public ResponseEntity<Participantes> cadastrarParticipante(@RequestBody Participantes participante) {
	        return ResponseEntity.ok(participanteService.cadastrarParticipante(participante));
	    }

}
