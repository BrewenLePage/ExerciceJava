module com.exojava.exercicejava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.exojava.exercicejava to javafx.fxml;
    exports com.exojava.exercicejava;
    exports com.exojava.exercicejava.controller;
    opens com.exojava.exercicejava.controller to javafx.fxml;
}