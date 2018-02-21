/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy
 */
public class TestJdbcProperties {

    public static void main(String[] args) {

        Properties prop = PropertyDB.getInstance();

        System.out.println(prop.getProperty("jdbc.url"));
        Connection con = null;
        try {
            con = new ConnectionDB().getConnection();
            System.out.println("con::" + con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestJdbcProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestJdbcProperties.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TestJdbcProperties.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
