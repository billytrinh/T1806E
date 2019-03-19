package javafx_demo.Controller;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx_demo.Connector;
import javafx_demo.Main;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

   public TextField txtUsername;
   public PasswordField txtPassword;

   public void LoginAction()  {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        String sql = "SELECT id FROM user WHERE username LIKE '"+username
                +"' AND password LIKE '"+password+"'";

       Connector connector = new Connector();
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
