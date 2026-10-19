package com.max.ejercicio3_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController implements Initializable{
    @FXML Button btnIniciar;
    @FXML ProgressBar pgbLiebre;
    @FXML ProgressBar pgbTortuga;
    @FXML Label lblLiebre;
    @FXML Label lblTortuga;
    Animal liebre = new Liebre();
    Animal tortuga = new Tortuga();
    
    @FXML
    private void iniciarCarrera(){
        btnIniciar.setDisable(true);
        pgbLiebre.setProgress(0.0);
        pgbTortuga.setProgress(0.0);
        lblTortuga.setText("La " + tortuga.getNombre() + ": ¡Está corriendo!");
        lblLiebre.setText("La " + liebre.getNombre() + ": ¡Está corriendo!");
        Thread tLiebre = new Thread(() -> {
            for(int i = (int)liebre.getVelocidad(); i >= 0; i--){
                double progreso = (4.0 - i) / 4.0;
            // Es cuestion de que la liebre se quede dormida un tiempo específico
            // para que la tortuga apenas llegue a ganar.
                if(progreso == 0.50){
                    pgbLiebre.setProgress(progreso);
                    Platform.runLater(() -> {
                        lblLiebre.setText("La " + liebre.getNombre() + ": ¡Está dormida!");
                    });
                    try{
                        Thread.sleep(6500);
                    }catch(InterruptedException e){
                        System.out.println("Error: "+e.getMessage());
                    }  
                }
                
                Platform.runLater(() -> {
                    pgbLiebre.setProgress(progreso);
                    
                    if(pgbTortuga.getProgress() == 1.0 && pgbLiebre.getProgress() < 1.0 ||
                            lblTortuga.getText().equals("La Tortuga: ¡Gana!")){
                        lblLiebre.setText("La "+ liebre.getNombre() + ": ¡Pierde!");
                    } else if(pgbTortuga.getProgress() < 1.0 && pgbLiebre.getProgress() == 1.0){
                        lblLiebre.setText("La "+ liebre.getNombre() + ": ¡Gana!");
                    } else{
                        lblLiebre.setText("La "+ liebre.getNombre() + ": ¡Sigue Corriendo!");
                    }
                });
                
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Error: "+e.getMessage());
                    break;
                }   
            }
        });
        
        Thread tTortuga = new Thread(() -> {
            for(int i = (int)tortuga.getVelocidad(); i >= 0; i--){
                double progreso = (10.0 - i) / 10.0;
                Platform.runLater(() -> {
                    pgbTortuga.setProgress(progreso);
                    if(pgbTortuga.getProgress() == 1.0 && pgbLiebre.getProgress() < 1.0){
                        lblTortuga.setText("La "+ tortuga.getNombre() + ": ¡Gana!");
                    } else if(pgbTortuga.getProgress() < 1.0 && pgbLiebre.getProgress() == 1.0 ||
                            lblLiebre.getText().equals("La Liebre: ¡Gana!")){
                        lblTortuga.setText("La "+ tortuga.getNombre() + ": ¡Pierde!");
                    } else{
                        lblTortuga.setText("La "+ tortuga.getNombre() + ": ¡Sigue Corriendo!");
                    }
                });
                
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Error: "+e.getMessage());
                    break;
                }   
            } 
        });
        btnIniciar.setDisable(false);
        tTortuga.setDaemon(true);
        tLiebre.setDaemon(true);
        tLiebre.start();
        tTortuga.start();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblLiebre.setText("La " + liebre.getNombre() + " está preparada.");
        lblTortuga.setText("La " + tortuga.getNombre() + " está preparada.");
    }
    
}
