package com.max.ejercicio1_4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtNumero;
    @FXML Button btnCalcular;
    @FXML Button btnLimpiar;
    @FXML TextArea txtaTabla;
    
    @FXML
    private void generarTabla(){
        int numero = Integer.parseInt(txtNumero.getText().trim());
        for(int i = 1; i <= 10; i++){
            txtaTabla.appendText(numero + " x " + i + " = "+ (numero*i) + "\n");
        }
    }
    
    @FXML
    private void limpiarCampos(){
        txtNumero.clear();
        txtaTabla.clear();
    }
}
