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
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jpelegrino
 */
public class MainSet {
    
    public static void main(String[] args) {
        
        ProfesorRepository profesorRepository=null;
        
        Profesor profesor1=new Profesor();
        profesor1.setNombre("Juan");
        profesor1.setApellido("Martinez");
        profesor1.setCodigo(1L);
        
        
        Profesor profesor2=new Profesor();
        profesor2.setNombre("Juan");
        profesor2.setApellido("Martinez");
        profesor2.setCodigo(1L);
        
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
        
        System.out.println(profesor1.equals(profesor2));
        
        System.out.println("profesor1::  "+ profesor1.hashCode());
        System.out.println("profesor2::  "+ profesor2.hashCode());
        
        Set<Profesor> profesorSet=new HashSet<>(profesorRepository.findAll());
        
        System.out.println(profesorSet);
        
    }
    
}
