package seedu.nuke.gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.net.URL;
import java.util.ResourceBundle;

import static seedu.nuke.util.Message.*;

public class MainController implements Initializable {
    @FXML
    private TextFlow consoleScreen;

    @FXML
    private TextField console;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        consoleScreen.setStyle("-fx-font-family: Consolas; -fx-font-size: 12pt");
        Text logo = createText(MESSAGE_LOGO, Color.MAGENTA);
        Text welcomeMessage = createText(String.format("%s\n%s\n", MESSAGE_WELCOME_1, MESSAGE_WELCOME_2), Color.BLUE);
        Text divider = createText("-".repeat(80) + "\n");

        consoleScreen.getChildren().addAll(logo, divider, welcomeMessage);
    }

    public void submitInput() {
        System.out.println(console.getText());
        console.clear();
    }

    private Text createText(String input) {
        return new Text(input);
    }

    private Text createText(String input, Color color) {
        Text text = new Text(input);
        text.setFill(color);
        return text;
    }
}
