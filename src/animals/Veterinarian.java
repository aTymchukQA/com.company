package animals;

import javax.sound.midi.Soundbank;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println(animal.getFood());
        System.out.println(animal.getLocation());
        System.out.println(animal);
    }
}
