/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Repository.Impl;

import com.mycompany.consultoriomedicobusiness.Entity.Paciente;
import com.mycompany.consultoriomedicobusiness.Repository.PacienteRepository;
import com.mycompany.consultoriomedicobusiness.Util.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteRepositoryImpl implements PacienteRepository {

    private Logger LOG = Logger.getLogger(PacienteRepositoryImpl.class.getName());

    private PreparedStatement ps;

    private List<Paciente> PacienteList = new ArrayList<>();

    public PacienteRepositoryImpl() {

    }

    @Override
    public void save(Paciente entity) {
        Connection connection = null;
        try {
            connection = new ConnectionDB().getConnection();
            String QUERY = "INSERT INTO paciente (Nombre,Apellido,Edad,Cedula,Telefono,Direccion,Correo) values(?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(QUERY);

            ps.setString(1, entity.getNombre());
            ps.setString(2, entity.getApellido());
            ps.setString(3, entity.getEdad());
            ps.setString(4, entity.getCedula());
            ps.setString(5, entity.getTelefono());
            ps.setString(6, entity.getDireccion());
            ps.setString(7, entity.getCorreo());

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
    public void update(Paciente entity) {
        int index = PacienteList.indexOf(entity);
        PacienteList.set(index, entity);
    }

    @Override
    public Paciente finById(Long id) {
        Connection connection = null;
        try {
            connection = new ConnectionDB().getConnection();
            String QUERY = "SELECT * FROM paciente WHERE Paciente_ID=?";
            ps = connection.prepareStatement(QUERY);
            ps.setInt(1, id.intValue());
            ResultSet res = ps.executeQuery();
            res.next();

            Paciente paciente = getPaciente(res);

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

        return null;
    }

    @Override
    public List<Paciente> findAll() {
        return PacienteList;
    }

    private Paciente getPaciente(ResultSet res) throws SQLException {
        
        Paciente paciente = new Paciente();
        paciente.setID(res.getLong(1));
        paciente.setNombre(res.getString("Nombre"));
        paciente.setCorreo(res.getString("Apellido"));
        paciente.setCorreo(res.getString("Edad"));
        paciente.setNombre(res.getString("Cedula"));
        paciente.setCorreo(res.getString("Telefono"));
        paciente.setCorreo(res.getString("Direccion"));
        paciente.setCorreo(res.getString("correo"));

        return paciente;

    }

}
