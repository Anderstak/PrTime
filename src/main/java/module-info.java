module com.example.prtime {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prtime to javafx.fxml;
    exports com.example.prtime;
}