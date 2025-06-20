package com.example.job02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label closeWindow;

    @FXML
    protected void onCloseButtonClick(ActionEvent event) {
        closeWindow.setText("Fermeture de l'application !");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}