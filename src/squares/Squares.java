/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squares;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Hailey.Jones
 */
public class Squares extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        int width = 600;
        
       Group root = new Group();
       Canvas canvas = new Canvas(width, width); 
       
       GraphicsContext gc = canvas.getGraphicsContext2D();
       gc.setFill(Color.BLUE);
 gc.fillRect(200, 200, 200, 200);
       gc.fillRect(0, 0, 200, 200);
       gc.fillRect(400, 0, 200, 200);
       gc.fillRect(0, 400, 200, 200);
       gc.fillRect(400, 400, 200, 200);
       gc.setFill(Color.AQUAMARINE);
       
       
       
      

       
for(int y = 9; y < 1000; y = y*3 ){
    double s=width/y;
       gc.fillRect(s, s, s, s);
       gc.fillRect(s*7, s, s, s);
       gc.fillRect(s, s*7, s, s);
       gc.fillRect(s*7, s*7, s, s);
       
       gc.fillRect(s*4, s, s, s);
       gc.fillRect(s, s*4, s, s);
       gc.fillRect(s*7, s*4, s, s);
       gc.fillRect(s*4, s*7, s, s);
      
}
       
for(int y = 27; y<1000; y = y*3){
double


}
       root.getChildren().add(canvas);
       
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
