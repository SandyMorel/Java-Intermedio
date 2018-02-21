/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.enums.RepositoryEnum;
import com.itla.registrobusiness.repository.ProfesorRepository;
import com.itla.registrobusiness.repository.factory.ApplicationContext;

/**
 *
 * @author 57781
 */
public class MainSet {

    public static void main(String[] args) {
        
        ProfesorRepository profesorRepository=(ProfesorRepository) 
                ApplicationContext.getRePository(RepositoryEnum.PROFESOR_REPOSITORY);

        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Juan");
        profesor1.setApellido("Gonzales");
        profesor1.setCodigo(1L);

        Profesor profesor2 = new Profesor();
        profesor2.setNombre("Juan");
        profesor2.setApellido("Gonzales");
        profesor2.setCodigo(1L);

        Profesor profesor3 = new Profesor();
        profesor3.setNombre("Pedro");
        profesor3.setApellido("Martinez");
        profesor3.setCodigo(2L);

        Profesor profesor4 = new Profesor();
        profesor4.setNombre("Jose");
        profesor4.setApellido("Herrera");
        profesor4.setCodigo(6L);
        
        profesorRepository.save(profesor1);
        profesorRepository.save(profesor2);
        profesorRepository.save(profesor3);
        profesorRepository.save(profesor4);

        System.out.println(profesor1.equals(profesor2));

        System.out.println("profesor1::  " + profesor1.hashCode());
        System.out.println("profesor2::  " + profesor2.hashCode());

    }

}
