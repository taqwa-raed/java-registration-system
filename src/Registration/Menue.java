package projtaymaa;

import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import static projtaymaa.add.i;


/**
 *
 * @author PC2
 */
public class Menue extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(15);
       
        Label l1 = new Label("------------------------------------------------------------\n"
                + "             KAU Gradebook (version2)   \n"
                + "------------------------------------------------------------");
        l1.setTextFill(Color.DARKMAGENTA);
       
        l1.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
        Button button1 = new Button("  Add a student record ");
        Button button2 = new Button("  Search for a student record (by ID)  ");
        Button button3 = new Button("  Search for a student record (by first and last name)");
        Button button4 = new Button("  Display statistical result of class  ");
        Button button5 = new Button("  Display all students ");
        Button button6 = new Button("  Quit  ");
        button1.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
        button2.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
        button3.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
        button4.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
        button5.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
        button6.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
        vBox.getChildren().add(l1);
        vBox.getChildren().add(button1);
        vBox.getChildren().add(button2);
        vBox.getChildren().add(button3);
        vBox.getChildren().add(button4);
        vBox.getChildren().add(button5);
        vBox.getChildren().add(button6);
        button1.setPrefSize(600, 60);
        button2.setPrefSize(600, 60);
        button3.setPrefSize(600, 60);
        button4.setPrefSize(600, 60);
        button5.setPrefSize(600, 60);
        button6.setPrefSize(600, 60);
        button1.setTextFill(Color.DARKMAGENTA);
        button2.setTextFill(Color.DARKMAGENTA);
        button3.setTextFill(Color.DARKMAGENTA);
        button4.setTextFill(Color.DARKMAGENTA);
        button5.setTextFill(Color.DARKMAGENTA);
        button6.setTextFill(Color.DARKMAGENTA);
        
        
       primaryStage.setResizable(false);
        Scene scene = new Scene(vBox ,600,600 );
         button1.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                        add n = new add ();
                        n.start(primaryStage);
                        }});
         button2.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                        IdSearch n = new IdSearch ();
                        n.start(primaryStage);
                        }});
          button4.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                        display n = new display ();
                        n.start(primaryStage);
                        
                        
                    } });
                        
         button3.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                        NameSearch n = new NameSearch();
                        n.start(primaryStage);
                        }});
         button5.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                          
         for(int i=0 ; i<Student.numOfStudents;i++){
             VBox pane1 = new VBox(15);
                          pane1.setStyle("-fx-background-color:#b6e7c9;-fx-padding:10px;");
                          Label la = new Label("***Class Roster and Grade Sheet***");
                          Button bt= new Button("Back");
             Label la1 = new Label("Student Record for"  + Number.student[i].getLName() + "  " + Number.student[i].getFName() + " (ID # " + Number.student[i].getID() + " )");
             Label la2 = new Label(" Exam1:      " + Number.student[i].getExamGrade(0));
             Label la3 = new Label(" Exam2:      " + Number.student[i].getExamGrade(1));
             Label la4 = new Label("Final Exam:  " + Number.student[i].getExamGrade(2));
             Label la5 = new Label("Final grade: " + Number.student[i].getFinalGrade());
             Label la6 = new Label("latter grade:" + Number.student[i].getLetterGrade());
                           la1.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la2.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la3.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la4.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la5.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la6.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
            
                           pane1.getChildren().addAll(la,la1,la2 ,la3 ,la4 ,la5,la6);
                            bt.setStyle("-fx-font: 20 arial; -fx-base: DARKMAGENTA");
                           bt.setPrefSize(120, 60);
                           pane1.getChildren().add(bt);
                           bt.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                      Menue n = new Menue ();
                        n.start(primaryStage);
                        }});
                         Scene scene = new Scene( pane1,500,400 ); 
        primaryStage.setTitle("Result");
        primaryStage.setScene(scene);
        primaryStage.show();
                           
                           }
         if(Student.numOfStudents==0){
             VBox pane1 = new VBox(15);
                          pane1.setStyle("-fx-background-color:#b6e7c9;-fx-padding:10px;");
                          Label la = new Label("***Class Roster and Grade Sheet***");
                          Button bt= new Button("Back");
             Label la7 = new Label("ERROR: there is no studen");
              la.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                         
                          pane1.getChildren().add(la);
                          pane1.getChildren().add(la7);
                           bt.setStyle("-fx-font: 20 arial; -fx-base: DARKMAGENTA");
                           bt.setPrefSize(120, 60);
                           pane1.getChildren().add(bt);
                           bt.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                      Menue n = new Menue ();
                        n.start(primaryStage);
                        }});
                         Scene scene = new Scene( pane1,500,400 ); 
        primaryStage.setTitle("Result");
        primaryStage.setScene(scene);
        primaryStage.show();
            
         }
                     
          }});
                        
                        
                        
         button6.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                         System.exit(0);
                        }});
  
        primaryStage.setTitle("Menue");
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
