package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("customer.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("genre.fxml"));
        primaryStage.setTitle("REVEMA VIDEO LIBRARY");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    //Main Method
    public static void main(String[] args) {
        launch(args);
    }
    @FXML
    private Pane pane;
    //Methods for changing scenes
    public void introGenreNextButton(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("genre.fxml"));
    }

    public void introMoviesNextButton(ActionEvent actionEvent) throws IOException {
        Parent root3 = FXMLLoader.load(getClass().getResource("movies.fxml"));
    }

    public void introRentalsNextButton(ActionEvent actionEvent) throws IOException {
        Parent root4 = FXMLLoader.load(getClass().getResource("rentals.fxml"));
    }

    public void introCustomerNextButton(ActionEvent actionEvent) throws IOException {
        Parent root5 = FXMLLoader.load(getClass().getResource("customers.fxml"));
    }
}
