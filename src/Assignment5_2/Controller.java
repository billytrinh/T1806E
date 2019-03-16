package Assignment5_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TableColumn<User,Integer> id;
    public TableColumn<User,String> name;
    public TableColumn<User,String> email;
    public TableColumn<User,Integer> status;

    public TableView tableView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));

        Connector connector = new Connector();

        String sql = "SELECT * FROM user";
        try {
            ResultSet rs = connector.getQuery(sql);
            ObservableList<User> list = FXCollections.observableArrayList();
            while (rs.next()){
                Integer ID = rs.getInt("id");
                String name = rs.getString("username");
                String email = rs.getString("email");
                Integer status = rs.getInt("status");
                User user = new User(ID,name,email,status);
                list.add(user);
            }
            tableView.setItems(list);
        }catch (SQLException e){}


    }
}
