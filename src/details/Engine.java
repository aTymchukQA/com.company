package details;

public interface Engine {

    default void startEngine() {
        System.out.println("Завелись");
    }

    default void stopEngine() {
        System.out.println("Двигатель отключен");
    }


}
