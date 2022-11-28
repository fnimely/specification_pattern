package composite;

import car.Car;
import specifications.ICompositeSpecification;

/**
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public class AndNotSpecification<T> extends CompositeSpecification<T> {
    private ICompositeSpecification left;
    private ICompositeSpecification right;

    /**
     * 
     * @param left  the current object
     * @param right the other object to test for
     */
    public AndNotSpecification(ICompositeSpecification<T> left, ICompositeSpecification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(T candidate) {
        return left.isSatisfiedBy(candidate) && !right.isSatisfiedBy(candidate);
    }

}
