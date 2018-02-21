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
    @NamedQuery(name=Horario.FIND_HORARIO_BY_ID,query = "SELECT h FROM Horario h WHERE h.id=:horarioId")
})
public class Horario extends Catalogo implements Serializable{
    
    public static final String FIND_HORARIO_BY_ID="findHorarioById";
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private Long id;
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


