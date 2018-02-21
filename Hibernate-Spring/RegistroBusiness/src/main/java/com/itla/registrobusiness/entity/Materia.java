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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author jpelegrino
 */
@Entity
@NamedQueries({
   @NamedQuery(name = Materia.FIND_MATERIA_BY_ID,query = "SELECT m FROM Materia m WHERE m.id=:materiaId") 
})
public class Materia extends Catalogo implements Serializable{
    
    public final static String FIND_MATERIA_BY_ID="findMateriaById";
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Long id;
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
