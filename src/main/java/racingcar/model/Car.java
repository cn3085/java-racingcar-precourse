package racingcar.model;

public class Car {
    private final CarName carName;

    public Car(CarName carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName.getName();
    }
}
