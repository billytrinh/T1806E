package javafx_demo.Controller;


import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx_demo.Connector;
import javafx_demo.DAOUser;
import javafx_demo.Main;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Login implements Initializable {

   public TextField txtUsername;
   public PasswordField txtPassword;
   public Text labelTop;
   public Label labelUsername;
   public Label labelPassword;

    @Override
    public void initialize(URL location,
                           ResourceBundle resources) {
        labelTop.setText(Main.resourceBundle
                .getString("login_top"));
        labelUsername.setText(Main.resourceBundle
                .getString("label_username"));
        labelPassword.setText(Main.resourceBundle
                .getString("label_password"));
        txtUsername.setPromptText(Main.resourceBundle
                .getString("label_username"));
        txtPassword.setPromptText(Main.resourceBundle
                .getString("label_password"));
    }

    public void LoginAction()  {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        String sql = "SELECT id FROM user WHERE username LIKE '"+username
                +"' AND password LIKE '"+password+"'";

       Connector connector = Connector.getInstance();
       try {
           ResultSet rs = connector.statement.executeQuery(sql);
           if(rs.next()){
               // Change Scene
               Parent root = FXMLLoader.load(
                       getClass().getResource("../fxml/list.fxml"));
               Main.mainStage.getScene().setRoot(root);
               return;
           }
       }catch (SQLException e){

       }catch (IOException e){}

       System.out.println("That bai");
   }

}
