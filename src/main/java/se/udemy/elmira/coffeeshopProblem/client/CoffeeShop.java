package se.udemy.elmira.coffeeshopProblem.client;

import se.udemy.elmira.coffeeshopProblem.coffeeshop.CoffeeAttendant;
import se.udemy.elmira.coffeeshopProblem.customers.Customer;

public class CoffeeShop {
    public static void main(String[] args) {
        Customer robert = new Customer("Robert", "French Vanilla");
        Customer bill = new Customer("Bill", "Hot Coffee");

        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();
        coffeeAttendant.takeOrder(robert);
        coffeeAttendant.takeOrder(bill);

        //prepare drink
        coffeeAttendant.prepareDrink("French Vanilla");
        coffeeAttendant.prepareDrink("Hot Coffee");

        //order up
        coffeeAttendant.callOutCompletedOrders();
    }
}
