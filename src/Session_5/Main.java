package Session_5;

// Buoc 1 - import java.sql package
import java.sql.*;

public class Main {

    public static void main(String args[]){
        try{
            // Buoc 2 - Khai bao driver
            Class.forName("com.mysql.jdbc.Driver");

            // Buoc 3 - Tao Database URL
            String DB_URL = "jdbc:mysql://localhost:8889/T1806E";
            String DB_USER = "root";
            String DB_PASS = "root";

            // Buoc 4 -- ket noi DB
            Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);

            // Buoc 5 - Thuc thi 1 truy van

            Statement statement = conn.createStatement(); // Tao 1 obj statement

            String sql = "SELECT * FROM student"; // tao 1 string query

            // Insert data
            String name = "Dinh van dat";
            String sql2 = "INSERT INTO student (name,age,mark) VALUES ('"+name+"',22,5)";
            statement.executeUpdate(sql2);

            // Thuc thi truy van va lay ket qua
            ResultSet resultSet = statement.executeQuery(sql);

            // In ra ket qua
            while (resultSet.next()){
                System.out.println("ID: "+ resultSet.getInt("id"));
                System.out.println("Name: "+ resultSet.getString("name"));
                System.out.println("Age: "+ resultSet.getInt("age"));
                System.out.println("Mark: "+ resultSet.getInt("mark"));
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
