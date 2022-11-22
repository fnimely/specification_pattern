package specifications;

import car.Car;

public interface ParameterizedSpecification {
    boolean isSatisfiedBy(Car car);
}
