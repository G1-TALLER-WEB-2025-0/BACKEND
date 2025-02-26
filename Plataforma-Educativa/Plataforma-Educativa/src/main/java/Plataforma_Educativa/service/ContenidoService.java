package Plataforma_Educativa.service;

import Plataforma_Educativa.model.dto.ContenidoDTO;
import java.util.List;

public interface ContenidoService {
    ContenidoDTO subirVideo(ContenidoDTO contenidoDTO);
    ContenidoDTO obtenerContenidoPorId(Long id);
    List<ContenidoDTO> obtenerTodosLosContenidos();
    ContenidoDTO editarContenido(Long id, ContenidoDTO contenidoDTO);
    void eliminarContenido(Long id);
    byte[] descargarContenido(Long id);
}
