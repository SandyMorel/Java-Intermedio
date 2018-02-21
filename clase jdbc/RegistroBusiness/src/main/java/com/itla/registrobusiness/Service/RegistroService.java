/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.Service;

import com.itla.registrobusiness.Util.BusinessException;
import com.itla.registrobusiness.entity.Registro;
import com.itla.registrobusiness.enums.RepositoryEnum;
import com.itla.registrobusiness.repository.RegistroRepository;
import com.itla.registrobusiness.repository.factory.ApplicationContext;


/**
 *
 * @author Sandy
 */
public class RegistroService {

private  RegistroRepository registroRepository=(RegistroRepository) ApplicationContext.getRePository(RepositoryEnum.REGISTRO_REPOSITORY);

    public void Registrar(Registro registro) throws BusinessException {

        Long capacidad = registro.getSesion().getCapacidad();
        
        if(registroRepository.findAll().size()>capacidad.intValue())
            throw new BusinessException("La Capacidad de la Sesion se ha Excedido");
        
        registroRepository.save(registro);

    }

}
