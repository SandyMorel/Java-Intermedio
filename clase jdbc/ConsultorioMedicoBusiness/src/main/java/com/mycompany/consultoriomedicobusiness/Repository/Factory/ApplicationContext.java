/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Repository.Factory;

import com.mycompany.consultoriomedicobusiness.Enums.ServiceEnum;
import com.mycompany.consultoriomedicobusiness.Repository.Impl.CitasRepositoryImpl;
import com.mycompany.consultoriomedicobusiness.Repository.Impl.ConsultorioRepositoryImpl;
import com.mycompany.consultoriomedicobusiness.Repository.Impl.DoctorRepositoryImpl;
import com.mycompany.consultoriomedicobusiness.Repository.Impl.PacienteRepositoryImpl;
import com.mycompany.consultoriomedicobusiness.Repository.Impl.ProcedimientoRepositoryImpl;
import com.mycompany.consultoriomedicobusiness.Repository.Impl.RecordRepositoryImpl;
import com.mycompany.consultoriomedicobusiness.Repository.Repository;

/**
 *
 * @author Ana Josefina
 */
public class ApplicationContext {

    public static Repository getRepository(ServiceEnum serviceEnum) {

        switch (serviceEnum) {
            case PACIENTE_REPOSITORY:
                return new PacienteRepositoryImpl();
            case DOCTOR_REPOSITORY:
                return new DoctorRepositoryImpl();
            case CITAS_REPOSITORY:
                return new CitasRepositoryImpl();
            case CONSULTORIO_REPOSITORY:
                return new ConsultorioRepositoryImpl();
            case RECORD_REPOSITORY:
                return new RecordRepositoryImpl();
            case PROCEDIMIENTO_REPOSITORY:
                return new ProcedimientoRepositoryImpl();

            default:

        }
        return null;
    }

}
