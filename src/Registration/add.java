
package projtaymaa;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author PC2
 */
public class add extends Application {
      static int id;
      static int n1;
      static int n2;
      static int n3;
      static int i ;
                                            
    
    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
         ImageView img = new ImageView("file:///C:/Users/PC2/Desktop/%D8%AC%D8%A7%D9%85%D8%B9%D8%A9/elictronic/%D9%85%D8%B9%D9%85%D9%84/11.jpg");
          Text title = new Text("Add student racord");
           title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
           title.setUnderline(true);
           
  TextField First = new TextField();
  TextField Last = new TextField();
  TextField StudentID = new TextField();
  TextField exam1 = new TextField();
  TextField exam2 = new TextField();
  TextField exam3 = new TextField();
    Label l1 = new Label("First Name :");
    Label l2 = new Label("Last Name :");
    Label l3 = new Label("Student ID :");
    Label l4 = new Label("First Exame :");
    Label l5 = new Label("Second Exame :");
    Label l6 = new Label("Third Exame :");
  Button btAdd = new Button("Add");
  l1.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
  l2.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
  l3.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
  l4.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
  l5.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
  l6.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
  
  l1.setTextFill(Color.DARKMAGENTA);
  l1.setStyle("-fx-font: 40 arial; -fx-base: #b6e7c9;");
  l2.setTextFill(Color.DARKMAGENTA);
  l2.setStyle("-fx-font: 40 arial; -fx-base: #b6e7c9;");
  l3.setTextFill(Color.DARKMAGENTA);
  l3.setStyle("-fx-font: 40 arial; -fx-base: #b6e7c9;");
  l4.setTextFill(Color.DARKMAGENTA);
  l4.setStyle("-fx-font: 40 arial; -fx-base: #b6e7c9;");
  l5.setTextFill(Color.DARKMAGENTA);
  l5.setStyle("-fx-font: 40 arial; -fx-base: #b6e7c9;");
  l6.setTextFill(Color.DARKMAGENTA);
  l6.setStyle("-fx-font: 40 arial; -fx-base: #b6e7c9;");
   btAdd.setPrefSize(120, 60);
   btAdd.setTextFill(Color.DARKMAGENTA);
   btAdd.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
   
    StudentID.setPrefSize(120, 40);
    First.setPrefSize(120, 40);
    Last.setPrefSize(120, 40);
    exam1.setPrefSize(60, 40);
    exam2.setPrefSize(60, 40);
    exam3.setPrefSize(60, 40);
   
 
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
 gridPane.add(l3, 0, 2);
 gridPane.add(StudentID, 1, 2);
 gridPane.add(l4, 0, 3);
 gridPane.add(exam1, 1, 3);
 gridPane.add(l5, 0, 4);
 gridPane.add(exam2, 1, 4);
 gridPane.add(l6, 0, 5);
 gridPane.add(exam3, 1, 5);
 gridPane.add(btAdd, 1, 6);
primaryStage.setResizable(false);



 gridPane.setAlignment(Pos.CENTER);
 First.setAlignment(Pos.BOTTOM_RIGHT);
 Last.setAlignment(Pos.BOTTOM_RIGHT);
 StudentID.setAlignment(Pos.BOTTOM_RIGHT);
 exam1.setAlignment(Pos.BOTTOM_RIGHT);
exam2.setAlignment(Pos.BOTTOM_RIGHT);
exam3.setAlignment(Pos.BOTTOM_RIGHT);
 GridPane.setHalignment(btAdd, HPos.RIGHT);
  pane.getChildren().add(pane2);
 pane.getChildren().add(gridPane);
  btAdd.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                       
                        i = Student.numOfStudents;
                        Number.student[i]=new Student();
                         id = Integer.parseInt(StudentID.getText());
                         n1 = Integer.parseInt(exam1.getText());
                         n2 = Integer.parseInt(exam2.getText());
                         n3 = Integer.parseInt(exam3.getText());
                         Number.student[i].setID(id);
                         Number.student[i].setLName(First.getText());
                         Number.student[i].setLName(Last.getText());
                         Number.student[i].SetExamGrade(n1, 0);
                         Number.student[i].SetExamGrade(n2, 1);
                         Number.student[i].SetExamGrade(n3, 2);
                         Number.student[i].CalculateFinalGrade();
                         Number.student[i].CalculateLatterGrade();
                         
                     
                         VBox pane1 = new VBox(15);
                          pane1.setStyle("-fx-background-color:#b6e7c9;-fx-padding:10px;");
                          Label la = new Label("The final grade for " +  Number.student[i].getLName() + " " +  Number.student[i].getFName() + "(ID# " +
                 Number.student[i].getID() +") is "  +  Number.student[i].getFinalGrade()+ " ( "  +  Number.student[i].getLetterGrade() + " )");
                            Button bt= new Button("Back");
                          la.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
                          bt.setStyle("-fx-font: 20 arial; -fx-base: DARKMAGENTA");
                           bt.setPrefSize(120, 60);
                        
                          pane1.getChildren().add(la);
                          pane1.getChildren().add(bt);
                            bt.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                      Menue n = new Menue ();
                        n.start(primaryStage);
                        }});
                          
                          
                          
        Scene scene = new Scene( pane1,600,200 ); 
        primaryStage.setTitle("Result");
        primaryStage.setScene(scene);
        primaryStage.show();
                        
                       
                        }});
 
        Scene scene = new Scene( pane,653,566 ); 
        primaryStage.setTitle("Add Record");
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
