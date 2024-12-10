package jm.task.core.jdbc.util;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private Util() {}

    private static final String URL = "jdbc:mysql://localhost:3306/1.1.3";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "Root5612.SOV9t";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
