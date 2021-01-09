package projtaymaa;

import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static projtaymaa.add.i;

/**
 *
 * @author PC2
 */
public class display extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     StackPane pane = new StackPane();
     ImageView img = new ImageView("file:///C:/Users/PC2/Desktop/%D8%AC%D8%A7%D9%85%D8%B9%D8%A9/elictronic/%D9%85%D8%B9%D9%85%D9%84/11.jpg");
           Text title = new Text("Add student racord");
           title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
           title.setUnderline(true);
           
  TextField d1 = new TextField();
  TextField d2 = new TextField();
  Label l1 = new Label("Enter the name of  Instructor:");
  Label l2 = new Label("Enter the number of  coource:");
  Button btAdd = new Button("Display");
           l1.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
           l2.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
           l1.setTextFill(Color.DARKMAGENTA);
           l1.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
           l2.setTextFill(Color.DARKMAGENTA);
           l2.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
   btAdd.setPrefSize(120, 60);
   btAdd.setTextFill(Color.DARKMAGENTA);
   btAdd.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
           d1.setPrefSize(120, 40);
           d2.setPrefSize(120, 40);
     
           BorderPane pane2= new BorderPane();
           pane2.setTop(title);
           GridPane gridPane = new GridPane();
           pane.getChildren().add(img);
 gridPane.setHgap(5);
 gridPane.setVgap(5);
 gridPane.add(l1, 0, 0);
 gridPane.add(d1, 1, 0);
 gridPane.add(l2, 0, 1);
 gridPane.add(d2, 1, 1);
 gridPane.add(btAdd, 1, 2);
           gridPane.setAlignment(Pos.CENTER);
           d1.setAlignment(Pos.BOTTOM_RIGHT);
           d2.setAlignment(Pos.BOTTOM_RIGHT);
           GridPane.setHalignment(btAdd, HPos.RIGHT);
           pane.getChildren().add(pane2);
           pane.getChildren().add(gridPane);
  
btAdd.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            
                    public void handle(ActionEvent e) {
                        
                        
          String s1 = d1.getText();
          String s2 = d2.getText();
          int k = 0;
            double sum=0;
            for(int i=0 ; i<Student.numOfStudents;i++)
                sum += Number.student[i].getFinalGrade();
                double avg= sum/Student.numOfStudents;
                double max=Number.student[0].getFinalGrade();
                for(int i=1 ; i<Student.numOfStudents;i++){
                    if(Number.student[i-1].getFinalGrade()<Number.student[i].getFinalGrade())
                        max=Number.student[i].getFinalGrade();}
                double min=Number.student[0].getFinalGrade();
                for(int i=1 ; i<Student.numOfStudents;i++){
                    if(Number.student[i-1].getFinalGrade()>Number.student[i].getFinalGrade())
                        min=Number.student[i].getFinalGrade();  }
                int a =0;
                int b=0; 
                int c =0;
                int d =0 ;
                int t =0;
                int f=0;
                
        for(int i=0; i<Student.numOfStudents;i++){
            if(Number.student[i].getLetterGrade()=='A')
                a++;
            else if(Number.student[i].getLetterGrade()=='B')
                b++;
            else if(Number.student[i].getLetterGrade()=='C')
                c++;
            else if(Number.student[i].getLetterGrade()=='D')
                d++;
         else if(Number.student[i].getLetterGrade()=='E')
                t++;
         else 
             f++;}
          VBox pane1 = new VBox(15);
                          pane1.setStyle("-fx-background-color:#b6e7c9;-fx-padding:10px;");
                            Button bt= new Button("Back");
                          
                          bt.setStyle("-fx-font: 20 arial; -fx-base: DARKMAGENTA");
                           bt.setPrefSize(120, 60);
     
            Label la1 = new Label("\n Statistical Results of " + s1 +  " (Instructor: " + s2 + " ) " );
            Label la2 = new Label(" Total number of student records: " + Student.numOfStudents );
            Label la3 = new Label(" Average Score: " + avg);
            Label la4 = new Label("Highest Score: " + max);
            Label la5 = new Label("Lowest Score:  " + min);
        
             Label l1 = new Label(" Total 'A' Grades: " + a + " ( " + (a>0? (double)(100*a/Student.numOfStudents):0) + "% of class)");
             Label l2 = new Label(" Total 'B' Grades: " + b + " ( " + (b>0? (double)(100*b/Student.numOfStudents):0) + "% of class)");
             Label l3 = new Label(" Total 'C' Grades: " + c + " ( " + (c>0? (double)(100*c/Student.numOfStudents):0)+ "% of class)");
             Label l4 = new Label(" Total 'D' Grades: " + d + " ( " + (d>0? (double)(100*d/Student.numOfStudents):0) + "% of class)" );
             Label l5 = new Label(" Total 'E' Grades: " + t + " ( " + (t>0? (double)(100*t/Student.numOfStudents):0) + "% of class)" );
             Label l6 = new Label(" Total 'F' Grades: " + f + " ( " + (f>0? (double)(100*f/Student.numOfStudents):0) + "% of class)");
             la1.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             la2.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             la3.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             la4.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             la5.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             l1.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             l2.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             l3.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             l4.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             l5.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
             l6.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
              pane1.getChildren().addAll(la1 ,la2 ,la3,la4,la5 ,l1 ,l2,l3,l4,l5,l6);
                          pane1.getChildren().add(bt);
                            bt.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                      Menue n = new Menue ();
                        n.start(primaryStage);
                        }});
        Scene scene = new Scene( pane1,500,650 ); 
        primaryStage.setTitle("Result");
        primaryStage.setScene(scene);
        primaryStage.show();
                    
                    }
                   
                    
                    
                    
                     });
       Scene scene = new Scene(pane ,580,300 );
       primaryStage.setTitle("Display");
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