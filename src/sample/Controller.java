package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {

    public TextField login;
    public JFXButton sign;
    public PasswordField parol;

    @FXML
    public void initialize(){

        sign.setOnAction(event -> {
            kirish();
        });
    }

    private void kirish() {
        int a = login.getText().length();
        int b = parol.getText().length();

        if (a > 3 && b>3){
            String log = login.getText();
            String pas = parol.getText();
            DBWorker worker = new DBWorker();


            try{
                Statement statement = worker.getConnection().createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM apteka.spr_staff");
                String login = null;
                String password = null;
                int id = 0;
                while (resultSet.next()){
                    login = resultSet.getString(4);
                    password = resultSet.getString(5);
                    id = resultSet.getInt(8);
                }
                System.out.printf("%s, %s",login,password);
                if (log.equals(login) && pas.equals(password)){
                    System.out.printf("%s, %s, %s" ,login, password, id);
                    Stage stage = (Stage) sign.getScene().getWindow();
                    stage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/addnew.fxml"));
                    Parent root = (Parent) fxmlLoader.load();
                    stage = new Stage();
                    stage.setMaximized(true);
                    stage.setScene(new Scene(root));
                    stage.show();
                }else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("XATO");
                    alert.setHeaderText("Login yoki parolda xato");
                    alert.show();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void enter(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ENTER)){
            try {
                kirish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
