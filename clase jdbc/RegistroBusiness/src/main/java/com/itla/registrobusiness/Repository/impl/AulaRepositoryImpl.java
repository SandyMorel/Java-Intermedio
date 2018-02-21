/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Aula;
import com.itla.registrobusiness.repository.AulaRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57781
 */
public class AulaRepositoryImpl implements AulaRepository {

    private List<Aula> AulaList = new ArrayList<>();

    @Override
    public void save(Aula entity) {
        AulaList.add(entity);

    }

    @Override
    public void update(Aula entity) {
        int index = AulaList.indexOf(entity);
        AulaList.set(index, entity);

    }

    @Override
    public Aula finById(Long id) {
        return AulaList.get(id.intValue());

    }

    @Override
    public List<Aula> findAll() {
        return AulaList;
    }

}
