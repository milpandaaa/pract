package ru.itmo.app;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class FxmlLoader {
    private Pane view;

    public Pane getPane(String fileName){

        try{
            URL fileUrl = getClass().getClassLoader().getResource("layer/" + fileName + ".fxml");
            if(fileUrl == null)
                throw new FileNotFoundException("File can't be found");

            view = new FXMLLoader().load(fileUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }

}
