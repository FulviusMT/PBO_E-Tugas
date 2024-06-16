module org.example.modul {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    opens org.example.modul6 to javafx.fxml;
    opens org.example.modul6.Modul to javafx.base;
    exports org.example.modul6;
    exports org.example.modul6.Controller;
    opens org.example.modul6.Controller to javafx.fxml;
}