

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBTest {
    public static void main(String[] args) throws ClassNotFoundException {

        // Формирование строки подключения
        String instanceName = "DMITRIY-ПК\\MSSQLSERVER";
        String databaseName = "TestJson";
        String userName = "TestLogin";
        String pass = "q1w2e3r4";
        String connectionUrl = "jdbc:sqlserver://DMITRIY-ПК\\MSSQLSERVER;databaseName=TestJson;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = String.format(connectionUrl, instanceName, databaseName, userName, pass);
        try {

            // Подключение к базе данных
            Connection con = DriverManager.getConnection(connectionString);
            // Отправка запроса на выборку и получение результатов
            Statement stmt = con.createStatement();
            ResultSet executeQuery = stmt.executeQuery("SELECT * FROM [Categories]");
            // Обход результатов выборки
            while (executeQuery.next()) {
                System.out.println(executeQuery.getString("Category"));
            }
            // Закрываем соединение
            executeQuery.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            // Обработка исключений
            Logger.getLogger(DBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}