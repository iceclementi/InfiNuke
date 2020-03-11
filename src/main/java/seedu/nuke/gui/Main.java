package seedu.nuke.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("V \u2022 NUS");
        // stage.setMaximized(true);
        stage.getIcons().add(new Image("seedu/nuke/gui/resource/image/venus_icon.png"));

        Parent homeRoot = FXMLLoader.load(getClass().getResource("resource/main.fxml"));
        Scene home = new Scene(homeRoot);

        home.setCursor(Cursor.DEFAULT);


        stage.setScene(home);
        stage.show();
    }
}
