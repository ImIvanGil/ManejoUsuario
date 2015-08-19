package mx.uach.fing.manejousuario.datos;

/**
 * Clase que se encarga de manejar los usuarios del sistema.
 *
 * @author Ivan Gil Najera
 * @version 1.0
 */
public class Usuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;

    /**
     * metodo que regresa el identificador unico de cada usuario.
     *
     * @throws NullPointerException cuando no exista el usuario en la base de
     * datos.
     * @return the id (numero entero).
     */
    public Integer getId() throws NullPointerException {
        if (this.id == null) {
            throw new NullPointerException(
                    String.format("El usuario $s No existe", this.nombre));
        }
        return id;
    }

    /**
     * @param id que se asignara al usuario al ser guardado en la base de datos.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
