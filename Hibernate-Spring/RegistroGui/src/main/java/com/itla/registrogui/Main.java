/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrogui;

import com.itla.registrobusiness.entity.Aula;
import com.itla.registrobusiness.entity.Estudiante;
import com.itla.registrobusiness.entity.Horario;
import com.itla.registrobusiness.entity.Materia;
import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.entity.Sesion;
import com.itla.registrobusiness.enums.ServiceEnum;
import com.itla.registrobusiness.repository.EstudianteRepository;
import com.itla.registrobusiness.repository.ProfesorRepository;
import com.itla.registrobusiness.repository.impl.EstudianteRepositoryImpl;
import com.itla.registrobusiness.services.AulaService;
import com.itla.registrobusiness.services.HorarioService;
import com.itla.registrobusiness.services.MateriaService;
import com.itla.registrobusiness.services.ProfesorService;
import com.itla.registrobusiness.services.SesionService;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jpelegrino
 */
public class Main {
    
    public static void main(String[] args) {
       
        
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
        
       
        ProfesorService profesorService=(ProfesorService) 
                context.getBean(ServiceEnum.PROFESOR_SERVICE.getValue());
        
        AulaService aulaService=(AulaService) context.getBean(ServiceEnum.AULA_SERVICE.getValue());
        
        MateriaService materiaService=(MateriaService) 
                context.getBean(ServiceEnum.MATERIA_SERVICE.getValue());
        
        
        HorarioService horarioService=(HorarioService) 
                context.getBean(ServiceEnum.HORARIO_SERVICE.getValue());
        
        SesionService sesionService=(SesionService) 
                context.getBean(ServiceEnum.SESION_SERVICE.getValue());
        
        Aula aula=aulaService.findAulaById(3L);
        Materia materia=materiaService.findMateriaById(2L);
        Horario horario=horarioService.findHorarioById(2L);
        Profesor profesor=profesorService.findProfesorById(2L);
        
        System.out.println("aula:: "+ aula.getDescripcion());
        System.out.println("materia::  "+ materia.getDescripcion());
        System.out.println("horario:: "+ horario.getDescripcion());
        
        
        Sesion sesion=new Sesion();
        
        sesion.setAula(aula);
        sesion.setHorario(horario);
        sesion.setMateria(materia);
        sesion.setFechaInicio(new Date());
        sesion.setFechaFin(new Date());
        sesion.setCapacidad(18L);
        sesion.setProfesor(profesor);
        
//        sesionService.guardarSesion(sesion);
        
        System.out.println("Done!!");
        
        
        
        
//        profesorService.guardarProfesor(null);
        
        
        
        
        
       
    }
    
}
