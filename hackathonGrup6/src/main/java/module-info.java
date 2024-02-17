module com.grup6.hackathon_grup6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires jakarta.persistence;
    requires jakarta.validation;


    opens com.grup6.hackathon_grup6 to javafx.fxml;
    exports com.grup6.hackathon_grup6;
}