package composite;

import car.Car;
import specifications.ICompositeSpecification;

public class AndNotSpecification extends CompositeSpecification {
    private ICompositeSpecification left;
    private ICompositeSpecification right;

    public AndNotSpecification(ICompositeSpecification left, ICompositeSpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Car car) {
        return left.isSatisfiedBy(car) && !right.isSatisfiedBy(car);
    }

}
