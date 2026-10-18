package com.max.ejercicio1_5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtAlimentacion;
    @FXML TextField txtRefrigerios;
    @FXML TextField txtTransporte;
    @FXML TextField txtTelefonia;
    @FXML TextField txtOtros;
    @FXML TextField txtTotalS;
    @FXML TextField txtGastoAlto;
    @FXML Button btnCalcular;
    @FXML Button btnLimpiar;
    
    @FXML
    private void calcularGastos(){
        int alimentos = Integer.parseInt(txtAlimentacion.getText().trim());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText().trim());
        int transporte = Integer.parseInt(txtTransporte.getText().trim());
        int telefonia = Integer.parseInt(txtTelefonia.getText().trim());
        int otros = Integer.parseInt(txtOtros.getText().trim());
        int total = alimentos + refrigerios + transporte + telefonia + otros;
        int gastoA = alimentos;
        String res = "";
        if(gastoA < refrigerios){
            gastoA = refrigerios;
            res = "Refrigerios";
        }
        if(gastoA < transporte){
            gastoA = transporte;
            res = "Transporte";
        }
        if(gastoA < telefonia){
            gastoA = telefonia;
            res = "Telefonía";
        }
        if(gastoA < otros){
            gastoA = otros;
            res = "Otros";
        }
        if(gastoA == alimentos){
            res = "Alimentos";
        }
        
        txtTotalS.setText("" + total);
        txtGastoAlto.setText("" + res);
    }
    
    @FXML
    private void limpiarCampos(){
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotalS.clear();
        txtGastoAlto.clear();
    }
}
