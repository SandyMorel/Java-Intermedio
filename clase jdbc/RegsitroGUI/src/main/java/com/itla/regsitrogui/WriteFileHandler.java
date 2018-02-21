/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy
 */
public class WriteFileHandler {
    
    public static void main(String[] args) {
        
        File fileToUpload= new File("src/main/Resources/Datos/Archivo");
        File fileToWrite= new File("src/main/Resources/Upload/Write");
        
        InputStream inputStream=null;
        OutputStream outputStream=null;
        
        try{
            inputStream= new FileInputStream(fileToUpload);
            outputStream= new FileOutputStream(fileToWrite);
            
            int n=0;
            
            while((n=inputStream.read()) !=-1){
                outputStream.write(n);
            }
            outputStream.flush();
            
        }catch(IOException ex){
            ex.printStackTrace();
            
        }finally{
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFileHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
