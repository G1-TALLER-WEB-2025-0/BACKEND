package Plataforma_Educativa.controller;

import Plataforma_Educativa.model.dto.ContenidoDTO;
import Plataforma_Educativa.service.ContenidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contenidos")
public class ContenidoController {
    private final ContenidoService contenidoService;

    public ContenidoController(ContenidoService contenidoService) {
        this.contenidoService = contenidoService;
    }

    @PostMapping("/")
    public ResponseEntity<ContenidoDTO> subirVideo(@RequestBody ContenidoDTO contenidoDTO) {
        return ResponseEntity.ok(contenidoService.subirVideo(contenidoDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContenidoDTO> obtenerContenidoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(contenidoService.obtenerContenidoPorId(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<ContenidoDTO>> obtenerTodosLosContenidos() {
        return ResponseEntity.ok(contenidoService.obtenerTodosLosContenidos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContenidoDTO> editarContenido(@PathVariable Long id, @RequestBody ContenidoDTO contenidoDTO) {
        return ResponseEntity.ok(contenidoService.editarContenido(id, contenidoDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarContenido(@PathVariable Long id) {
        contenidoService.eliminarContenido(id);
        return ResponseEntity.ok("Contenido eliminado correctamente");
    }
}
