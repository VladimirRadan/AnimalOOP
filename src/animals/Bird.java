package animals;

public class Bird extends Animal{

    public Bird(int age, String gender, double wight) {
        super(age, gender, wight);
    }

    @Override
    void move() {
        System.out.println("Flapping wings..");
    }


    @Override
    void eat() {
        System.out.println("Eating corn....");
    }
}
