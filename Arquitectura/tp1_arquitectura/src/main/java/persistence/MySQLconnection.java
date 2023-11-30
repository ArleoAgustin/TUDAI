package persistence;

import java.lang.reflect.InvocationTargetException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLconnection extends Connection {

    protected static  Connection instance;

    private String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    private String db_url = "jdbc:mysql://localhost:3306/mysql";

    private MySQLconnection() throws Exception {
        this.conectar();
    }

    public static java.sql.Connection getConnection() throws Exception {
        return getInstance().conection;
    }

    public static Connection getInstance() throws Exception {
        if (instance == null) {
            instance = new MySQLconnection();
        }
        return instance;
    }

    protected void conectar() throws Exception{
        try {
            Class.forName(jdbc_driver).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        try {
            this.conection = DriverManager.getConnection(db_url, "root", "admin");
            this.conection.setAutoCommit(false);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }











}
