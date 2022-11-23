package hard_coded;

import car.Car;
import specifications.HardCodedSpecification;

/**
 * This class represents the implementation of a hard coded specification
 * 
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public class NissanSpecification implements HardCodedSpecification {
    private static final String NISSAN = "Nissan";
    private Car car;

    /**
     * 
     * @param car the Car to check
     */
    public NissanSpecification(Car car) {
        this.car = car;
    }

    @Override
    public boolean isSatisfiedBy() {
        return car.getMake().equals(NISSAN);
    }
}
