/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.services.impl;

import com.itla.registrobusiness.entity.Aula;
import com.itla.registrobusiness.repository.AulaRepository;
import com.itla.registrobusiness.services.AulaService;

/**
 *
 * @author jpelegrino
 */
public class AulaServiceImpl implements AulaService {
    
    private AulaRepository aulaRepository;

    public AulaServiceImpl(AulaRepository aulaRepository) {
        this.aulaRepository = aulaRepository;
    }

    @Override
    public Aula findAulaById(Long id) {
        return aulaRepository.findById(id);
    }
    
    
    
}
