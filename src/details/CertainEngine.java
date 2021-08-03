package details;

public class CertainEngine implements Engine {

    EngineType engineType;

    public CertainEngine(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public void startEngine() {
        Engine.super.startEngine();
    }


    @Override
    public void stopEngine() {
        Engine.super.stopEngine();
    }

    @Override
    public String toString() {
        return "CertainEngine{" +
                "engineType=" + engineType +
                '}';
    }
}
