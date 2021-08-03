import details.CertainEngine;
import details.Engine;
import details.EngineType;
import professions.Driver;
import vehicles.Lorry;
import vehicles.SportCar;

public class MainCars {

    public static void main(String[] args) {

        CertainEngine myEngine1 = new CertainEngine(EngineType.Diesel);
        Driver driverN1 = new Driver("Volodya Petrov", 45, 25);
        Lorry myLorry = new Lorry("MAN", "A", 100, driverN1, 500, myEngine1);

        System.out.println(myLorry.toString());
        System.out.println(myEngine1.toString());
        myEngine1.startEngine();
        myLorry.start();
        myLorry.turnLeft();
        myLorry.turnRight();
        myLorry.stop();
        myEngine1.stopEngine();

        CertainEngine myEngine2 = new CertainEngine(EngineType.Petrol);
        Driver driverN2 = new Driver("Peya Petrov", 40, 20);
        SportCar mySportCar = new SportCar("Ferrari", "A", 10, driverN2, myEngine2);

        System.out.println(mySportCar.toString());
        System.out.println(myEngine2.toString());
        myEngine2.startEngine();
        mySportCar.start();
        mySportCar.turnLeft();
        mySportCar.turnRight();
        mySportCar.stop();
        myEngine2.stopEngine();

    }
}
