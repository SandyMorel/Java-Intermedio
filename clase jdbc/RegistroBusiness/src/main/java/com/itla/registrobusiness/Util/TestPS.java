/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.Util;

import com.itla.registrobusiness.entity.Profesor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 48881
 */
public class TestPS {

    private static String URL = "jdbc:mysql://localhost/schooldb";
    private static String USER = "root";
    private static String PASS = "itla";
    private static String INSERT_QUERY = "INSERT INTO profesor (nombre,apellido,correo)"
            + "values(?,?,?)";

    public static void main(String[] args) {

        Connection connection = null;
        try {
            Profesor profesor = new Profesor();
            profesor.setNombre("Pedro");
            profesor.setApellido("herrera");
            profesor.setCorreo("herrera@hotmail.com");

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);

            PreparedStatement ps = connection.prepareStatement(INSERT_QUERY);
            ps.setString(1, profesor.getNombre());
            ps.setString(2, profesor.getApellido());
            ps.setString(3, profesor.getCorreo());

            ps.executeUpdate();

            System.out.println("done");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestPS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestPS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
