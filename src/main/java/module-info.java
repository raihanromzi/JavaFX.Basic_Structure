module com.basic_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.basic_javafx to javafx.fxml;
    exports com.basic_javafx;
}