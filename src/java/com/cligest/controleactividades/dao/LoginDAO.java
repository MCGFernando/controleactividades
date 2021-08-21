/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.controleactividades.dao;

import com.cligest.controleactividades.domain.Operador;
import com.cligest.controleactividades.repository.LoginRepository;
import com.cligest.controleactividades.util.PersistenceUnit;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.eclipse.persistence.internal.helper.Helper;

/**
 *
 * @author mfernando
 */
public class LoginDAO implements LoginRepository{

    @Override
    public Integer login(Operador o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operador findByCredentials(Operador o) {
        EntityManager em = PersistenceUnit.getEntityManager();
        Query query = em.createNamedQuery("Operador.findByCredentials");
        query.setParameter("login", o.getLogin()).setParameter("password", o.getPassword());
        Operador operador = (Operador) query.getSingleResult();
        return operador;
    }

    @Override
    public Operador findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Operador> findByAll() {
        EntityManager em = PersistenceUnit.getEntityManager();
        Query query = em.createNamedQuery("Operador.findAll");
        List<Operador> lista = query.getResultList();
        //PersistenceUnit.close();
        return lista;
    }
    
}
