/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.beans;

import cl.entities.Categoria;
import cl.entities.Perfil;
import cl.entities.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alumnossur
 */
@Local
public interface ServicioBeanLocal {
    List<Perfil> getPerfiles();
     List<Producto> getProductos();
      List<Categoria> getCategorias();
      void save(Object o); //guarda instancia en la base de datos
      Producto buscarProducto(int id);
      Perfil buscarPerfil(int id);
    
    
    
    
}
