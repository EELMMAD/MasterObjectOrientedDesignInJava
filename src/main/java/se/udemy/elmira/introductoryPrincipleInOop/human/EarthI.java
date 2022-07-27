package se.udemy.elmira.introductoryPrincipleInOop.human;

public class EarthI {
    public static void main(String[] args) {
        Human human1 = new Human("Tom", 25, 76, "Blue");
        Human human2 = new Human("Joe", 28, 68, "green");
        Human human3 = new Human("Eli", 39, 64, "brown");


        //There are three independent objects because we have this new human
        // new human being repeated three times
        human1.speak();
        human2.speak();
        human3.speak();
    }
}
