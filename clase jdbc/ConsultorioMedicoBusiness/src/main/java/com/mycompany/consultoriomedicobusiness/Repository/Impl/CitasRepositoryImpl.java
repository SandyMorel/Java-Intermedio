/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Repository.Impl;

import com.mycompany.consultoriomedicobusiness.Entity.Citas;
import com.mycompany.consultoriomedicobusiness.Repository.CitasRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana Josefina
 */
public class CitasRepositoryImpl implements CitasRepository{
   private List<Citas> CitasList= new ArrayList<>();
   
    @Override
    public void save(Citas entity) {
         CitasList.add(entity);
    }

    @Override
    public void update(Citas entity) {
          int index=CitasList.indexOf(entity);
       CitasList.set(index,entity);
    }

    @Override
    public Citas finById(Long id) {
        return CitasList.get(id.intValue());
    }

    @Override
    public List<Citas> findAll() {
         return CitasList;
    }
    
}
