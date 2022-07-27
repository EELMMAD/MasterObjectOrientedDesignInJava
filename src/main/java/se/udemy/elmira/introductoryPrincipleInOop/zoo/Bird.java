package se.udemy.elmira.introductoryPrincipleInOop.zoo;

public class Bird extends Animal implements Flyable{
    public Bird(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }

    @Override
    public void fly() {

    }

    /*
    //overriding the method defined in Bird  **** Override = Replace ****
    public void fly(){
        System.out.println("Flying...");
    }
     */
}
