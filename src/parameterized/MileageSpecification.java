package parameterized;

import car.Car;
import specifications.ParameterizedSpecification;

public class MileageSpecification implements ParameterizedSpecification {
    private int mileage;

    public MileageSpecification(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean isSatisfiedBy(Car car) {
        return car.getMileage() == mileage;
    }
}
