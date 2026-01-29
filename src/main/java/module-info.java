module com.example.securepasswordgeneratorjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.securepasswordgeneratorjavafx to javafx.fxml;
    exports com.example.securepasswordgeneratorjavafx;
}