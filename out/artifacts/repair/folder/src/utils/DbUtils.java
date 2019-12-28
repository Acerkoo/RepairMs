package utils;

import java.sql.*;

public class DbUtils {
    private static String url = "jdbc:mysql://localhost:3306/java?useUnicode=true&characterEncoding=UTF-8";
    private static String username = "root";
    private static String password = "root";

    private DbUtils() {}

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if(connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void closeStatement(Statement statement) {
        try {
            if(statement != null)
                statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeResultSet(ResultSet rs) {
        try {
            if(rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeAll(ResultSet rs, Statement statement, Connection connection) {
        closeResultSet(rs);
        closeStatement(statement);
        closeConnection(connection);
    }
}
