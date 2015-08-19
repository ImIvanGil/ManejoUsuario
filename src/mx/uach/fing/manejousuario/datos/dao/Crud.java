
package mx.uach.fing.manejousuario.datos.dao;

import java.util.List;
import mx.uach.fing.manejousuario.datos.Usuario;
/**
 *
 * @author Ivan Gil
 */
public interface Crud {
    
    public List<Usuario> list();
    
    public void create(Usuario usuario);
    public void update(Usuario usuario);
    public void delete(Usuario usuario);
}
