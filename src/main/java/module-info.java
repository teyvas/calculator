module com.alatoo.calculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.alatoo.calculatorapp to javafx.fxml;
    exports com.alatoo.calculatorapp;
}