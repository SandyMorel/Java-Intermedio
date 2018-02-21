/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.entity;

/**
 *
 * @author jpelegrino
 */
public class Estudiante extends Persona{
   
    private String matricula;

   
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "["+nombre+" "+apellido+" "+matricula+"]";
    }
    
    
    
    
    
}
