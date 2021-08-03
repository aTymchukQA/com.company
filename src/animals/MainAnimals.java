package animals;

public class MainAnimals {

    public static void main(String[] args) {

        Dog myDog = new Dog("meat", "kennel", "Sharik");
        Cat myCat = new Cat("fish", "pillow", "Murka");
        Horse myHorse = new Horse("grass", "stable", "Shpak");
        Animal[] animals = {myCat, myHorse, myDog};

        Veterinarian myVeterinarian = new Veterinarian();

        for (Animal animal : animals) {
            myVeterinarian.treatAnimal(animal);
        }

    }

}
