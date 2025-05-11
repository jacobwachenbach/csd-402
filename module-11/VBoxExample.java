import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a VBox container
        VBox vbox = new VBox(10); // 10 spacing

        // Create Buttons to add to the VBox
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Buttons added to the VBox
        vbox.getChildren().addAll(btn1, btn2, btn3);

        // Create the Scene
        Scene scene = new Scene(vbox, 300, 250);

        // Set up the Stage
        primaryStage.setTitle("JavaFX VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
