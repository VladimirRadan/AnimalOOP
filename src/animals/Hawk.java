package animals;

public class Hawk extends Bird implements Flyable{


    public Hawk(int age, String gender, double wight) {
        super(age, gender, wight);
    }

    @Override
    public void fly() {
        System.out.println("Flying around");
    }
}
