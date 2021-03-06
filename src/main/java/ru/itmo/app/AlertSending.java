package ru.itmo.app;

import javafx.scene.control.Alert;
import javafx.stage.StageStyle;

public class AlertSending {

    static public void alertError(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Ошибка");
        alert.showAndWait();
    }
    static public void alertError(String attribute) throws Exception {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Неправильно введена дата в " + attribute);
        alert.showAndWait();
        throw new Exception("Неправильно введена дата в " + attribute);
    }
    static public void alertInfo(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText("Дейсвитвие прошло успешно");
        alert.showAndWait();
    }
}
