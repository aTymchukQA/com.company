package animals;

public class Dog extends Animal {

    public Dog(String food, String location, String name) {
        super(food, location, name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + "barks");
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
