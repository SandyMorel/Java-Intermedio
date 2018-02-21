/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Horario;
import com.itla.registrobusiness.repository.HorarioRepository;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jpelegrino
 */
@Repository
public class HorarioRepositoryImpl implements HorarioRepository{
    
    private SessionFactory sessionFactory;

    public HorarioRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    

    @Override
    public void save(Horario entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Horario entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Horario findById(Long id) {
        Session session=sessionFactory.openSession();
        Query query=session.getNamedQuery(Horario.FIND_HORARIO_BY_ID);
        query.setParameter("horarioId", id);
        
        return (Horario) query.uniqueResult();
        
    }

    @Override
    public List<Horario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
