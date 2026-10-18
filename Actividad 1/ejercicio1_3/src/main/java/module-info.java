module com.ejercicio1_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejercicio1_3 to javafx.fxml;
    exports com.ejercicio1_3;
}
