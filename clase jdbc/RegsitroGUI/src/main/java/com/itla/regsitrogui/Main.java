/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import com.itla.registrobusiness.entity.Estudiante;
import com.itla.registrobusiness.enums.RepositoryEnum;
import com.itla.registrobusiness.repository.factory.ApplicationContext;
import com.itla.registrobusiness.repository.EstudianteRepository;

/**
 *
 * @author JoseLuis
 */
public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan");
        estudiante.setApellido("Martinez");
        estudiante.setMatricula("2017-001");

        EstudianteRepository estudianteRepository = (EstudianteRepository) ApplicationContext.getRePository(RepositoryEnum.ESTUDIANTE_REPOSITORY);
        estudianteRepository.save(estudiante);
// System.out.println(estudiante.toString());

    }

}
