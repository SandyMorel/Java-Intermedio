/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy
 */
public class ReadFileHandler {

    public static void main(String[] args) {
        InputStream is = null;
        BufferedReader br = null;
        File file= new File("src/main/Resources/datos/Archivo");

        try {
            is = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(is));

            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                is.close();
                br.close();

            } catch (IOException ex) {
                Logger.getLogger(ReadFileHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
