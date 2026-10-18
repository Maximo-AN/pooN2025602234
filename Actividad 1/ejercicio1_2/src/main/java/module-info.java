module com.ejercicio1_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejercicio1_2 to javafx.fxml;
    exports com.ejercicio1_2;
}
