package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBWorker {

    private static final String URL = "jdbc:mysql://localhost:3306/apteka";
    private static final String USER = "root"
    ;private static final String PASSWORD = "root";

    private Connection connection;

    public DBWorker(){
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
