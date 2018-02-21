/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Sesion;
import com.itla.registrobusiness.repository.SesionRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jpelegrino
 */
@Repository
public  class SesionRepositoryImpl implements SesionRepository{
    
    
    private SessionFactory sessionFactory;

    public SesionRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    

    @Override
    public void save(Sesion entity) {
        Session session=sessionFactory.openSession();
        session.persist(entity);
        session.flush();        
    }

    @Override
    public void update(Sesion entity) {
       
    }

    @Override
    public Sesion findById(Long id) {
       return null;
    }

    @Override
    public List<Sesion> findAll() {
      return null;
    }
    
}
