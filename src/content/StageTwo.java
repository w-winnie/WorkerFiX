/*
Name: Winnie Winnie
Date: 28 March 2017
Assignment 
*/
package content;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StageTwo extends Stage
{
  private final TextArea txtDisplay = new TextArea(); 
  private final StackPane pane = new StackPane(txtDisplay);
  private final Scene scene = new Scene(pane);
  
  public StageTwo(String txt)
  {
      txtDisplay.setText(txt);
      super.setTitle("Display Workers");
      super.setX(400);
      super.setY(100);
      super.setScene(scene);
  }
}
