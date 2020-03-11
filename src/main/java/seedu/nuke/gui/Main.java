package seedu.nuke.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import seedu.nuke.command.CommandResult;
import seedu.nuke.data.ModuleManager;
import seedu.nuke.ui.Ui;

import java.io.IOException;

public class Main extends Application {
    private CommandResult commandResult;
    private ModuleManager moduleManager;
    private Ui ui;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        this.moduleManager = new ModuleManager();
        this.ui = new Ui();
        // Load modules and tasks
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("V \u2022 NUS");
        stage.getIcons().add(new Image("seedu/nuke/gui/resource/image/venus_icon.png"));
        stage.setMinWidth(1000);
        stage.setMinHeight(600);


        Parent mainRoot = FXMLLoader.load(getClass().getResource("resource/main.fxml"));
        Scene main = new Scene(mainRoot);

        stage.setScene(main);
        stage.show();
    }
}
