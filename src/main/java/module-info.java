module org.example.employeedatabase {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens org.example.employeedatabase to javafx.fxml;
    exports org.example.employeedatabase;
}