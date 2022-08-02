package se.udemy.elmira.coffeeshopProblem.customers;

//Observer
public interface WaitingCustomer {
    void orderReady(String prepareDrink);
    public String getName();
    public String getDrinkOrdered();
}
