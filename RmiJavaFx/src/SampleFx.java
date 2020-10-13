import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;

import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

// Implementing the remote interface
public class SampleFx extends Application implements Hello {
    @Override
    public void start(Stage stage) {

        //Gridpane
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Drawing a Box
        Box box = new Box();

        // Creating a scene object
        Scene scene = new Scene(gridPane, 1000, 800);

        // Setting title to the Stage
        stage.setTitle("Event Handlers Example");

        // Adding scene to the stage
        stage.setScene(scene);

        // Displaying the contents of the stage
        stage.show();
    }

    // Implementing the interface method
    public void animation() {
        launch();
    }
}