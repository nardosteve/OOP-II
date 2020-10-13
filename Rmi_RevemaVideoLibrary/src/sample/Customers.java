package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;

//important imports
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

//Main class extends to Application library
public class Customers extends Application {

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
        primaryStage.setTitle("Customers");
        primaryStage.setScene(new Scene(gridpane, 900, 500));
        primaryStage.show();

        //Text,Buttons and ComboBox
        Label customerName = new Label("Name : ");
        gridpane.add(customerName,0,0);

        TextField nameTextField = new TextField();
        gridpane.add(nameTextField,1,0);

        Label customerPhone = new Label("Phone : ");
        gridpane.add(customerPhone,0,1);

        TextField phoneTextField = new TextField();
        gridpane.add(phoneTextField,1,1);

        Label customerEmail = new Label("Email : ");
        gridpane.add(customerEmail,0,2);

        TextField customerEmailTextField = new TextField();
        gridpane.add(customerEmailTextField,1,2);

        Button customerSaveCustomerBtn = new Button("Save Customer");
        customerSaveCustomerBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:10pt;");
        gridpane.add(customerSaveCustomerBtn,1,3);

        Label customerRegistered = new Label("Registered : ");
        gridpane.add(customerRegistered,0,4);

        ComboBox customerRegisterCombo = new ComboBox();
        gridpane.add(customerRegisterCombo,1,4);

        Button customerRemoveCustomer = new Button("Remove Customer");
        customerRemoveCustomer.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:10pt;");
        gridpane.add(customerRemoveCustomer,1,5);

    }
    //Main Method
    public static void main(String[] args) {

        launch(args);
    }
}
