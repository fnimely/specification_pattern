package specifications;

import car.Car;

/**
 * This interface represents a composite specification
 * 
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public interface ICompositeSpecification<T> {
    /**
     * 
     * @param car the object to test for
     * @return returns true if the objects meets all specifications criteria
     */
    boolean isSatisfiedBy(T candidate);

    /**
     * This method represents the case where both specification meets the criteria
     * 
     * @param other the other object to test
     * @return returns a specification
     */
    ICompositeSpecification<T> And(ICompositeSpecification<T> other);

    /**
     * This method represents the case where one specification meets the criteria
     * 
     * @param other the other object to test
     * @return returns a specification
     */
    ICompositeSpecification<T> AndNot(ICompositeSpecification<T> other);

}
