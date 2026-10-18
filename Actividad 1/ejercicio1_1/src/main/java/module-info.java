module com.ejercicio1_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejercicio1_1 to javafx.fxml;
    exports com.ejercicio1_1;
}
