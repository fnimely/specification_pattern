package hard_coded;

import car.Car;
import specifications.HardCodedSpecification;

public class NissanSpecification implements HardCodedSpecification {
    private static final String NISSAN = "Nissan";
    private Car car;

    public NissanSpecification(Car car) {
        this.car = car;
    }

    @Override
    public boolean isSatisfiedBy() {
        return car.getMake().equals(NISSAN);
    }
}
