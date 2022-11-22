package composite;

import car.Car;
import specifications.ICompositeSpecification;

public abstract class CompositeSpecification implements ICompositeSpecification {
    public abstract boolean isSatisfiedBy(Car car);

    @Override
    public ICompositeSpecification And(ICompositeSpecification other) {
        return new AndSpecification(this, other);
    };

    @Override
    public ICompositeSpecification AndNot(ICompositeSpecification other) {
        return new AndSpecification(this, other);
    }
}
