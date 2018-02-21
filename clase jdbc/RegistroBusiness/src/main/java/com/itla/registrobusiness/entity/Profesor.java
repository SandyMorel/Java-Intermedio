/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.registrobusiness.entity;

import java.util.Comparator;

/**
 *
 * @author JoseLuis
 */
public class Profesor extends Persona {


    private Long codigo;
    private String Correo;

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;

    }

//    @Override
//    public int compareTo(Profesor o) {
//        return o.nombre.compareTo(this.getApellido());
//    }
    public static Comparator<Profesor> nombresComparator = new Comparator<Profesor>() {

        @Override
        public int compare(Profesor o1, Profesor o2) {
            return o1.getNombre().compareTo(o2.getNombre());
           
           }
    };
    
    
        public static Comparator<Profesor> apellidosComparator = new Comparator<Profesor>() {
             @Override
        public int compare(Profesor o1, Profesor o2) {
            return o1.getApellido().compareTo(o2.getApellido());
           
        }

    };
        public boolean equals(Object object){
            
            if(object instanceof Profesor){
                Profesor profesor=(Profesor)object;
                
                if(this.nombre.equals(profesor.getNombre())&&
                        this.apellido.equals(profesor.getApellido())&&
                               this.apellido.equals(profesor.getCodigo())){
                    
                return true;
            }
          }
            return false;
            
        }
        
         @Override
        public int hashCode(){
            if(this.getNombre()!=null &&
                    this.getApellido()!=null &&
                    this.getCodigo()!=null) {
                return (int) 7 * this.nombre.length()+this.apellido.length()/this.codigo.intValue();
            }
            return 45;
        }
}


