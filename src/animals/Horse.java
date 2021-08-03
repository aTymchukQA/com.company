package animals;

public class Horse extends Animal {

    public Horse(String food, String location, String name) {
        super(food, location, name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " whinny");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
