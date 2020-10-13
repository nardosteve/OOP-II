package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Movies extends Application {

    @Override
    public void start(Stage primaryStage){

        //GridPane
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(10);
        gridpane.setVgap(10);
        gridpane.setStyle("-fx-background-color : BEIGE;");

        //primaryStage
        primaryStage.setTitle("Movies");
        primaryStage.setScene(new Scene(gridpane, 900, 500));
        primaryStage.show();

        //Text,Buttons and ComboBox
        Label genreLabel = new Label("Genres : ");
        gridpane.add(genreLabel,0,0);

        ComboBox genreCombo = new ComboBox();
        gridpane.add(genreCombo,1,0);

        Label genreNameLabel = new Label("Name : ");
        gridpane.add(genreNameLabel,0,1);

        TextField nameTextField = new TextField();
        gridpane.add(nameTextField,1,1);

        Button saveMovieBtn = new Button("Save Movie");
        saveMovieBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:10pt;");
        gridpane.add(saveMovieBtn,1,2);

        Label genreRegisterLabel = new Label("Registered : ");
        gridpane.add(genreRegisterLabel,0,3);

        ComboBox registerComboBox = new ComboBox();
        gridpane.add(registerComboBox,1,3);

        Button removeMovieBtn = new Button("Remove Movie");
        removeMovieBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:10pt;");
        gridpane.add(removeMovieBtn,1,4);

    }

    //Main method
    public static void main(String[] args) {

        launch(args);
    }
}
