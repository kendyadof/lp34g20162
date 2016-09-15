/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.model.dao;

import com.br.lp3.model.entities.Userinfo;
import com.br.lp3.model.entities.Userlp3;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

/**
 *
 * @author 31560555
 */
@Stateful
@LocalBean
public class Userlp3DAO implements GenericDAO<Userlp3> {

    @PersistenceContext(unitName = "ProjetoBase4G-ejbPU",
            type = PersistenceContextType.TRANSACTION)
    private EntityManager em;

    @Override
    public void insert(Userlp3 e) {
        em.persist(e);
    }

    // Could not resolve a persistence unit corresponding to the 
    // persistence-context-ref-name [com.br.lp3.model.dao.Userlp3DAO/em] 
    // in the scope of the module called [ProjetoBase4G#ProjetoBase4G-ejb.jar].
    // Please verify your application.

    @Override
    public List<Userlp3> findAll() {
        Query query = em.createNamedQuery("Userlp3.findAll");
        return (List<Userlp3>) query.getResultList();
    }

    @Override
    public Userlp3 findById(long id) {
        return em.find(Userlp3.class, id);
    }

    public Userlp3 findByUsername(String username) {
        Query query = em.createNamedQuery("Userlp3.findByUsername").
                setParameter("username", username);
        Object object = null;
        try {
            object = query.getSingleResult();
            return (Userlp3) object;
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    public Userlp3 findByEmail(String email) {
        Query query = em.createNamedQuery("Userlp3.findByEmail").
                setParameter("email", email);
        Object object = null;
        try {
            object = query.getSingleResult();
            return ((Userinfo) object).getUserlp3();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public void modify(Userlp3 e) {
        em.merge(e);
    }

    @Override
    public void remove(Userlp3 e) {
        em.merge(e);
        em.remove(e);
    }

}
