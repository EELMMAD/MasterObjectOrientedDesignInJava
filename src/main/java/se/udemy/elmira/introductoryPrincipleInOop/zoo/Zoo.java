package se.udemy.elmira.introductoryPrincipleInOop.zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal sparrow1 = new Sparrow(1, "M", 4);
       // sparrow1.move();

        Animal fish1 = new Fish(1, "M", 2);
       // fish1.move();

       // moveAnimals(fish1);
       // moveAnimals(sparrow1);

        Flyable flyingBird = new Sparrow(1, "m",4);
        Flyable flyingBird2 = new Bird(1, "m",3);
        flyingBird.fly();
        flyingBird2.fly();
    }

    public static void moveAnimals(Animal animal){
     animal.move();
    }
}
