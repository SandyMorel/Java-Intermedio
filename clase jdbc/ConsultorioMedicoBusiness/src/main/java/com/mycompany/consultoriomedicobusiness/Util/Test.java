/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy
 */
public class Test {
    
     private static String URL = "jdbc:mysql://localhost/consultoriodb";
    private static String USER = "root";
    private static String PASS ="";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            Statement stm = connection.createStatement();
            String QUERY = "SELECT *  FROM paciente";

            ResultSet res = stm.executeQuery(QUERY);
            while (res.next()) {
                System.out.println(res.getString(1) + " " + res.getString(2));

            }

            System.out.println("done");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
}
