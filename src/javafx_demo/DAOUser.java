package javafx_demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOUser implements DAOInterface<User>{

    public static DAOUser instance;

    private DAOUser(){

    }

    @Override
    public void save(User user) {
        Connector connector = Connector.getInstance();
        String sql = "INSERT INTO user (username,email,password,status) VALUES('"+
                user.getUsername()+"','"+user.getEmail()+"','"+
                user.getStatus()+"')";
        try {
            connector.statement.executeUpdate(sql);
        }catch (SQLException e){}

    }

    @Override
    public ArrayList<User> list() {
        Connector connector = Connector.getInstance();
        String sql = "SELECT * FROM user";
        try {
            ArrayList<User> userArrayList= new ArrayList<>();
            ResultSet rs =  connector.statement.executeQuery(sql);
            while (rs.next()){
                Integer id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                Integer status = rs.getInt("status");
                userArrayList.add(new User(id,username,email,status));
            }
            return userArrayList;
        }catch (SQLException e){}
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    public static DAOUser getInstance(){
        if(instance == null){
            instance = new DAOUser();
        }
        return instance;
    }


}
