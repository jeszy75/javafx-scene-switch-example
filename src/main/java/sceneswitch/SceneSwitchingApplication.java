package sceneswitch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitchingApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(SceneSwitchingApplication.class.getResource("/fxml/first.fxml"));
        primaryStage.setTitle("JavaFX Scene Switching");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
