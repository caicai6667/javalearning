package refactoring_guru.builder.example.components;

public class Engine {
    private final double volume;
    private final double mileage;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getVolume() {

        return volume;
    }

    public double getMileage() {

        return mileage;
    }
}