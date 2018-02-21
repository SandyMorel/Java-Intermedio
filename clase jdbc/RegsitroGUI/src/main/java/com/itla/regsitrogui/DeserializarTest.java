/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import com.itla.registrobusiness.entity.Horario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy
 */
public class DeserializarTest {

    public static void main(String[] args) {

        File file = new File("src/main/Resources/Datos/DB");

        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            
            
            Horario horario=(Horario) objectInputStream.readObject();
            System.out.println("Horario::"+horario.getId());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeserializarTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DeserializarTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeserializarTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
