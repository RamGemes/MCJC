module com.example.mcjc {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.ramgames.mcjc to javafx.fxml;
    exports net.ramgames.mcjc;
}