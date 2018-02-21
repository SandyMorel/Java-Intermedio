/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository.impl;

import com.itla.registrobusiness.entity.Estudiante;
import com.itla.registrobusiness.repository.EstudianteRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseLuis
 */
public class EstudianteRepositoryImpl implements EstudianteRepository {

    private List<Estudiante> EstudianteList = new ArrayList<>();

    @Override
    public void save(Estudiante entity) {
        EstudianteList.add(entity);
    }

    @Override
    public void update(Estudiante entity) {
        int index = EstudianteList.indexOf(entity);
        EstudianteList.set(index, entity);
    }

    @Override
    public Estudiante finById(Long id) {
        return EstudianteList.get(id.intValue());
    }

    @Override
    public List<Estudiante> findAll() {
        return EstudianteList;
    }

}
