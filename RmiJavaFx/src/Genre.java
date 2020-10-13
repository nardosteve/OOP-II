

import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//important imports
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

//Main class extends to Application library
public class Genre extends Application{

    //Method (start)
    @Override
    public void start(Stage primaryStage) {

        //GridPane
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(10);
        gridpane.setVgap(10);
        gridpane.setStyle("-fx-background-color : BEIGE;");

        gridpane.setPadding(new Insets(10,10,10,1));

        //primaryStage
        primaryStage.setTitle("Genre");
        primaryStage.setScene(new Scene(gridpane, 900, 500));
        primaryStage.show();

        //Text,Buttons and ComboBox
        Label nameLabel = new Label("Name : ");
        gridpane.add(nameLabel,0,0);

        TextField nameTextfield = new TextField();
        gridpane.add(nameTextfield,1,0);

        Button saveBtn = new Button("Save");
        saveBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:10pt;");
        saveBtn.setMaxWidth(250);
        gridpane.add(saveBtn,1,1);

        Label registerLabel = new Label("Registered : ");
        gridpane.add(registerLabel,0,2);

        ComboBox combobox = new ComboBox();
        gridpane.add(combobox,1,2);

        Button removeBtn = new Button("Remove");
        removeBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:10pt;");
        removeBtn.setMaxWidth(250);
        gridpane.add(removeBtn,1,3);

    }

	   // Implementing the interface method
    //public void animation() {
        //launch();
		public void animation(){
			launch();
		}
    }

