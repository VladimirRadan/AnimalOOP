package animals;

public class Zoo {


    public static void main(String[] args) {

        Bird bird = new Bird(5, "F", 5);
        bird.move();

        Flyable hawk = new Hawk(3, "M", 5);
        hawk.fly();

        Chicken chicken = new Chicken(3, "F", 10);
        chicken.move();

        Animal bird2 = new Bird(5, "F", 5);
        bird2.eat();


    }


}
