module com.example.welcome {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires javafx.graphics;

    opens com.example.welcome to javafx.fxml;
    exports com.example.welcome;
}