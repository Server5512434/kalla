package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Taminot {
    public JFXButton addnew;
    public JFXButton supply;
    public JFXButton delete;
    public JFXButton addMahsulot;

    @FXML
    public void initialize(){
        addnew.setOnAction(event -> {
            Stage stage = (Stage) addnew.getScene().getWindow();
            stage.close();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/addnew.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                stage = new Stage();
                stage.setMaximized(true);
                stage.setScene(new Scene(root));
                stage.show();
            }catch (Exception e){

            }
        });
        delete.setOnAction(event -> {
            Stage stage = (Stage) delete.getScene().getWindow();
            stage.close();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/delete.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                stage = new Stage();
                stage.setMaximized(true);
                stage.setScene(new Scene(root));
                stage.show();
            }catch (Exception e){

            }
        });
        addMahsulot.setOnAction(event -> {
            Stage stage = (Stage) addMahsulot.getScene().getWindow();
            stage.close();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/Sklad.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                stage = new Stage();
                stage.setMaximized(true);
                stage.setScene(new Scene(root));
                stage.show();
            }catch (Exception e){

            }
        });

    }
}
