/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.services.impl;

import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.repository.ProfesorRepository;
import com.itla.registrobusiness.services.ProfesorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jpelegrino
 */
@Service
@Transactional
public class ProfesorServiceImpl implements ProfesorService{
    
    private ProfesorRepository profesorRepository;

    public ProfesorServiceImpl(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    

    @Override
    public void guardarProfesor(Profesor profesor) {
        profesorRepository.save(profesor);
    }

    @Override
    public Profesor findProfesorById(Long id) {
        return profesorRepository.findById(id);
    }

    
    
    
    
    
}
