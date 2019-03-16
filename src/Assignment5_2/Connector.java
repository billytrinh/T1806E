package Assignment5_2;
import java.sql.*;
public class Connector {

    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String JDBC_URL = "jdbc:mysql://localhost:8889/T1806E";
    final static String JDBC_USER = "t1806e";
    final static String JDBC_PASS = "t1806e123";

    public Connection conn;
    public Statement statement;

    public Connector(){
        try {
            Class.forName(Connector.JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(Connector.JDBC_URL,
                    Connector.JDBC_USER,Connector.JDBC_PASS);
            Statement stt = conn.createStatement();

            this.conn =connection;
            this.statement = stt;

        }catch (ClassNotFoundException e){

        }catch (SQLException e){

        }
    }

    public ResultSet getQuery(String sql){
        ResultSet rs = null;
        try {
            rs = this.statement.executeQuery(sql);

        }catch (SQLException e){}
        return rs;
    }

    public boolean getUpdate(String sql){
        try {
            this.statement.executeUpdate(sql);
            return true;
        }catch (SQLException e){

        }
        return false;
    }

}
