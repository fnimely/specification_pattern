package composite;

import car.Car;
import specifications.ICompositeSpecification;

public class AndSpecification extends CompositeSpecification {
    private ICompositeSpecification left;
    private ICompositeSpecification right;

    public AndSpecification(ICompositeSpecification left, ICompositeSpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Car car) {
        return left.isSatisfiedBy(car) && right.isSatisfiedBy(car);
    }

}
