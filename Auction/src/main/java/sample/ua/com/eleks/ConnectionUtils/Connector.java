package sample.ua.com.eleks.ConnectionUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by moste on 15.11.2017.
 */
public class Connector {
private static Connection connection = null;
private final static String URL = "jdbc:postgresql://localhost:5432/";
private final static String USER ="postgres";
private final static String PASSWORD = "root";

public static Connection getConnection (){
    try {
//        if(!connection.isClosed()){return connection;}
        Class.forName("org.postgresql.Driver");
        connection= DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connection success");

    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    return connection;
}

}
