package composite;

import car.Car;
import specifications.ICompositeSpecification;

/**
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public class AndNotSpecification extends CompositeSpecification {
    private ICompositeSpecification left;
    private ICompositeSpecification right;

    /**
     * 
     * @param left  the current object
     * @param right the other object to test for
     */
    public AndNotSpecification(ICompositeSpecification left, ICompositeSpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Car car) {
        return left.isSatisfiedBy(car) && !right.isSatisfiedBy(car);
    }

}
