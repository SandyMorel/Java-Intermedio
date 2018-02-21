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
public class Paciente extends Persona {

    private Long Codigo;
    private String Descripcion;

    public Long getCodigo() {
        return Codigo;
    }

    public void setCodigo(Long Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "" + Nombre + " " + Apellido + " " + Edad + "" + Cedula + "" + Telefono + "" + Direccion + "" + Correo + "" + Descripcion + "" + Codigo + "";
    }

    public static Comparator<Paciente> NombresComparator = new Comparator<Paciente>() {

        @Override
        public int compare(Paciente o1, Paciente o2) {
            return o1.getNombre().compareTo(o2.getNombre());

        }
    };

    public static Comparator<Paciente> ApellidosComparator = new Comparator<Paciente>() {
        @Override
        public int compare(Paciente o1, Paciente o2) {
            return o1.getApellido().compareTo(o2.getApellido());

        }

    };

    @Override
    public boolean equals(Object object) {

        if (object instanceof Paciente) {
            Paciente paciente = (Paciente) object;

            if (this.Nombre.equals(paciente.getNombre())
                    && this.Apellido.equals(paciente.getApellido())
                    && this.Edad.equals(paciente.getEdad())
                    && this.Cedula.equals(paciente.getCedula())
                    && this.Telefono.equals(paciente.getTelefono())
                    && this.Direccion.equals(paciente.getDireccion())
                    && this.Correo.equals(paciente.getCorreo())
                    && this.Descripcion.equals(paciente.getDescripcion())
                    && this.Codigo.equals(paciente.getCodigo())
                    && this.Apellido.equals(paciente.getCodigo())) {

                return true;
            }
        }
        return false;

    }


}
