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
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumnossur
 */
@Stateless
public class ServicioBean implements ServicioBeanLocal {
    
    @PersistenceContext(unitName = "conexionPU")
    private EntityManager em;
    

    @Override
    public List<Perfil> getPerfiles() {
        //listar datos de perfil
       return em.createQuery("select p from Perfil p").getResultList();
    }

    @Override
    public List<Producto> getProductos() {
          //listar datos de productos
       return em.createQuery("select c from Producto c").getResultList();
    }

    @Override
    public List<Categoria> getCategorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Object o) {
       em.persist(o);
    }

    @Override
    public Producto buscarProducto(int id) {
        return em.find(Producto.class, id);
    }

    @Override
    public Perfil buscarPerfil(int id) {
      return em.find(Perfil.class, id); 
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
