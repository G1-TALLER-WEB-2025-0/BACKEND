package Plataforma_Educativa.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;

    @OneToMany(mappedBy = "docente", cascade = CascadeType.ALL)
    private List<Curso> cursos;
}
