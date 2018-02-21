/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.Repository.impl;

import com.itla.registrobusiness.entity.Materia;
import com.itla.registrobusiness.repository.MateriaRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sandy
 */
public class MateriaRepositoryImpl implements MateriaRepository {

    private List<Materia> MateriaList = new ArrayList<>();

    @Override
    public void save(Materia entity) {
        MateriaList.add(entity);
    }

    @Override
    public void update(Materia entity) {
        int index = MateriaList.indexOf(entity);
        MateriaList.set(index, entity);
    }

    @Override
    public Materia finById(Long id) {
        return MateriaList.get(id.intValue());
    }

    @Override
    public List<Materia> findAll() {
        return MateriaList;
    }

}
