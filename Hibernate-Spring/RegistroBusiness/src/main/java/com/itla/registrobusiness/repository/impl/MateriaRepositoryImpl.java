/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Materia;
import com.itla.registrobusiness.repository.MateriaRepository;
import java.util.ArrayList;
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
public class MateriaRepositoryImpl implements MateriaRepository{

    private SessionFactory sessionFactory;

    public MateriaRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    
    @Override
    public void save(Materia entity) {
        
    }

    @Override
    public void update(Materia entity) {
        
    }

    @Override
    public Materia findById(Long id) {
        Session session=sessionFactory.openSession();
        Query query=session.getNamedQuery(Materia.FIND_MATERIA_BY_ID);
        query.setParameter("materiaId", id);
    
        return (Materia) query.uniqueResult();
    }

    @Override
    public List<Materia> findAll() {
        return null;
    }
    
}
