module com.example.app_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.app_2 to javafx.fxml;
    exports com.example.app_2;
}