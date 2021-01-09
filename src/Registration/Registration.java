/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projtaymaa;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author PC2
 */
public class Registration extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        ImageView img = new ImageView("file:///C:/Users/PC2/Documents/NetBeansProjects/Registration /src/tm.jpg");
        pane.getChildren().add(img);
        Scene scene = new Scene(pane, 580, 480);
        StackPane pane2 = new StackPane();
        Button bt = new Button("Grade Book ");
        bt.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
        bt.setPrefSize(600, 60);
        pane2.getChildren().add(bt);
        pane2.setAlignment(Pos.CENTER);
        bt.setTextFill(Color.CRIMSON);
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                
                Number n = new Number();
                n.start(primaryStage);

            }
        });

        pane.getChildren().add(pane2);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Book Graid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
