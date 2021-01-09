package projtaymaa;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

/**
 *
 * @author PC2
 */
public class Number extends Application {
    static int i;
    static Student[]student;
    
    @Override
    public void start(Stage primaryStage) {
         StackPane pane = new StackPane();
         ImageView img = new ImageView("file:///C:/Users/PC2/Desktop/%D8%AC%D8%A7%D9%85%D8%B9%D8%A9/elictronic/%D9%85%D8%B9%D9%85%D9%84/11.jpg");
          Text title = new Text("Enter The Name Of Student ");
           title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
           title.setUnderline(true);
           HBox hBox = new HBox(5);
            hBox.setAlignment(Pos.CENTER);
           Label l3 = new Label("Number Of Student");
           TextField StudentID = new TextField();
           StudentID.setPrefSize(60, 40);
           
           
           Button btAdd = new Button("Search");
       primaryStage.setResizable(false);
           l3.setBorder(new Border(new BorderStroke(Color.CORNFLOWERBLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
           l3.setTextFill(Color.DARKMAGENTA);
  l3.setStyle("-fx-font: 30 arial; -fx-base: #b6e7c9;");
   btAdd.setPrefSize(120, 60);
   btAdd.setTextFill(Color.DARKMAGENTA);
   btAdd.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
   BorderPane pane2= new BorderPane();
   pane2.setTop(title);
   
   hBox.getChildren().addAll(l3 , StudentID ,btAdd);
   pane.getChildren().add(img);
    pane.getChildren().add(pane2);
   pane.getChildren().add(hBox);
    btAdd.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
                    public void handle(ActionEvent e) {
                         i = Integer.parseInt(StudentID.getText());
                         student = new Student[i];
                          Menue n = new Menue ();
                        n.start(primaryStage);
                        }});
  
   Scene scene = new Scene(pane ,580,300 );
       primaryStage.setTitle("Number");
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