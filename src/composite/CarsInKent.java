package composite;

import car.Car;

public class CarsInKent extends CompositeSpecification<Car> {

    @Override
    public boolean isSatisfiedBy(Car car) {
        return car.getLocation().getCity().equals("Kent");
    }

}
