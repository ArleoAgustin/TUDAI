package persistence;

public abstract class Connection {

    protected java.sql.Connection conection;
    String jdbc_driver;
    String db_url;

    protected abstract void conectar() throws Exception;

}
