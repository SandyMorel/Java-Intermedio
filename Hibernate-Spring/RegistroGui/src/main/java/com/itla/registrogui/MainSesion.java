/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrogui;

import com.itla.registrobusiness.entity.Aula;
import com.itla.registrobusiness.entity.Horario;
import com.itla.registrobusiness.entity.Materia;
import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.entity.Sesion;
import com.itla.registrobusiness.enums.ServiceEnum;
import com.itla.registrobusiness.factory.ApplicationContext;
import com.itla.registrobusiness.repository.AulaRepository;
import com.itla.registrobusiness.repository.MateriaRepository;
import com.itla.registrobusiness.repository.ProfesorRepository;
import com.itla.registrobusiness.repository.SesionRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpelegrino
 */
public class MainSesion {
    
    public static void main(String[] args) {
        SesionRepository sesionRepository=null;
        List<Horario> horarioList=getHorarios();
        List<Profesor> profesorList=getProfesores();
        List<Materia> materiaList=getMaterias();
        List<Aula> aulaList=getAulaList();
        
        Sesion sesion1=new Sesion();
        sesion1.setAula(aulaList.get(0));
        sesion1.setMateria(materiaList.get(1));
        sesion1.setProfesor(profesorList.get(2));
        sesion1.setHorario(horarioList.get(0));
     

        Sesion sesion2=new Sesion();
        sesion2.setAula(aulaList.get(1));
        sesion2.setMateria(materiaList.get(0));
        sesion2.setProfesor(profesorList.get(1));
        sesion2.setHorario(horarioList.get(0));
        

        Sesion sesion3=new Sesion();
        sesion3.setAula(aulaList.get(1));
        sesion3.setMateria(materiaList.get(0));
        sesion3.setProfesor(profesorList.get(2));
        sesion3.setHorario(horarioList.get(1));
        
        
    }
    
    private static List<Aula> getAulaList() {
        AulaRepository aulaRepository=null;

        Aula a1=new Aula();
        a1.setDescripcion("1b");

        Aula a2=new Aula();
        a2.setDescripcion("1c");

        aulaRepository.save(a1);
        aulaRepository.save(a2);

        return aulaRepository.findAll();

    }

    private static List<Materia> getMaterias() {
        MateriaRepository materiaRepository=null;

        Materia m1=new Materia();
        m1.setDescripcion("Matematica");
        m1.setCodigo("Mat-001");

        Materia m2=new Materia();
        m2.setDescripcion("Lengua Espanola");
        m2.setCodigo("Esp-001");

        materiaRepository.save(m1);
        materiaRepository.save(m2);

        return materiaRepository.findAll();


    }

    private static List<Profesor> getProfesores() {
        ProfesorRepository profesorRepository=null;

        Profesor profesor=new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Martinez");
       

        Profesor profesor2=new Profesor();
        profesor2.setNombre("Jorge");
        profesor2.setApellido("Polanco");
       


        Profesor profesor3=new Profesor();
        profesor3.setNombre("Pedro");
        profesor3.setApellido("Gonzalez");
       



        profesorRepository.save(profesor);
        profesorRepository.save(profesor3);
        profesorRepository.save(profesor2);

        return profesorRepository.findAll();
    }

    private static List<Horario> getHorarios() {
        List<Horario> horarios=new ArrayList<>();
        Horario h1=new Horario();
        h1.setId(1L);
        h1.setDescripcion("Lun-Mie 9-1");

        Horario h2=new Horario();
        h2.setId(2L);
        h2.setDescripcion("Lun-Mie 2-6");

        Horario h3=new Horario();
        h3.setId(3L);
        h3.setDescripcion("Lun-Mie 6-10");

        horarios.add(h1);
        horarios.add(h2);
        horarios.add(h3);

        return horarios;


    }
    
}
