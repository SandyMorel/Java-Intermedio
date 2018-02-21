/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.Services;

import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.enums.RepositoryEnum;
import com.itla.registrobusiness.repository.ProfesorRepository;
import com.itla.registrobusiness.repository.factory.ApplicationContext;

/**
 *
 * @author 48881
 */
public class SchoolServices {
    
    private ProfesorRepository profesorRepository=(ProfesorRepository)
            ApplicationContext.getRePository(RepositoryEnum.PROFESOR_REPOSITORY);
    
    
    public void guardarProfesor(Profesor profesor){
        
        profesorRepository.save(profesor);
        
    }
    
    public Profesor findProfesorById(Long id){
        
        
        return profesorRepository.finById(id);
        
        
    }
    
}
