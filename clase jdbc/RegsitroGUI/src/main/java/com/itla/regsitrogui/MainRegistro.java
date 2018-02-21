/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import com.itla.registrobusiness.Service.RegistroService;
import com.itla.registrobusiness.Util.BusinessException;
import com.itla.registrobusiness.entity.Aula;
import com.itla.registrobusiness.entity.Estudiante;
import com.itla.registrobusiness.entity.Horario;
import com.itla.registrobusiness.entity.Materia;
import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.entity.Registro;
import com.itla.registrobusiness.entity.Sesion;
import com.itla.registrobusiness.enums.RepositoryEnum;
import com.itla.registrobusiness.repository.AulaRepository;
import com.itla.registrobusiness.repository.MateriaRepository;
import com.itla.registrobusiness.repository.ProfesorRepository;
import com.itla.registrobusiness.repository.SesionRepository;
import com.itla.registrobusiness.repository.factory.ApplicationContext;
import com.itla.regsitrogui.Util.DateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author Sandy
 */
public class MainRegistro {

    private static Logger LOG = Logger.getLogger(MainRegistro.class.getName());

    public static void main(String[] args) {

        SesionRepository Sesionpository = (SesionRepository) ApplicationContext.getRePository(RepositoryEnum.SESION_REPOSITORY);

        List<Horario> horarioList = getHorarios();
        List<Profesor> profesorList = getProfesores();
        List<Materia> materiaList = getMaterias();
        List<Aula> aulaList = getAulaList();

        Sesion sesion1 = new Sesion();
        sesion1.setAula(aulaList.get(0));
        sesion1.setMateria(materiaList.get(1));
        sesion1.setProfesor(profesorList.get(2));
        sesion1.setHorario(horarioList.get(0));
        sesion1.setFechaInicio(DateUtil.stringToDate("12/10/2017"));
        sesion1.setFechaFin(DateUtil.stringToDate("17/12/2017"));
        sesion1.setCapacidad(2L);

        Sesion sesion2 = new Sesion();
        sesion2.setAula(aulaList.get(1));
        sesion2.setMateria(materiaList.get(0));
        sesion2.setProfesor(profesorList.get(1));
        sesion2.setHorario(horarioList.get(0));
        sesion2.setFechaInicio(DateUtil.stringToDate("12/10/2017"));
        sesion2.setFechaFin(DateUtil.stringToDate("17/12/2017"));
        sesion2.setCapacidad(5L);

        Sesion sesion3 = new Sesion();
        sesion3.setAula(aulaList.get(1));
        sesion3.setMateria(materiaList.get(0));
        sesion3.setProfesor(profesorList.get(2));
        sesion3.setHorario(horarioList.get(1));
        sesion3.setFechaInicio(DateUtil.stringToDate("12/10/2017"));
        sesion3.setFechaFin(DateUtil.stringToDate("17/12/2017"));
        sesion3.setCapacidad(5L);

        Sesionpository.save(sesion1);
        Sesionpository.save(sesion2);
        Sesionpository.save(sesion3);

        RegistroService registroService = new RegistroService();
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("jose");
        estudiante1.setApellido("Morillo");
        estudiante1.setMatricula("2017-895");

        Registro registro = new Registro();
        registro.setEstudiante(estudiante1);
        registro.setSesion(sesion1);

        Registro registro2 = new Registro();
        registro2.setEstudiante(estudiante1);
        registro2.setSesion(sesion1);

        Registro registro3 = new Registro();
        registro3.setEstudiante(estudiante1);
        registro3.setSesion(sesion1);

        try {
            registroService.Registrar(registro);
            registroService.Registrar(registro);
            registroService.Registrar(registro);
            registroService.Registrar(registro);

        } catch (BusinessException ex) {
            LOG.log(Level.SEVERE, ex.getMessage(), ex);
//            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
//            errorAlert.setTitle("Error Message");
//            errorAlert.setContentText(ex.getMessage());

        }catch (Exception e){
          
        }
    }

    private static List<Aula> getAulaList() {

        AulaRepository AulaRepository = (AulaRepository) ApplicationContext.getRePository(RepositoryEnum.AULA_REPOSITORY);

        Aula a1 = new Aula();
        a1.setDescripcion("1b");

        Aula a2 = new Aula();
        a2.setDescripcion("1c");

        AulaRepository.save(a1);
        AulaRepository.save(a2);

        return AulaRepository.findAll();

    }

    private static List<Materia> getMaterias() {
        MateriaRepository MateriaRepository = (MateriaRepository) ApplicationContext.getRePository(RepositoryEnum.MATERIA_REPOSITORY);

        Materia m1 = new Materia();
        m1.setDescripcion("Matematica");
        m1.setCodigo("Mat-001");

        Materia m2 = new Materia();
        m2.setDescripcion("Lengua Espanola");
        m2.setCodigo("Esp-001");

        MateriaRepository.save(m1);
        MateriaRepository.save(m2);

        return MateriaRepository.findAll();

    }

    private static List<Profesor> getProfesores() {
        ProfesorRepository ProfesorRepository = (ProfesorRepository) ApplicationContext.getRePository(RepositoryEnum.PROFESOR_REPOSITORY);

        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Martinez");
        profesor.setCorreo("juan.martinez@gmail.com");
        profesor.setCodigo(1L);

        Profesor profesor2 = new Profesor();
        profesor2.setNombre("Jorge");
        profesor2.setApellido("Polanco");
        profesor2.setCorreo("jpolanco@gmail.com");
        profesor2.setCodigo(45L);

        Profesor profesor3 = new Profesor();
        profesor3.setNombre("Pedro");
        profesor3.setApellido("Gonzalez");
        profesor3.setCorreo("pedro.gonzalez@gmail.com");
        profesor3.setCodigo(454L);

        ProfesorRepository.save(profesor);
        ProfesorRepository.save(profesor3);
        ProfesorRepository.save(profesor2);

        return ProfesorRepository.findAll();
    }

    private static List<Horario> getHorarios() {
        List<Horario> horarios = new ArrayList<>();
        Horario h1 = new Horario();
        h1.setId(1L);
        h1.setDescripcion("Lun-Mie 9-1");

        Horario h2 = new Horario();
        h2.setId(2L);
        h2.setDescripcion("Lun-Mie 2-6");

        Horario h3 = new Horario();
        h3.setId(3L);
        h3.setDescripcion("Lun-Mie 6-10");

        horarios.add(h1);
        horarios.add(h2);
        horarios.add(h3);

        return horarios;

    }
}
