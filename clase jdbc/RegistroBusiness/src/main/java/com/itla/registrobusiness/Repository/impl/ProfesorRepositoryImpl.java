/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.Util.ConnectionDB;
import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.repository.ProfesorRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoseLuis
 */
public class ProfesorRepositoryImpl implements ProfesorRepository {

    private Logger LOG = Logger.getLogger(ProfesorRepositoryImpl.class.getName());

    private PreparedStatement ps;

    private List<Profesor> profesorList = new ArrayList<>();

    public ProfesorRepositoryImpl() {

    }

    @Override
    public void save(Profesor entity) {
        Connection connection = null;
        try {
            connection = new ConnectionDB().getConnection();
            String QUERY = "INSERT INTO profesor(nombre,apellido,correo) values(?,?,?)";
            ps = connection.prepareStatement(QUERY);

            ps.setString(1, entity.getNombre());
            ps.setString(2, entity.getApellido());
            ps.setString(3, entity.getCorreo());

            ps.executeUpdate();

            LOG.log(Level.INFO, "Profesor guardado con exito");

            ps = connection.prepareStatement(QUERY);
        } catch (ClassNotFoundException ex) {
            LOG.log(Level.SEVERE, ex.getMessage(), ex);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                LOG.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

    }

    @Override
    public void update(Profesor entity) {
        int index = profesorList.indexOf(entity);
        profesorList.set(index, entity);
    }

    @Override
    public Profesor finById(Long id) {
        Connection connection = null;
        try {
            connection = new ConnectionDB().getConnection();
            String QUERY = "SELECT * FROM profesor WHERE id_profesor=?";
            ps = connection.prepareStatement(QUERY);
            ps.setInt(1,id.intValue());
            ResultSet res=ps.executeQuery();
            res.next();
            
            Profesor profesor=getProfesor(res);
            
        } catch (ClassNotFoundException ex) {
           LOG.log(Level.SEVERE, ex.getMessage(), ex);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, ex.getMessage(), ex);
        }finally{
            try {
                ps.close();
                connection.close();
            } catch (SQLException ex) {
                 LOG.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return null;
    }

    @Override
    public List<Profesor> findAll() {
        return profesorList;
    }

    private Profesor getProfesor(ResultSet res) throws SQLException{
        Profesor profesor= new Profesor();
        profesor.setId(res.getLong(1));
        profesor.setNombre(res.getString("nombre"));
        profesor.setCorreo(res.getString("apellido"));
        profesor.setCorreo(res.getString("correo"));
        
        return profesor;
        
    }
}
