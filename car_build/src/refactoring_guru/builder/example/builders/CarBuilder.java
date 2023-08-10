package refactoring_guru.builder.example.builders;

import refactoring_guru.builder.example.cars.Car;
import refactoring_guru.builder.example.cars.CarType;
import refactoring_guru.builder.example.components.Engine;
import refactoring_guru.builder.example.components.GPSNavigator;
import refactoring_guru.builder.example.components.Transmission;
import refactoring_guru.builder.example.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
    }

    @Override
    public void setEngine(Engine engine) {
    }

    @Override
    public void setTransmission(Transmission transmission) {
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
    }

    public Car getResult() {
        return new Car(type);
    }
}