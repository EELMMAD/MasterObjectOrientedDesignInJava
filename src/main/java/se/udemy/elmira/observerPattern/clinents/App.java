package se.udemy.elmira.observerPattern.clinents;

import se.udemy.elmira.observerPattern.subjects.EmployeeManagementSystem;
import se.udemy.elmira.observerPattern.observer.HRDepartment;
import se.udemy.elmira.observerPattern.observer.IObserver;
import se.udemy.elmira.observerPattern.observer.PayrollDepartment;
import se.udemy.elmira.observerPattern.domain.Employee;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 3500, true);
        ems.hireNewEmployee(bob);


        ems.modifyEmployeeName(6, "Imtiaz");
        //ems.modifyEmployeeName(2, "Imtiaz");

    }
}
