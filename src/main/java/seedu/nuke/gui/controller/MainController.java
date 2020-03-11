package seedu.nuke.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField console;


    public void submitInput() {
        System.out.println(console.getText());
        console.clear();
    }
}
