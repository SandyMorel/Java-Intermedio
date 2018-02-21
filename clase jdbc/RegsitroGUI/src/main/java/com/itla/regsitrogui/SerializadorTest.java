/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import com.itla.registrobusiness.entity.Horario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy
 */
public class SerializadorTest {

    public static void main(String[] args) {

        File file = new File("src/main/Resources/Datos/DB");

        OutputStream outputStream = null;
        ObjectOutputStream objecOutputStream = null;

        try {
            outputStream = new FileOutputStream(file);
            objecOutputStream = new ObjectOutputStream(outputStream);

            Horario horario = new Horario();
            horario.setDescripcion("Lun-Mier 9:00-13:00");
            horario.setId(1L);
            
           objecOutputStream.writeObject(horario);
           
           System.out.println("Guardado");
           

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializadorTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerializadorTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
