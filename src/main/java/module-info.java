module com.example.farmassistant {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.farmassistant to javafx.fxml;
    exports com.example.farmassistant;
}