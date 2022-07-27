package se.udemy.elmira.introductoryPrincipleInOop.zoo;

public class Fish extends Animal{
    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    public void swim(){
        System.out.println("Swimming...");
    }
}
