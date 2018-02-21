/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Sesion;
import com.itla.registrobusiness.repository.SesionRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57781
 */
public class SesionRepositoryImpl implements SesionRepository {

     private List<Sesion> SesionList= new ArrayList<>();
    @Override
    public void save(Sesion entity) {
         SesionList.add(entity);
    }

    @Override
    public void update(Sesion entity) {
         int index=SesionList.indexOf(entity);
       SesionList.set(index,entity);
    }

    @Override
    public Sesion finById(Long id) {
        return SesionList.get(id.intValue());
    }

    @Override
    public List<Sesion> findAll() {
        return SesionList;
    }
    
}
