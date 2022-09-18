package com.example.universityproject.Login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LogIn extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Creating label for username
        Label lblUsername=new Label("Username");
        //Set column constraints
        GridPane.setConstraints(lblUsername,0,0);
        //Creating label for password
        Label lblPassword=new Label("Password");
        //Set column constraints
        GridPane.setConstraints(lblPassword,0,1);

        //Creating text field for username
        TextField txtUsername=new TextField("username");
        //Set column constraints
        GridPane.setConstraints(txtUsername,1,0);
        //Creating a password field
        PasswordField passwordField=new PasswordField();
        passwordField.setPromptText("password");
        //Set column constraints
        GridPane.setConstraints(passwordField,1,1);
        //Creating a button for login
        Button btnLogin=new Button("Log in");
        //Set column constraints
        GridPane.setConstraints(btnLogin,0,2);
        // add the style to the button
        btnLogin.getStyleClass().add("loginButton");

        //Create a gridpane layout to contain everything
        GridPane gridPane=new GridPane();
        gridPane.setPadding(new Insets(15,15,15,15));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.getChildren().addAll(lblUsername,lblPassword,txtUsername,passwordField,btnLogin);

        // Check the log in credential when click in the log in button
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String username=txtUsername.getText();
                String password=passwordField.getText();
                if(username=="Kabir"&&password=="1234"){

                }
                else {
                    //Creating a label for wrong password
                    Label lblWrongPassword=new Label("Invalid credential");
                    //add the label to the grid pane
                    gridPane.getChildren().add(lblWrongPassword);
                    //Set column constraints
                    GridPane.setConstraints(lblWrongPassword,0,5);
                    lblWrongPassword.getStyleClass().add("labelWrongPass");
                }
            }
        });

        //Creating a scene
        Scene logInScene=new Scene(gridPane,300,200);
        //connect the scene with the css style sheet
        logInScene.getStylesheets().add("style.css");
        stage.setScene(logInScene);
        stage.setTitle("Fabulous Cinema");
        stage.show();




    }

    public static void main(String[] args) {
        launch();
    }
}