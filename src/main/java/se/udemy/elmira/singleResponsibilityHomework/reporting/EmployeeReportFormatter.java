package se.udemy.elmira.singleResponsibilityHomework.reporting;

import se.udemy.elmira.singleResponsibilityHomework.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee(){
        return getFormattedValue();
    }
}
