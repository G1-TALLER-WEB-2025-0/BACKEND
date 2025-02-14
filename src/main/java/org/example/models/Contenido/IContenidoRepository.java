package dominio.Contenido;

import dominio.Contenido.modelo.Contenido;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class IContenidoRepository extends Contenido {

    /**
     * Default constructor
     */
    public IContenidoRepository() {
    }

    /**
     * 
     */
    public void crearUsuario(Contenido contenido);

    /**
     * 
     */
    public void eliminarUsuario(Contenido contenido);

    /**
     * 
     */
    public void actualizarUsuario(Contenido contenido);

    /**
     * 
     */
    public void obtenerUsuario(Contenido contenido);

}