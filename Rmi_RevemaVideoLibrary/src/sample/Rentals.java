package sample;

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
public class Rentals extends Application {

    //Method (start)
    @Override
    public void start(Stage primaryStage) throws Exception{

        //GridPane
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(10);
        gridpane.setVgap(10);
        gridpane.setStyle("-fx-background-color : BEIGE;");

        gridpane.setPadding(new Insets(10,10,10,1));

        //primaryStage
        primaryStage.setTitle("Rentals");
        primaryStage.setScene(new Scene(gridpane, 900, 500));
        primaryStage.show();

        //Text,Buttons and ComboBox
        Label RentalsCustomerLabel = new Label("Customer : ");
        gridpane.add(RentalsCustomerLabel,0,0);

        ComboBox RentalsCustomerCombo = new ComboBox();
        gridpane.add(RentalsCustomerCombo,1,0);

        Label RentalsGenreLabel = new Label("Genre : ");
        gridpane.add(RentalsGenreLabel,0,1);

        ComboBox RentalsGenreCombo = new ComboBox();
        gridpane.add(RentalsGenreCombo,1,1);

        Label RentalsMovieLabel = new Label("Movies : ");
        gridpane.add(RentalsMovieLabel,0,2);

        ComboBox RentalsMovieCombo = new ComboBox();
        gridpane.add(RentalsMovieCombo,1,2);

        Button RentalsSaveRental = new Button("Save Rental");
        gridpane.add(RentalsSaveRental,1,3);

        Label RentalsBorrowed = new Label("Borrowed : ");
        gridpane.add(RentalsBorrowed,1,4);

        ComboBox RentalsBorrowedCombo = new ComboBox();
        gridpane.add(RentalsBorrowedCombo,1,2);




    }
    //Main Method
    public static void main(String[] args) {

        launch(args);
    }
}
