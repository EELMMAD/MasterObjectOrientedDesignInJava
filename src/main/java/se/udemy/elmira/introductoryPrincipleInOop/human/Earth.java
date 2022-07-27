package se.udemy.elmira.introductoryPrincipleInOop.human;

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
        tom.speak();   //note here tom is human object

        System.out.println("-------");
        Human joe = new Human();
        joe.age = 36;
        joe.eyeColor = "Green";
        joe.name = "Joe Greensilk";
        joe.heightInInches = 68;

        joe.speak();


        //Now keep in mind that both Tom and Joe are different software objects.
        //
        //They have similar behavior and characteristics as defined in their class but they are completely separate
        //
        //objects.
    }
}
