package dominio.Usuario;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class IAdministradorRepository {

    /**
     * Default constructor
     */
    public IAdministradorRepository() {
    }

    /**
     * 
     */
    public void crearUsuario(User usuario);

    /**
     * 
     */
    public void eliminarUsuario(User usuario);

    /**
     * 
     */
    public void actualizarUsuario(User usuario);

    /**
     * 
     */
    public void obtenerUsuario(User usuario);

}