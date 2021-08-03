package vehicles;

public interface Car {

    default void start() {
        System.out.println("Поехали");
    }

    default void stop() {
        System.out.println("Останавливаемся");
    }

    default void turnRight() {
        System.out.println("Поворот направо");
    }

    default void turnLeft() {
        System.out.println("Поворот налево");
    }


}
