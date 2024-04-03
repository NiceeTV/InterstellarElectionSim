module org.example.interstellarelectionsim {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.interstellarelectionsim to javafx.fxml;
    exports org.example.interstellarelectionsim;
}