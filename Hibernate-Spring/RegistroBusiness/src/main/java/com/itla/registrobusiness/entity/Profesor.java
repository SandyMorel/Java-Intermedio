/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.entity;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author jpelegrino
 */
@Entity
public class Profesor extends Persona implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Long id;
    
    @Transient
    private Long codigo;
    
    @OneToMany(mappedBy = "profesor",fetch = FetchType.LAZY)
    private List<Sesion> sesionList;
   

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return this.nombre + " "+ this.apellido;
    }


    
    public static Comparator<Profesor> nombresComparator=new Comparator<Profesor>() {
        @Override
        public int compare(Profesor o1, Profesor o2) {
          return o1.getNombre().compareTo(o2.getNombre());
        }
    };
    
    
    public static Comparator<Profesor> apellidosComparator=new Comparator<Profesor>() {
        @Override
        public int compare(Profesor o1, Profesor o2) {
          return o1.getApellido().compareTo(o2.getApellido());
        }
    };
    
    
    @Override
    public boolean equals(Object object) {
        if(object instanceof Profesor) {
            Profesor profesor=(Profesor)object;           
            
            if(this.nombre.equals(profesor.getNombre()) &&
                    this.apellido.equals(profesor.getApellido())&&
                    this.codigo.equals(profesor.getCodigo())) {
                return true;
            }            
        }
        
        return false;
    
    }
    
    
    @Override
    public int hashCode() {        
        if(this.getNombre()!=null &&
                this.getApellido()!=null &&
                this.getCodigo()!=null) {
        return (int) 7 * this.nombre.length()+this.apellido.length()/this.codigo.intValue();
        }
        return 45;
    }

    public List<Sesion> getSesionList() {
        return sesionList;
    }

    
    public void setSesionList(List<Sesion> sesionList) {
        this.sesionList = sesionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
}
