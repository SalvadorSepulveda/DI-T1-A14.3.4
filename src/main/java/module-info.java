module es.ieslosmontecillos.mouseevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.mouseevent to javafx.fxml;
    exports es.ieslosmontecillos.mouseevent;
}