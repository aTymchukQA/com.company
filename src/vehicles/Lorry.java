package vehicles;

import details.Engine;
import professions.Driver;

public class Lorry implements Car {

    String marka;
    String clas;
    Integer weight;
    Driver myDriver;
    Integer carrying;
    Engine myEngine1;

    public Lorry(String marka, String clas, Integer weight, Driver myDriver, Integer carrying, Engine myEngine) {
        this.marka = marka;
        this.clas = clas;
        this.weight = weight;
        this.myDriver = myDriver;
        this.carrying = carrying;
        this.myEngine1 = myEngine;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "marka='" + marka + '\'' +
                ", clas='" + clas + '\'' +
                ", weight=" + weight +
                ", myDriver=" + myDriver +
                ", carrying=" + carrying +
                ", myEngine=" + myEngine1 +
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
