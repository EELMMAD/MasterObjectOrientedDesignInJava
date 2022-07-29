package se.udemy.elmira.singleResponsibilityHomework.clients;

import se.udemy.elmira.singleResponsibilityHomework.domain.Employee;
import se.udemy.elmira.singleResponsibilityHomework.domainDAO.EmployeeDAO;
import se.udemy.elmira.singleResponsibilityHomework.reporting.EmployeeReportFormatter;
import se.udemy.elmira.singleResponsibilityHomework.reporting.FormatType;

public class ClientModule {
    public static void main(String[] args) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee employee){
      EmployeeDAO employeeDao = new EmployeeDAO();
      employeeDao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, FormatType.CSV);
        System.out.println(formatter.getFormattedEmployee());
    }
}
