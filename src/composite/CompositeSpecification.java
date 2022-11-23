package composite;

import car.Car;
import specifications.ICompositeSpecification;

/**
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public abstract class CompositeSpecification implements ICompositeSpecification {
    @Override
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
