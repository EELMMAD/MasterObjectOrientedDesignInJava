package se.udemy.elmira.interfaceSegregationPrinciple;

public class ReportGenerator {
    private Reporting transactionObject;

    public void generateReporting() {
        System.out.println(transactionObject.getName() + " " +
                transactionObject.getDate() + " " +
                transactionObject.productBreakDown());
    }
}
