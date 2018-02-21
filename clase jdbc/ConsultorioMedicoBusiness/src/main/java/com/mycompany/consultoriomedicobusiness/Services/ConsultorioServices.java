/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Services;

import com.mycompany.consultoriomedicobusiness.Entity.Paciente;
import com.mycompany.consultoriomedicobusiness.Enums.ServiceEnum;
import com.mycompany.consultoriomedicobusiness.Repository.Factory.ApplicationContext;
import com.mycompany.consultoriomedicobusiness.Repository.PacienteRepository;

/**
 *
 * @author Sandy
 */
public class ConsultorioServices {
       private PacienteRepository pacienteRepository=(PacienteRepository)
            ApplicationContext.getRepository(ServiceEnum.PACIENTE_REPOSITORY);
    
    
    public void guardarPaciente(Paciente paciente){
        
        pacienteRepository.save(paciente);
        
    }
    
    public Paciente findPacienterById(Long id){
        
        
        return pacienteRepository.finById(id);
        
        
    }
    
}
