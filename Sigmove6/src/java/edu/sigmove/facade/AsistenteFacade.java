/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sigmove.facade;

import edu.sigmove.entity.Asistente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Freddy
 */
@Stateless
public class AsistenteFacade extends AbstractFacade<Asistente> implements AsistenteFacadeLocal {

    @PersistenceContext(unitName = "Sigmove6PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsistenteFacade() {
        super(Asistente.class);
    }
    
}
