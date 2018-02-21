/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.services;

import com.itla.registrobusiness.entity.Profesor;

/**
 *
 * @author jpelegrino
 */
public interface ProfesorService {
    
    void guardarProfesor(Profesor profesor);
    Profesor findProfesorById(Long id);
}
