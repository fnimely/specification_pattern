package parameterized;

import car.Car;
import specifications.ParameterizedSpecification;

/**
 * This class represents the implementation of a parameterized specification
 * 
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public class MileageSpecification implements ParameterizedSpecification {
    private int mileage;

    /**
     * 
     * @param mileage the mileage criteria
     */
    public MileageSpecification(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean isSatisfiedBy(Car car) {
        return car.getMileage() <= mileage;
    }
}
