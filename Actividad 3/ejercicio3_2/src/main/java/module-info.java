module com.max.ejercicio3_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.max.ejercicio3_2 to javafx.fxml;
    exports com.max.ejercicio3_2;
}
