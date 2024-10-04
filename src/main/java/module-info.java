module clinica {
    requires javafx.controls;
    requires javafx.fxml;

    opens clinica to javafx.fxml;
    exports clinica;
}
