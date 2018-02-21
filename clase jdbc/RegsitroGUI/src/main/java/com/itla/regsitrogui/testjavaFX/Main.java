/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui.testjavaFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ana Josefina
 */
public class Main extends Application{

        public static void main(String[] args){
            launch();
        }
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Button button= new Button("Click Me");
        
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            }
            
        });
        
        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        
        Scene screen= new Scene(layout,400,400);
        
        primaryStage.setScene(screen);
        primaryStage.show();
        
        
        
        
    }
    
    
    
}
