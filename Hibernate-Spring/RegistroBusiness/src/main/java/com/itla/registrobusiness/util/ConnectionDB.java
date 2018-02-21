/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author jpelegrino
 */
public class ConnectionDB {
    
    private Connection connection;
    
    private void loadDriver(String driverName) throws ClassNotFoundException {
        Class.forName(driverName);
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Properties prop=PropertyDB.getInstance();
        loadDriver(prop.getProperty("jdbc.driver"));
        
        connection=DriverManager.getConnection(prop.getProperty("jdbc.url"),
                prop.getProperty("jdbc.username"), prop.getProperty("jdbc.password"));
        
        return connection;
    }
    
}
