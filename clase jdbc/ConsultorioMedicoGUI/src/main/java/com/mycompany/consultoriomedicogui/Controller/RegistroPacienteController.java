/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicogui.Controller;

import com.mycompany.consultoriomedicobusiness.Entity.Paciente;
import com.mycompany.consultoriomedicobusiness.Enums.ServiceEnum;
import com.mycompany.consultoriomedicobusiness.Repository.Factory.ApplicationContext;
import com.mycompany.consultoriomedicobusiness.Repository.PacienteRepository;
import com.mycompany.consultoriomedicobusiness.Services.ConsultorioServices;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sandy
 */
public class RegistroPacienteController implements Initializable {

   // private PacienteRepository pacienteRepository;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtTelefono;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //pacienteRepository = (PacienteRepository) ApplicationContext.getRepository(ServiceEnum.PACIENTE_REPOSITORY);
    }

    @FXML
    public void registrarPaciente(ActionEvent event) {
        ConsultorioServices consultorioServices = new ConsultorioServices();

        Paciente paciente = new Paciente();
        paciente.setNombre(txtNombre.getText());
        paciente.setApellido(txtApellido.getText());
        paciente.setCorreo(txtCedula.getText());
        paciente.setCorreo(txtEdad.getText());
        paciente.setCorreo(txtDireccion.getText());
        paciente.setCorreo(txtCorreo.getText());
        paciente.setCorreo(txtTelefono.getText());

      consultorioServices.guardarPaciente(paciente);
        System.out.println("Done!!");

    }

}
