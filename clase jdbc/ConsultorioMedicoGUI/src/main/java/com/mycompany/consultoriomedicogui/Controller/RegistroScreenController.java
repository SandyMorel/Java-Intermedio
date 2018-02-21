/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicogui.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sandy
 */
public class RegistroScreenController implements Initializable {

    @FXML
    private BorderPane mainLayout;
    private Stage stage;
    File file;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void cargarRegistroPaciente(ActionEvent evt) throws IOException {
        Parent PacienteScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroPaciente.fxml"));

        mainLayout.setCenter(PacienteScene);

    }

    @FXML
    public void cargarRegistroDoctor(ActionEvent evt) throws IOException {

        Parent DoctorScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroDoctor.fxml"));

        mainLayout.setCenter(DoctorScene);
    }

    @FXML
    public void cargarRegistroCita(ActionEvent evt) throws IOException {
        Parent CitaScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroCita.fxml"));

        mainLayout.setCenter(CitaScene);

    }

    @FXML
    public void cargarRegistroProcedimiento(ActionEvent evt) throws IOException {
        Parent ProcedimientoScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroProcedimiento.fxml"));

        mainLayout.setCenter(ProcedimientoScene);

    }
    @FXML
    public void BuscarRegistroPaciente (ActionEvent evt) throws IOException {
        Parent BuscarScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLBuscarPaciente.fxml"));

        mainLayout.setCenter(BuscarScene );

    }

    @FXML
    public void OpenFileHandler()  {
        FileChooser fc = new FileChooser();
        file = fc.showOpenDialog(stage);

       
       

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
