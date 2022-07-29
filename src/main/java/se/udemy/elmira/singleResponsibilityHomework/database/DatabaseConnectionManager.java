package se.udemy.elmira.singleResponsibilityHomework.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton pattern
public class DatabaseConnectionManager {
private Connection conn;
private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

private DatabaseConnectionManager(){

}

public static DatabaseConnectionManager getManagerInstance(){
    return connectionInstance;
}

/**
 * contain connection details
 *
 * @throw SQLException
 */

public void connect() throws SQLException{
    // processing specific to database connection details...
    conn = DriverManager.getConnection("Some/Database/URL");
    System.out.println("Establish Database Connection...");
}

public Connection getConnectionObject(){
    return conn;
}

    public Connection disconnect(){
        return conn;
    }


}
