module com.max.ejercicio1_4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.max.ejercicio1_4 to javafx.fxml;
    exports com.max.ejercicio1_4;
}
