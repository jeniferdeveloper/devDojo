package ZZCjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    // Interfaces java.sql: Connection, Statement, ResultSet
    // classe DriverManager

    public static Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";


     try {
        // Connection connection = DriverManager.getConnection(url, user, password);
         //System.out.println(connection);
         //return connection;

         return DriverManager.getConnection(url, user, password);

     } catch (SQLException e) {
         e.printStackTrace();
     }

     return null;

    }
}
