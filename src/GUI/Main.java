package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Test Layout chỗ này
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentGrades/StudentGrades.fxml"));
        //
        Parent root = loader.load();
        primaryStage.setTitle("8=>");
        primaryStage.setScene(new Scene(root, 700, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}