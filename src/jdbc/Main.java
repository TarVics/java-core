package jdbc;

import java.sql.*;

public class Main {
    public static void writeResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String code = resultSet.getString(1);
            String name = resultSet.getString(2);
            System.out.println(code + " - " + name);
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT c.Code, c.Name FROM world.country AS c WHERE c.Name like ?");

        preparedStatement.setString(1, "U%");
        writeResultSet(preparedStatement.executeQuery());

        preparedStatement.setString(1, "A%");
        writeResultSet(preparedStatement.executeQuery());

        preparedStatement.close();
        connection.close();
    }
}
