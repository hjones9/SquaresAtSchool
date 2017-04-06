/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareathome;

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
public class SquareAtHome extends Application {

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

        double s;

        for (int y = 3; y < 60; y = y * 3) {
            s = width / y;

            gc.fillRect(s, s, s, s);
            gc.fillRect(s * 7, s, s, s);
            gc.fillRect(s, s * 7, s, s);
            gc.fillRect(s * 7, s * 7, s, s);

            gc.fillRect(s * 4, s, s, s);
            gc.fillRect(s, s * 4, s, s);
            gc.fillRect(s * 7, s * 4, s, s);
            gc.fillRect(s * 4, s * 7, s, s);

            if (y == 27) {
                //2nd square
                gc.setFill(Color.RED);

                gc.fillRect(s * 13, s, s, s);
                gc.fillRect(s * 13, s * 7, s, s);
                gc.fillRect(s * 10, s * 7, s, s);
                gc.fillRect(s * 10, s, s, s);

                gc.fillRect(s * 10, s * 4, s, s);
                gc.fillRect(s * 16, s * 4, s, s);
                gc.fillRect(s * 16, s * 7, s, s);
                gc.fillRect(s * 16, s, s, s);

                //3rd square
                gc.setFill(Color.CORAL);
                gc.fillRect(s * 25, s, s, s);
                gc.fillRect(s * 25, s * 4, s, s);
                gc.fillRect(s * 25, s * 7, s, s);

                gc.fillRect(s * 19, s, s, s);
                gc.fillRect(s * 19, s * 4, s, s);
                gc.fillRect(s * 19, s * 7, s, s);

                gc.fillRect(s * 22, s, s, s);
                gc.fillRect(s * 22, s * 7, s, s);

                //4th square
                gc.setFill(Color.BLUEVIOLET);

                gc.fillRect(s, s * 13, s, s);
                gc.fillRect(s, s * 10, s, s);
                gc.fillRect(s, s * 16, s, s);
                gc.fillRect(s * 4, s * 10, s, s);
                gc.fillRect(s * 7, s * 16, s, s);
                gc.fillRect(s * 4, s * 16, s, s);
                gc.fillRect(s * 7, s * 10, s, s);
                gc.fillRect(s * 7, s * 13, s, s);

                //5th square
                gc.setFill(Color.DIMGRAY);

                gc.fillRect(s * 25, s * 13, s, s);
                gc.fillRect(s * 19, s * 10, s, s);
                gc.fillRect(s * 22, s * 10, s, s);
                gc.fillRect(s * 25, s * 10, s, s);
                gc.fillRect(s * 25, s * 16, s, s);
                gc.fillRect(s * 19, s * 16, s, s);
                gc.fillRect(s * 19, s * 13, s, s);
                gc.fillRect(s * 22, s * 16, s, s);

                //6th square
                gc.setFill(Color.DEEPPINK);

                gc.fillRect(s, s * 25, s, s);
                gc.fillRect(s, s * 19, s, s);
                gc.fillRect(s, s * 22, s, s);
                gc.fillRect(s * 7, s * 19, s, s);
                gc.fillRect(s * 7, s * 22, s, s);
                gc.fillRect(s * 7, s * 25, s, s);
                gc.fillRect(s * 4, s * 25, s, s);
                gc.fillRect(s * 4, s * 19, s, s);

                //7th square
                gc.setFill(Color.GREEN);

                gc.fillRect(s*13, s*25, s, s);
                gc.fillRect(s*13, s*19, s, s);
                gc.fillRect(s*10, s*25, s, s);
                gc.fillRect(s*10, s*22, s, s);
                gc.fillRect(s*10, s*19, s, s);
                gc.fillRect(s*16, s*25, s, s);
                gc.fillRect(s*16, s*19, s, s);
                gc.fillRect(s*16, s*22, s, s);
                
                //8th square
                gc.setFill(Color.DARKGOLDENROD);
                
                gc.fillRect(s*25, s*25, s, s);
                gc.fillRect(s*25, s*22, s, s);
                gc.fillRect(s*25, s*19, s, s);
                gc.fillRect(s*22, s*19, s, s);
                gc.fillRect(s*22, s*25, s, s);
                gc.fillRect(s*19, s*19, s, s);
                gc.fillRect(s*19, s*22, s, s);
                gc.fillRect(s*19, s*25, s, s);
            }

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
