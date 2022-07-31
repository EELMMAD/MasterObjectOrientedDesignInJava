package se.udemy.elmira.interfaceSegregationPrinciple;

public class AccountReceivable {
    private Accounting transactionObject;

    public AccountReceivable(Accounting aTransaction) {
        this.transactionObject = aTransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
        //sends the invoice
    }
}
