package com.ejercicio1_3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtNumero;
    @FXML TextField txtCifras;
    @FXML TextField txtSCImpares;
    @FXML TextField txtSCPares;
    @FXML TextField txtSCTotal;
    @FXML TextField txtCifraMayor;
    @FXML TextField txtCifraMenor;
    @FXML TextArea txtaDivisores;
    @FXML Button btnAnalizar;
    @FXML Button btnLimpiar;
    
    @FXML
    private void analizarNumero(){
        int numero = Integer.parseInt(txtNumero.getText().trim());
        int cifras = String.valueOf(numero).length();
        int sumaImpar = 0, sumaPar = 0, sumaCifras = 0;
        int mayor = 0, menor = 0;
        // Lógica para la suma de cifras y buscar la mayor y menor cifra.
        for(int i = 0; i < cifras; i++){
            int nuevoValor = Integer.parseInt(Character.toString(String.valueOf(numero).charAt(i)));
            if((nuevoValor % 2) == 0){
                sumaPar += nuevoValor;
            } else{
                sumaImpar += nuevoValor;
            }
            sumaCifras += nuevoValor;
            if(mayor < nuevoValor){
                mayor = nuevoValor;
            }
            if(menor == 0 && i == 0){
                menor = nuevoValor;
            } else if(nuevoValor < menor){
                menor = nuevoValor;
            }
        }
        // Lógica para obtener los divisores
        String divisores = "";
        for(int j = numero; j > 0; j--){
            if((numero % j) == 0)
                divisores += String.valueOf(numero / j) + "\n";
        }
        txtCifras.setText(""+cifras);
        txtSCImpares.setText(""+sumaImpar);
        txtSCPares.setText(""+sumaPar);
        txtSCTotal.setText(""+sumaCifras);
        txtCifraMayor.setText(""+mayor);
        txtCifraMenor.setText(""+menor);
        txtaDivisores.setText(divisores);
    }
    
    @FXML
    private void limpiarCampos(){
        txtNumero.clear();
        txtCifras.clear();
        txtSCImpares.clear();
        txtSCPares.clear();
        txtSCTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        txtaDivisores.clear();
    }
}
