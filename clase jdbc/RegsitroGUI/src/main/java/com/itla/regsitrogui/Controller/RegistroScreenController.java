/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui.Controller;

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
 * @author Ana Josefina
 */
public class RegistroScreenController implements Initializable {

    @FXML
    private BorderPane mainLayout;
    private Stage stage;
    File file;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        System.out.println("Inicializando Registro Screen Controller...");
    }

    @FXML
    public void cargarRegistroProfesor(ActionEvent evt) throws IOException {
        System.out.println("Inicializando");

        Parent profesorScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroProfesor.fxml"));

        mainLayout.setCenter(profesorScene);

    }

    @FXML
    public void OpenFile() {
        FileChooser fc = new FileChooser();
        file = fc.showOpenDialog(stage);

        System.out.println(file.getAbsolutePath());

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
