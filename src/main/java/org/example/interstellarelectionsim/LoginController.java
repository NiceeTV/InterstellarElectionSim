package org.example.interstellarelectionsim;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField nameTextField;
    @FXML
    private ToggleButton diffButton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void Login(ActionEvent event) throws IOException {
        String username = nameTextField.getText();
        int difficulty = Integer.parseInt(diffButton.getText());
        System.out.println(username + difficulty);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ChooseCiv.fxml"));
        root = loader.load();

        ChooseController chooseController = loader.getController();
        chooseController.displayName(username,difficulty);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void incDiff(ActionEvent event) {
        String currentDifficulty = diffButton.getText();
        int currentDifficultyValue = Integer.parseInt(currentDifficulty);
        currentDifficultyValue = (currentDifficultyValue % 3) + 1;
        diffButton.setText(String.valueOf(currentDifficultyValue));

    }


}