/*
Name: Winnie Winnie
Date: 28 March 2017
Assignment 
*/
package workerfx;

import content.StageTwo;
import content.Worker;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WorkerFX extends Application {
    
    private final Label lblName = new Label("Name");
    private final TextField txtName = new TextField();
    
    private final Label lblCity = new Label("City");
    private final TextField txtCity = new TextField();
    
    private final Button btnAdd = new Button("Add Worker");
    private final Button btnDisplay = new Button("Display Workers");
    
    private final ArrayList <Worker> workerList = new ArrayList();
    
    private final Scene scene = new Scene(setPane(), 300, 300);
    
    @Override
    public void start(Stage primaryStage) {
         
        btnAdd.setOnAction((e)->{
            addText();
            txtName.clear();
            txtCity.clear();
            txtName.requestFocus();
        });
        
        btnDisplay.setOnAction((e)->{
            displayText(); 
        });
        
        primaryStage.setScene(scene);
        primaryStage.setX(50);
        primaryStage.setY(100);
        primaryStage.show();

    }
    
    private GridPane setPane(){
        GridPane gpane = new GridPane();
        gpane.addRow(0, lblName, txtName);
        gpane.addRow(1, lblCity, txtCity);
        gpane.addRow(2, btnAdd, btnDisplay);
        
        gpane.setPadding(new Insets(20));
        gpane.setHgap(10);
        gpane.setVgap(15);
        
        return gpane;
    }
    
    private void addText(){
        Worker wone = new Worker(txtName.getText(), txtCity.getText());
        workerList.add(wone);
    }
    
    private void displayText(){
        String workerStr = new String();
        for (int sub=0; sub<workerList.size(); sub++){
          workerStr += "Worker ["+sub+"]:" 
                  + "\tName: " + workerList.get(sub).getName() 
                  + "\n \t\t\tCity: "+ workerList.get(sub).getCity() +"\n"; 
          
        }
        StageTwo stage = new StageTwo(workerStr);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
