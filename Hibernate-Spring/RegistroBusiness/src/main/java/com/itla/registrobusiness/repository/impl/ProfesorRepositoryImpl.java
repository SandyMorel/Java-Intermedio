/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.repository.ProfesorRepository;
import com.itla.registrobusiness.util.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jpelegrino
 */
@Repository
public class ProfesorRepositoryImpl implements ProfesorRepository{
    private Logger LOG=Logger.getLogger(ProfesorRepositoryImpl.class.getName());
   
    private SessionFactory sessionFactory;
    
   
    public ProfesorRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    
    
    
    @Override
    public void save(Profesor entity) {
        Session session=sessionFactory.openSession();
        session.persist(entity);
        session.flush();
        
    }

    @Override
    public void update(Profesor entity) {
        
    }

    @Override
    public Profesor findById(Long id) {
       Session session=sessionFactory.openSession();
       Profesor profesor=(Profesor) session.get(Profesor.class, id);
       return profesor; 
        
    }

    @Override
    public List<Profesor> findAll() {
        return null;
    }

    private Profesor getProfesor(ResultSet res) throws SQLException {
        Profesor profesor=new Profesor();
        
        profesor.setId(res.getLong(1));
        profesor.setNombre(res.getString("nombre"));
        profesor.setApellido(res.getString("apellido"));
        profesor.setCorreo(res.getString("correo"));
        
        return profesor;
    }

    
    
}
