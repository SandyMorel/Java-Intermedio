/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Entity;

import java.util.Comparator;

/**
 *
 * @author Ana Josefina
 */
public class Doctor extends Persona {
    

    private Long Codigo;
    private String Especialidad;
    private String Horario;

    public Long getCodigo() {
        return Codigo;
    }

    public void setCodigo(Long Codigo) {
        this.Codigo = Codigo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    @Override
    public String toString() {
        return "" + Nombre + " " + Apellido + " "+Edad +""+ Cedula + "" + Telefono + "" + Direccion + ""+Correo+"" + Especialidad + "" + "" + Horario + ""+Codigo+"";
    }

    public static Comparator<Doctor> NombresComparator = new Comparator<Doctor>() {

        @Override
        public int compare(Doctor o1, Doctor o2) {
            return o1.getNombre().compareTo(o2.getNombre());

        }
    };

    public static Comparator<Doctor> ApellidosComparator = new Comparator<Doctor>() {
        @Override
        public int compare(Doctor o1, Doctor o2) {
            return o1.getApellido().compareTo(o2.getApellido());

        }

    };

    public boolean equals(Object object) {

        if (object instanceof Doctor) {
            Doctor doctor = (Doctor) object;

          if (this.Nombre.equals(doctor.getNombre())
                    && this.Apellido.equals(doctor.getApellido())
                   && this.Edad.equals(doctor.getEdad())
                    && this.Cedula.equals(doctor.getCedula())
                    && this.Telefono.equals(doctor.getTelefono())
                    && this.Direccion.equals(doctor.getDireccion())
                    && this.Correo.equals(doctor.getCorreo())
                    && this.Especialidad.equals(doctor.getEspecialidad())
                    && this.Horario.equals(doctor.getHorario())
                    && this.Codigo.equals(doctor.getCodigo())
                    && this.Apellido.equals(doctor.getCodigo())) {

                return true;
            }
        }
        return false;

    }

   

}
