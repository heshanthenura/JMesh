module com.heshanthenura.jmeshserver {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.heshanthenura.jmeshserver to javafx.fxml;
    exports com.heshanthenura.jmeshserver;
}