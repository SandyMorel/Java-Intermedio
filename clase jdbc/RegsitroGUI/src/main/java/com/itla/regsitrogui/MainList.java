/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import com.itla.registrobusiness.entity.Profesor;
import com.itla.registrobusiness.enums.RepositoryEnum;
import com.itla.registrobusiness.repository.ProfesorRepository;
import com.itla.registrobusiness.repository.factory.ApplicationContext;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author 57781
 */
public class MainList {

    public static void main(String[] args) {

        ProfesorRepository ProfesorRepository = (ProfesorRepository) ApplicationContext.getRePository(RepositoryEnum.PROFESOR_REPOSITORY);

        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Juan");
        profesor1.setApellido("Gonzales");
        profesor1.setCodigo(1L);

        Profesor profesor2 = new Profesor();
        profesor2.setNombre("Pedro");
        profesor2.setApellido("Martinez");
        profesor2.setCodigo(2L);

        Profesor profesor3 = new Profesor();
        profesor3.setNombre("rosa");
        profesor3.setApellido("perez");
        profesor3.setCodigo(5L);

        Profesor profesor4 = new Profesor();
        profesor4.setNombre("Jose");
        profesor4.setApellido("Herrera");
        profesor4.setCodigo(6L);

        ProfesorRepository.save(profesor1);
        ProfesorRepository.save(profesor2);
        ProfesorRepository.save(profesor3);
        ProfesorRepository.save(profesor4);
        
//        Collections.sort(ProfesorRepository.findAll());
        Collections.sort(ProfesorRepository.findAll(),Profesor.nombresComparator);
        System.out.println(ProfesorRepository.findAll());
        
        Collections.sort(ProfesorRepository.findAll(),Profesor.apellidosComparator);
        System.out.println(ProfesorRepository.findAll());

//         List list= new ArrayList();
//         list.add("Pedro");
//         list.add("Hola");
//         list.add("Santiago");
//         
//         System.out.println("size:: "+list.size());
//         System.out.println(list);
//         
//         
//         for (int i=0;i<list.size();i++){
//             if(list.get(i) instanceof Integer){
//                 Integer num=(Integer) list.get(i);
//             }
//          System.out.println(list.get(i));
//        
//     
//    
//}
    }
}
