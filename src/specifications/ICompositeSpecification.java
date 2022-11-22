package specifications;

import car.Car;

/**
 * The composite spec
 */
public interface ICompositeSpecification {

    boolean isSatisfiedBy(Car car);

    ICompositeSpecification And(ICompositeSpecification other);

    ICompositeSpecification AndNot(ICompositeSpecification other);

}
