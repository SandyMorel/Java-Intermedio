/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.Repository.impl;

import com.itla.registrobusiness.repository.RegistroRepository;
import com.itla.registrobusiness.entity.Registro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sandy
 */
public class RegistroRepositoryImpl implements RegistroRepository {

    private final List<Registro> RegistroList = new ArrayList<>();

    @Override
    public void save(Registro entity) {
        RegistroList.add(entity);
    }

    @Override
    public void update(Registro entity) {
        int index = RegistroList.indexOf(entity);
        RegistroList.set(index, entity);
    }

    @Override
    public Registro finById(Long id) {
        return RegistroList.get(id.intValue());
    }

    @Override
    public List<Registro> findAll() {
        return RegistroList;
    }

}
