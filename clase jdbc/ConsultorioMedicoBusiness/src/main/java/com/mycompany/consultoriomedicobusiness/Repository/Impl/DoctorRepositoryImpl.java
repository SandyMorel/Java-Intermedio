/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Repository.Impl;

import com.mycompany.consultoriomedicobusiness.Entity.Doctor;
import com.mycompany.consultoriomedicobusiness.Repository.DoctorRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana Josefina
 */
public class DoctorRepositoryImpl implements DoctorRepository {

    private List<Doctor> DoctorList = new ArrayList<>();

    @Override
    public void save(Doctor entity) {
        DoctorList.add(entity);
    }

    @Override
    public void update(Doctor entity) {
        int index = DoctorList.indexOf(entity);
        DoctorList.set(index, entity);
    }

    @Override
    public Doctor finById(Long id) {
        return DoctorList.get(id.intValue());
    }

    @Override
    public List<Doctor> findAll() {
        return DoctorList;
    }

}
