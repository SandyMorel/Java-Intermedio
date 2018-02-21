/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.services.impl;

import com.itla.registrobusiness.entity.Materia;
import com.itla.registrobusiness.repository.MateriaRepository;
import com.itla.registrobusiness.services.MateriaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jpelegrino
 */
@Service
@Transactional
public class MateriaServiceImpl implements MateriaService{
    
    private MateriaRepository materiaRepository;

    public MateriaServiceImpl(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    @Override
    public Materia findMateriaById(Long id) {
        return materiaRepository.findById(id);
    }
    
    
    
}
