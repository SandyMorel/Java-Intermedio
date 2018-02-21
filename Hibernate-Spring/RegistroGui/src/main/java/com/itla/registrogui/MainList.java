/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrogui;

import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.enums.ServiceEnum;
import com.itla.registrobusiness.factory.ApplicationContext;
import com.itla.registrobusiness.repository.ProfesorRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jpelegrino
 */
public class MainList {
    
    public static void main(String[] args) {
        
        
        ProfesorRepository profesorRepository=null;
        
        Profesor profesor1=new Profesor();
        profesor1.setNombre("Juan");
        profesor1.setApellido("Martinez");
        profesor1.setCodigo(1L);
        
        Profesor profesor2=new Profesor();
        profesor2.setNombre("Pedro");
        profesor2.setApellido("Gonzalez");
        profesor2.setCodigo(2L);
        
        Profesor profesor3=new Profesor();
        profesor3.setNombre("Rafael");
        profesor3.setApellido("Santana");
        profesor3.setCodigo(5L);
        
        Profesor profesor4=new Profesor();
        profesor4.setNombre("Jose");
        profesor4.setApellido("Herrera");
        profesor4.setCodigo(6L);
        
        profesorRepository.save(profesor1);
        profesorRepository.save(profesor2);
        profesorRepository.save(profesor3);
        profesorRepository.save(profesor4);
        
        System.out.println(profesorRepository.findAll());        
        Collections.sort(profesorRepository.findAll(),Profesor.nombresComparator);        
        System.out.println(profesorRepository.findAll());
        
        Collections.sort(profesorRepository.findAll(),Profesor.apellidosComparator);        
        System.out.println(profesorRepository.findAll());
        
       
        
        
        
        
       
        
    }
    
}
