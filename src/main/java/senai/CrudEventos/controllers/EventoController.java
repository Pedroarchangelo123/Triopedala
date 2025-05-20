package senai.CrudEventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senai.CrudEventos.Service.EventoService;
import senai.CrudEventos.entites.Evento;
import senai.CrudEventos.entites.Participantes;

@RestController
@RequestMapping("/eventos")

public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
    public ResponseEntity<Evento> criarEvento(@RequestBody Evento evento) {
        return ResponseEntity.ok(eventoService.criarEvento(evento));
    }

    @GetMapping
    public ResponseEntity<List<Evento>> listarEventos() {
        return ResponseEntity.ok(eventoService.listarEventos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> atualizarEvento(@PathVariable Long id, @RequestBody Evento evento) {
        return ResponseEntity.ok(eventoService.atualizarEvento(id, evento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEvento(@PathVariable Long id) {
        eventoService.deletarEvento(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{eventoId}/inscrever/{participanteId}")
    public ResponseEntity<String> inscreverParticipante(
            @PathVariable Long eventoId,
            @PathVariable Long participanteId
    ) {
        return ResponseEntity.ok(eventoService.inscreverParticipante(eventoId, participanteId));
    }

    @DeleteMapping("/{eventoId}/cancelar/{participanteId}")
    public ResponseEntity<String> cancelarInscricao(
            @PathVariable Long eventoId,
            @PathVariable Long participanteId
    ) {
        return ResponseEntity.ok(eventoService.cancelarInscricao(eventoId, participanteId));
    }

    @GetMapping("/{id}/participantes")
    public ResponseEntity<List<Participantes>> listarParticipantes(@PathVariable Long id) {
        return ResponseEntity.ok(eventoService.listarParticipantes(id));
    }
}
