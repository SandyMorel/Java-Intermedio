/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Repository.Impl;

import com.mycompany.consultoriomedicobusiness.Entity.Record;
import com.mycompany.consultoriomedicobusiness.Repository.RecordRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana Josefina
 */
public class RecordRepositoryImpl implements RecordRepository{
    
     private List<Record> RecordList = new ArrayList<>();

    @Override
    public void save(Record entity) {
         RecordList.add(entity);
    }

    @Override
    public void update(Record entity) {
         int index = RecordList.indexOf(entity);
        RecordList.set(index, entity);
    }

    @Override
    public Record finById(Long id) {
        return RecordList.get(id.intValue());
    }

    @Override
    public List<Record> findAll() {
        return RecordList;
    }
    
}
