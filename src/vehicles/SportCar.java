package vehicles;

import details.CertainEngine;
import details.Engine;
import professions.Driver;

public class SportCar implements Car {
    String marka;
    String clas;
    Integer weight;
    Driver myDriver;
    Integer maxSpeed;
    Engine myEngine2;

    public SportCar(String marka, String clas, Integer weight, Driver myDriver, Integer maxSpeed, Engine myEngine) {
        this.marka = marka;
        this.clas = clas;
        this.weight = weight;
        this.myDriver = myDriver;
        this.maxSpeed = maxSpeed;
        this.myEngine2 = myEngine;
    }

    public SportCar(String ferrari, String a, int weight, Driver driverN2, CertainEngine myEngine2) {
    }


    @Override
    public String toString() {
        return "SportCar{" +
                "marka='" + marka + '\'' +
                ", clas='" + clas + '\'' +
                ", weight=" + weight +
                ", myDriver=" + myDriver +
                ", maxSpeed=" + maxSpeed +
                ", myEngine2=" + myEngine2 +
                '}';
    }

    @Override
    public void start() {
        Car.super.start();
    }

    @Override
    public void stop() {
        Car.super.stop();
    }

    @Override
    public void turnRight() {
        Car.super.turnRight();
    }

    @Override
    public void turnLeft() {
        Car.super.turnLeft();
    }
}
