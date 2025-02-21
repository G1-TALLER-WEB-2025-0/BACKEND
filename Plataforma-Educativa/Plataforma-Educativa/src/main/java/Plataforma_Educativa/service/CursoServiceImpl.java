package Plataforma_Educativa.service;

import Plataforma_Educativa.mapper.ProjectMapper;
import Plataforma_Educativa.model.dto.CursoDTO;
import Plataforma_Educativa.model.entity.Curso;
import Plataforma_Educativa.repository.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl implements CursoService {
    private final CursoRepository cursoRepository;

    @Override
    public Curso crearCurso(int docenteID, Curso curso) {
        // Aquí podrías validar la existencia del docente antes de guardar el curso
        return cursoRepository.save(curso);
    }

    @Override
    public void asignarEstudiante(int cursoID, int estudianteID) {
        // Implementar lógica para relacionar estudiante con curso en la BD
        System.out.println("Asignando estudiante " + estudianteID + " al curso " + cursoID);
    }

    @Override
    public void eliminarCurso(int cursoID) {
        cursoRepository.deleteById((long) cursoID);
    }

    @Override
    public List<Curso> obtenerCursosPorDocente(int docenteID) {
        // Implementar lógica para buscar cursos de un docente (si hay relación con una entidad Docente)
        return cursoRepository.findAll(); // Temporalmente retorna todos
    }

    @Override
    public Curso obtenerCursoPorID(int cursoID) {
        Optional<Curso> curso = cursoRepository.findById((long) cursoID);
        return curso.orElse(null);
    }
}
