module org.example.tugaspbo_bangundatar {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.tugaspbo_bangundatar to javafx.fxml;
    exports org.example.tugaspbo_bangundatar;
}