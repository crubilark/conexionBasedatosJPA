/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.trampa;

import cl.entities.Historial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumnossur
 */
@Stateless
public class HistorialFacade extends AbstractFacade<Historial> implements HistorialFacadeLocal {

    @PersistenceContext(unitName = "conexionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistorialFacade() {
        super(Historial.class);
    }
    
}
