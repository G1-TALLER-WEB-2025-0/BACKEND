package Plataforma_Educativa.service;

import Plataforma_Educativa.model.entity.Curso;
import java.util.List;

public interface CursoService {
    Plataforma_Educativa.model.entity.Curso crearCurso(int docenteID, Curso curso);
    void asignarEstudiante(int cursoID, int estudianteID);
    void eliminarCurso(int cursoID);
    List<Curso> obtenerCursosPorDocente(int docenteID);
    Curso obtenerCursoPorID(int cursoID);
}