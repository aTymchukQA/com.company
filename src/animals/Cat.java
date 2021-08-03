package animals;

public class Cat extends Animal {

    public Cat(String food, String location, String name) {
        super(food, location, name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " meows");
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
