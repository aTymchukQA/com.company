package animals;

public abstract class Animal {

    String food, location, name;

    public Animal(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    public void makeNoise() {
    }

    public void eat() {
        System.out.println(name + " eats " + food);
    }

    public void sleep() {
        System.out.println(name + " sleeps " + location);
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

   /* Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food,
        location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль
        "Такое-то животное спит". Dog, Cat, Horse переопределяют методы makeNoise, eat.
        Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
        Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
        Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте
        массив типа Animal, в который запишите животных всех имеющихся у вас типов.
        В цикле отправляйте их на прием к ветеринару. */
