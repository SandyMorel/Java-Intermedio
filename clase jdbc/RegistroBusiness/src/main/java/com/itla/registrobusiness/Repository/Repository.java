/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.repository;


import java.util.List;

/**
 *
 * @author JoseLuis
 */
public interface Repository<T, ID> {
     void save(T entity);
    void update(T entity);
    T finById(ID id);
    List<T> findAll();
    
    
}
