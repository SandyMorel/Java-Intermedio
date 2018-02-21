/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.factory;

import com.itla.registrobusiness.enums.RepositoryEnum;
import com.itla.registrobusiness.repository.Repository;
import com.itla.registrobusiness.repository.impl.AulaRepositoryImpl;
import com.itla.registrobusiness.repository.impl.EstudianteRepositoryImpl;
import com.itla.registrobusiness.Repository.impl.MateriaRepositoryImpl;
import com.itla.registrobusiness.repository.impl.ProfesorRepositoryImpl;
import com.itla.registrobusiness.repository.impl.SesionRepositoryImpl;
import com.itla.registrobusiness.Repository.impl.RegistroRepositoryImpl;

/**
 *
 * @author JoseLuis
 */
public class ApplicationContext {

    public static Repository getRePository(RepositoryEnum repositoryEnum) {

        switch (repositoryEnum) {
            case PROFESOR_REPOSITORY:
                return new ProfesorRepositoryImpl();
            case ESTUDIANTE_REPOSITORY:
                return new EstudianteRepositoryImpl();
            case AULA_REPOSITORY:
                return new AulaRepositoryImpl();
            case SESION_REPOSITORY:
                return new SesionRepositoryImpl();
            case MATERIA_REPOSITORY:
                return new MateriaRepositoryImpl();
            case REGISTRO_REPOSITORY:
                return  new RegistroRepositoryImpl();

            default:

        }
        return null;
    }

}
