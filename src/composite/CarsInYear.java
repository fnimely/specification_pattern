package composite;

import car.Car;

public class CarsInYear extends CompositeSpecification<Car> {
    private int year;

    public CarsInYear(int year) {
        this.year = year;
    }

    @Override
    public boolean isSatisfiedBy(Car car) {
        return car.getYear() == year;
    }

}
