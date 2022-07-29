package se.udemy.elmira.singleResponsibilityHomework.domainDAO;

import se.udemy.elmira.singleResponsibilityHomework.database.DatabaseConnectionManager;
import se.udemy.elmira.singleResponsibilityHomework.domain.Employee;

public class EmployeeDAO {  //DAO -->
    DatabaseConnectionManager connectionManager;


    public void saveEmployee(Employee employee){
        /*
    DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
    connectionManager.connect();
    connectionManager.getConnectionObject().prepareStatement("insert into Employee-tbl");
    connectionManager.disconnect();
     */
        System.out.println("saved employee to the database: " + employee);

    }

    public void deleteEmployee(Employee employee){
        System.out.println("deleted employee from the database: " + employee);
    }
}
