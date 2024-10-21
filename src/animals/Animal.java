package animals;

public abstract class Animal {

    protected int age;
    protected String gender;
    protected double wight;

    public Animal(int age, String gender, double wight) {
        this.age = age;
        this.gender = gender;
        this.wight = wight;
    }

    void eat(){
        System.out.println("Eating...");
    }

    abstract void move();



}
