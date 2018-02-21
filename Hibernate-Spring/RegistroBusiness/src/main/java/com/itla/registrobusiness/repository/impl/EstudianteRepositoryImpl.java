/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Estudiante;
import com.itla.registrobusiness.repository.EstudianteRepository;
import java.util.List;

/**
 *
 * @author jpelegrino
 */
public class EstudianteRepositoryImpl implements EstudianteRepository{

    @Override
    public void save(Estudiante entity) {
        System.out.println("El esudiante "+entity.toString()+ " ha sido guardado");
    }

    @Override
    public void update(Estudiante entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estudiante findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estudiante> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
