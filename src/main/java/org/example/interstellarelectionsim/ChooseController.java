package org.example.interstellarelectionsim;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ChooseController {

    @FXML
    private Label nameLabel;

    @FXML
    public void displayName(String username,int difficulty) {
        nameLabel.setText(nameLabel.getText() + " " + username + " (Diff: " + difficulty + ")");
    }

}
