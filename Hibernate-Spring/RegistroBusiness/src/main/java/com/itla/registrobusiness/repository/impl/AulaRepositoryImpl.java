/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Aula;
import com.itla.registrobusiness.repository.AulaRepository;
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
public class AulaRepositoryImpl implements AulaRepository{
    
    private SessionFactory sessionFactory;

    public AulaRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    

    @Override
    public void save(Aula entity) {
        
    }

    @Override
    public void update(Aula entity) {
       
    }

    @Override
    public Aula findById(Long id) {
        Session session=sessionFactory.openSession();
        return (Aula) session.get(Aula.class, id);
    }

    @Override
    public List<Aula> findAll() {
        return null;
    }
    
}
