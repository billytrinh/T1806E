package javafx_demo.Controller;


import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx_demo.Connector;
import javafx_demo.DAOUser;
import javafx_demo.Main;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Login implements Initializable {

   public TextField txtUsername;
   public PasswordField txtPassword;
   public Text labelTop;
   public Label labelUsername;
   public Label labelPassword;
   public RadioButton radioVi;
   public RadioButton radioUs;
   public static String lang = "us";

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
        if(lang.equals("us")){
            radioVi.setSelected(false);
            radioUs.setSelected(true);
        }else if(lang.equals("vi")){
            radioUs.setSelected(false);
            radioVi.setSelected(true);
        }
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

   public void changeVi() throws Exception{
       lang = "vi";
       Main.resourceBundle = ResourceBundle.getBundle(
               "javafx_demo.languages.message",
               new Locale("vi","VN"));
       Parent root = FXMLLoader.load(getClass()
               .getResource("../fxml/login.fxml"));
       Main.mainStage.setTitle(Main.resourceBundle.getString("login_title"));
       Main.mainStage.getScene().setRoot(root);
   }

    public void changeUs() throws Exception{
        lang = "us";
        Main.resourceBundle = ResourceBundle.getBundle(
                "javafx_demo.languages.message",
                new Locale("en","US"));
        Parent root = FXMLLoader.load(getClass()
                .getResource("../fxml/login.fxml"));
        Main.mainStage.setTitle(Main.resourceBundle.getString("login_title"));
        Main.mainStage.getScene().setRoot(root);
    }

}
