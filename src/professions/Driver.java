package professions;

public class Driver extends Person {

    Integer experience;

    public Driver(String fullName, Integer age, Integer experience) {
        super(fullName, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}

//    Автомобили. Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете
//    com.company.professions. Класс Driver содержит поля - ФИО, стаж вождения.
    //    Класс Engine содержит поля - мощность, производитель.
     //   Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
//   Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
//   "Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
    //    Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
//    Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью. Пусть класс Driver расширяет класс Person.
     //   Car and Engine - interfaces