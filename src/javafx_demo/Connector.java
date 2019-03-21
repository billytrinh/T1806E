package javafx_demo;

import java.sql.*;

public class Connector {

    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String JDBC_URL = "jdbc:mysql://localhost:8889/T1806E";
    final static String JDBC_USER = "root";
    final static String JDBC_PASS = "root";

    public Connection conn;
    public Statement statement;

    public static Connector instance;

    private Connector(){
        try{
            Class.forName(Connector.JDBC_DRIVER);
            conn = DriverManager.getConnection(Connector.JDBC_URL,
                    Connector.JDBC_USER,Connector.JDBC_PASS);
            statement = conn.createStatement();

        }catch (ClassNotFoundException e){

        }catch (SQLException e){

        }
    }

    public static Connector getInstance(){
        if(instance == null){
            instance = new Connector();
        }
        return  instance;
    }

    // neu multithreads
//    public static Connector getInstance(){
//        if(instance == null){
//            synchronized (Connector.class){
//                instance = new Connector();
//            }
//
//        }
//        return  instance;
//    }

}
