package ru.itmo.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Timer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("layer/sample.fxml"));
        primaryStage.setTitle("Practical");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        DataBaseDump dataBaseDump = new DataBaseDump();
        Timer timer = new Timer();
        timer.schedule(dataBaseDump, 300, 86_400_000);
        launch(args);

    }
}
