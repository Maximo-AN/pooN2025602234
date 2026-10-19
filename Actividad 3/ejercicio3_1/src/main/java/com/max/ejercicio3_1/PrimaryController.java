package com.max.ejercicio3_1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtClics;
    @FXML ProgressBar pgbBarra;
    @FXML Button btnContar;
    @FXML Button btnEsperar;
    @FXML Label lblEsperar;
    int i = 0;
    
    @FXML
    private void conteoClics(){
        i++;
        txtClics.setText(""+i);
    }
    
    @FXML
    private void esperarDiez(){
        btnEsperar.setDisable(true);
        pgbBarra.setProgress(0.0);
        Thread t1 = new Thread(() -> {
            
            for(int j = 10; j >= 0; j--){
                int segActual = j;
                double progreso = (10.0 - j) / 10.0;
                Platform.runLater(() -> {
                    lblEsperar.setText("Esperar " + segActual + " segundos");
                    pgbBarra.setProgress(progreso);
                });
                
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Error: "+e.getMessage());
                    break;
                }        
            } 
            
            Platform.runLater(() -> {
                btnEsperar.setDisable(false);
                lblEsperar.setText("Completado.");
            });
        });
        t1.setDaemon(true);
        t1.start();
    }   
}