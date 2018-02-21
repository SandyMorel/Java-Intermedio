/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.enums;

/**
 *
 * @author jpelegrino
 */
public enum ServiceEnum {
    PROFESOR_SERVICE("profesorService"),
    ESTUDIANTE_SERVICE("estudianteService"),
    MATERIA_SERVICE("materiaService"),
    AULA_SERVICE("aulaService"),
    SESION_SERVICE("sesionService"),
    HORARIO_SERVICE("horarioService");
    
    
    ServiceEnum(String service) {
       this.value=service;
    }
    
    private String value;

    public String getValue() {
        return value;
    }
    
    
    
}
