package Plataforma_Educativa.controller;

import Plataforma_Educativa.model.entity.Curso;
import Plataforma_Educativa.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService cursoService;

    @PostMapping("/{docenteID}")
    public ResponseEntity<Curso> crearCurso(@PathVariable int docenteID, @RequestBody Curso curso) {
        return ResponseEntity.ok(cursoService.crearCurso(docenteID, curso));
    }

    @PostMapping("/{cursoID}/estudiantes/{estudianteID}")
    public ResponseEntity<String> asignarEstudiante(@PathVariable int cursoID, @PathVariable int estudianteID) {
        cursoService.asignarEstudiante(cursoID, estudianteID);
        return ResponseEntity.ok("Estudiante asignado al curso correctamente.");
    }

    @DeleteMapping("/{cursoID}")
    public ResponseEntity<String> eliminarCurso(@PathVariable int cursoID) {
        cursoService.eliminarCurso(cursoID);
        return ResponseEntity.ok("Curso eliminado correctamente.");
    }

    @GetMapping("/docente/{docenteID}")
    public ResponseEntity<List<Curso>> obtenerCursosPorDocente(@PathVariable int docenteID) {
        return ResponseEntity.ok(cursoService.obtenerCursosPorDocente(docenteID));
    }

    @GetMapping("/{cursoID}")
    public ResponseEntity<Curso> obtenerCursoPorID(@PathVariable int cursoID) {
        return ResponseEntity.ok(cursoService.obtenerCursoPorID(cursoID));
    }

}
