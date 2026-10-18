module com.max.ejercicio1_5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.max.ejercicio1_5 to javafx.fxml;
    exports com.max.ejercicio1_5;
}
