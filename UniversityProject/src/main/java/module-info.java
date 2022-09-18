module com.example.universityproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.universityproject to javafx.fxml;
    exports com.example.universityproject;
    exports com.example.universityproject.Login;
    opens com.example.universityproject.Login to javafx.fxml;
}