module com.example.cas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.cas to javafx.fxml;
    exports com.example.cas;
}