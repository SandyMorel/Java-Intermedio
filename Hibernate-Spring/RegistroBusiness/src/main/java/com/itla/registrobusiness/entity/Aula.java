/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jpelegrino
 */
@Entity
public class Aula extends Catalogo implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aula")
    private Long id;
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
    
}
