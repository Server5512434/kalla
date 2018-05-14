package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 636, 500));
        primaryStage.setMinHeight(450);
        primaryStage.setMaxHeight(450);
        primaryStage.setMaxWidth(636);
        primaryStage.setMinWidth(636);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
