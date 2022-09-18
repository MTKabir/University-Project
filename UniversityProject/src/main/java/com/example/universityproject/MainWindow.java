package com.example.universityproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainWindow extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
            public void start(Stage stage){

        //Take a container for the menu bar
        BorderPane menuBorderPane=new BorderPane();
        MenuBar menuBar=new MenuBar();
        //creating menus
        Menu admin=new Menu("Admin");
        Menu help=new Menu("Help");
        Menu logOut=new Menu("Logout");
        // adding menus to the menubar
        menuBar.getMenus().addAll(admin,help,logOut);
        menuBorderPane.setTop(menuBar);

        // GridPane for the display of action
        GridPane gridPane1=new GridPane();
        //Label for purchase ticket
        Label lblPurchaseTicket=new Label("Purchase Ticket");

        //Take tableview for room 1
        TableView tableViewRoom1=new TableView();


        //Take tableview for room 2

        TableView tableViewRoom2=new TableView();


        //Create a scene for main window
        Scene mainWindow=new Scene(menuBorderPane,800,400);
        stage.setScene(mainWindow);
        stage.show();

    }


}
