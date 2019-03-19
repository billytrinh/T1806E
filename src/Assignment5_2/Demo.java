package Assignment5_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Demo extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass()
                .getResource("demo.fxml"));
        Scene scene = new Scene(root,600,400);
        primaryStage.setTitle("Demo T1806E");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
