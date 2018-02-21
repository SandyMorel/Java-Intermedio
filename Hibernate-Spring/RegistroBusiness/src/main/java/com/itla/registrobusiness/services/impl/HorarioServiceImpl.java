/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.services.impl;

import com.itla.registrobusiness.entity.Horario;
import com.itla.registrobusiness.repository.HorarioRepository;
import com.itla.registrobusiness.services.HorarioService;
import org.springframework.stereotype.Service;

/**
 *
 * @author jpelegrino
 */
@Service
public class HorarioServiceImpl implements HorarioService{
    
    private HorarioRepository horarioRepository;

    public HorarioServiceImpl(HorarioRepository horarioRepository) {
        this.horarioRepository = horarioRepository;
    }

    @Override
    public Horario findHorarioById(Long id) {
        return horarioRepository.findById(id);
    }
    
    
}
