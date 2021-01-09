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
public class NameSearch extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     StackPane pane = new StackPane();
     ImageView img = new ImageView("file:///C:/Users/PC2/Desktop/%D8%AC%D8%A7%D9%85%D8%B9%D8%A9/elictronic/%D9%85%D8%B9%D9%85%D9%84/11.jpg");
           Text title = new Text("Add student racord");
           title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
           title.setUnderline(true);
           
  TextField First = new TextField();
  TextField Last = new TextField();
    Label l1 = new Label("First Name :");
    Label l2 = new Label("Last Name :");
     Button btAdd = new Button("Add");
  l1.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
  l2.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
  l1.setTextFill(Color.DARKMAGENTA);
  l1.setStyle("-fx-font: 35 arial; -fx-base: #b6e7c9;");
  l2.setTextFill(Color.DARKMAGENTA);
  l2.setStyle("-fx-font: 35 arial; -fx-base: #b6e7c9;");
      btAdd.setPrefSize(120, 60);
      btAdd.setTextFill(Color.DARKMAGENTA);
      btAdd.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
    First.setPrefSize(120, 40);
    Last.setPrefSize(120, 40);
     
     BorderPane pane2= new BorderPane();
     pane2.setTop(title);
     GridPane gridPane = new GridPane();
     pane.getChildren().add(img);
 gridPane.setHgap(5);
 gridPane.setVgap(5);
 gridPane.add(l1, 0, 0);
 gridPane.add(First, 1, 0);
 gridPane.add(l2, 0, 1);
 gridPane.add(Last, 1, 1);
 gridPane.add(btAdd, 1, 2);
      gridPane.setAlignment(Pos.CENTER);
      First.setAlignment(Pos.BOTTOM_RIGHT);
      Last.setAlignment(Pos.BOTTOM_RIGHT);
      GridPane.setHalignment(btAdd, HPos.RIGHT);
 pane.getChildren().add(pane2);
 pane.getChildren().add(gridPane);
 btAdd.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                        
        String s1 = First.getText();
         String s2 =Last.getText();
         
         int k=0;
              for(int i=0 ; i<Student.numOfStudents;i++){
                  if(Number.student[i].getLName().equals(s1)){
                       k++;
            
                         VBox pane1 = new VBox(15);
                          pane1.setStyle("-fx-background-color:#b6e7c9;-fx-padding:10px;");
                           Label la1 = new Label("Student Record for"  + Number.student[i].getLName() + "  " + Number.student[i].getFName() + " (ID # " + Number.student[i].getID() + " )");
                          Label la2 = new Label(" Exam1:      " + Number.student[i].getExamGrade(0));
                          Label la3 = new Label(" Exam2:      " + Number.student[i].getExamGrade(1));
                          Label la4 = new Label("Final Exam:  " + Number.student[i].getExamGrade(2));
                          Label la5 = new Label("Final grade: " + Number.student[i].getFinalGrade());
                          Label la6 = new Label("latter grade:" + Number.student[i].getLetterGrade());
              
                            Button bt= new Button("Back");
                           la1.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la2.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la3.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la4.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la5.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           la6.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           bt.setStyle("-fx-font: 20 arial; -fx-base: DARKMAGENTA");
                           bt.setPrefSize(120, 60);
                        
                          pane1.getChildren().addAll(la1,la2 ,la3 ,la4 ,la5,la6);
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
              }
                 if(k==0){
                       VBox pane1 = new VBox(15);
                          pane1.setStyle("-fx-background-color:#b6e7c9;-fx-padding:10px;");
                     System.out.println("");
                     Label la = new Label("\nERROR: there is no record for student name # " + s1+" " + s2);
                     Button bt= new Button("Back");
                           la.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                           bt.setStyle("-fx-font: 20 arial; -fx-base: DARKMAGENTA");
                           bt.setPrefSize(120, 60);
                            pane1.getChildren().addAll(la);
                          pane1.getChildren().add(bt);
                            bt.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                      Menue n = new Menue ();
                        n.start(primaryStage);
                        }});
                                            
        Scene scene = new Scene( pane1,500,200 ); 
        primaryStage.setTitle("Result");
        primaryStage.setScene(scene);
        primaryStage.show();
                 }
             }});
       Scene scene = new Scene(pane ,580,300 );
        primaryStage.setTitle("Name Search");
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