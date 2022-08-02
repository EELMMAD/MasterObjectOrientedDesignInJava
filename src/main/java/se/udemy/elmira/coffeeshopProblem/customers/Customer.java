package se.udemy.elmira.coffeeshopProblem.customers;

public class Customer implements WaitingCustomer {
    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    @Override
    public void orderReady(String completeDrink) {
        if (drinkOrdered.equals(completeDrink))
            exitStore();
    }

    private void exitStore() {
        System.out.println(name + " : Thank you, I've received my " +
                drinkOrdered + " and leaving the store now...");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDrinkOrdered() {
        return drinkOrdered;
    }
}
