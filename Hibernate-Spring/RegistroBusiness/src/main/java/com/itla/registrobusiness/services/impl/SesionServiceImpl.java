/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.services.impl;

import com.itla.registrobusiness.entity.Sesion;
import com.itla.registrobusiness.repository.SesionRepository;
import com.itla.registrobusiness.services.SesionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jpelegrino
 */
@Service
@Transactional
public class SesionServiceImpl implements SesionService{
    
    private SesionRepository sesionRepository;

    public SesionServiceImpl(SesionRepository sesionRepository) {
        this.sesionRepository = sesionRepository;
    }

    @Override
    public void guardarSesion(Sesion sesion) {
        sesionRepository.save(sesion);
    }
    
    
    
}
