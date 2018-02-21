/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Repository.Impl;

import com.mycompany.consultoriomedicobusiness.Entity.Consultorio;
import com.mycompany.consultoriomedicobusiness.Repository.ConsultorioRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana Josefina
 */
public class ConsultorioRepositoryImpl implements ConsultorioRepository {

    private List<Consultorio> ConsultorioList = new ArrayList<>();

    @Override
    public void save(Consultorio entity) {
        ConsultorioList.add(entity);
    }

    @Override
    public void update(Consultorio entity) {
        int index = ConsultorioList.indexOf(entity);
        ConsultorioList.set(index, entity);
    }

    @Override
    public Consultorio finById(Long id) {
        return ConsultorioList.get(id.intValue());
    }

    @Override
    public List<Consultorio> findAll() {
        return ConsultorioList;
    }

}
