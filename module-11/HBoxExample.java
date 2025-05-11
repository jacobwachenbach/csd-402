import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create an HBox container
        HBox hbox = new HBox(10); // 10 spacing

        // Buttons to add to the HBox
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Buttons added to the HBox
        hbox.getChildren().addAll(btn1, btn2, btn3);

        // Create the Scene
        Scene scene = new Scene(hbox, 300, 250);

        // Set up the Stage
        primaryStage.setTitle("JavaFX HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
