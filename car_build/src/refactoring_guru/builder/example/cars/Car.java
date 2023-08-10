package refactoring_guru.builder.example.cars;

import refactoring_guru.builder.example.components.TripComputer;
public class Car {
    private final CarType carType;
    public Car(CarType carType) {

        this.carType = carType;

    }
    public CarType getCarType() {

        return carType;
    }

}