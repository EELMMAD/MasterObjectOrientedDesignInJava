package se.udemy.elmira.introductoryPrincipleInOop;

public class Earth {
    public static void main(String[] args) {
        Human tom = new Human();
        //Now keep in mind that this Tom is just a variable.
        //
        //In reality there's not really an object.
        //
        //Objects come into existence when the application starts up.

        tom.speak();

        System.out.println("-------");
        tom.age= 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";
        tom.speak();
    }
}
