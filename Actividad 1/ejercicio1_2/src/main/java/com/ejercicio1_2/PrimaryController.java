package com.ejercicio1_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML TextField txtDinero;
    @FXML TextArea txtaBilletes;
    @FXML Button btnDesglosar;
    @FXML Button btnLimpiar;
    
    @FXML
    private void calcularBilletes(){
        int dinero = Integer.parseInt(txtDinero.getText().trim());
        String billetes = "";
        // $500
        billetes += String.valueOf(dinero / 500);
        dinero -= ((dinero / 500) * 500);
        // $200
        billetes += "\n" + String.valueOf(dinero / 200);
        dinero -= ((dinero / 200) * 200);
        // $100
        billetes += "\n" + String.valueOf(dinero / 100);
        dinero -= ((dinero / 100) * 100);
        // $50
        billetes += "\n" + String.valueOf(dinero / 50);
        dinero -= ((dinero / 50) * 50);
        // $20
        billetes += "\n" + String.valueOf(dinero / 20);
        dinero -= ((dinero / 20) * 20);
        // $10
        billetes += "\n" + String.valueOf(dinero / 10);
        dinero -= ((dinero / 10) * 10);
        // $5
        billetes += "\n" + String.valueOf(dinero / 5);
        dinero -= ((dinero / 5) * 5);
        // $2
        billetes += "\n" + String.valueOf(dinero / 2);
        dinero -= ((dinero / 2) * 2);
        // $1
        billetes += "\n" + String.valueOf(dinero / 1);
        txtaBilletes.setText(billetes);
    }
    
    @FXML
    private void limpiarCampos(){
        txtDinero.clear();
        txtaBilletes.clear();
    }
}
