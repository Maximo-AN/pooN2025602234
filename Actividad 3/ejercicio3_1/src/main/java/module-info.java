module com.max.ejercicio3_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.max.ejercicio3_1 to javafx.fxml;
    exports com.max.ejercicio3_1;
}
