package com.ejercicio1_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtFecha;
    @FXML Label lblResultado;
    @FXML Button btnCalcular;
    @FXML Button btnLimpiar;
    
    @FXML
    private void calcularEdad(){
        String fecha = txtFecha.getText().trim();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate dt = LocalDate.parse(fecha, formato);
        int edadA = Period.between(dt, LocalDate.now()).getYears();
        int edadM = Period.between(dt.plusYears(edadA), LocalDate.now()).getMonths();
        int edadD = Period.between(dt.plusYears(edadA).plusMonths(edadM), LocalDate.now()).getDays();
        if(edadM > 0 && edadD > 0){
            lblResultado.setText("Tiene " + edadA + " años con " + edadM + " meses y " + edadD + " días.");
        } else if(edadM > 0 && edadD <= 0){
            lblResultado.setText("Tiene " + edadA + " años con " + edadM + " meses.");
        } else if(edadD > 0 && edadM <= 0){
            lblResultado.setText("Tiene " + edadA + " años con " + edadD + " dias.");
        } else{
            lblResultado.setText("Tiene " + edadA + " años.");
        }
    }
    
    @FXML
    private void limpiarTexto(){
        txtFecha.clear();
        lblResultado.setText("");
    }
    
}
