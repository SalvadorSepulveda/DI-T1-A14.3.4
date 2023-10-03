package es.ieslosmontecillos.mouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("Programming is fun");
        text.setId("movable-text");
        text.setX(100);
        text.setY(100);

        text.setOnMouseDragged((MouseEvent event) -> {
            double mouseX = event.getX();
            double mouseY = event.getY();

            Text movableText = (Text) event.getSource();
            movableText.setX(mouseX);
            movableText.setY(mouseY);
        });

        Pane root = new Pane();
        root.getChildren().add(text);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}