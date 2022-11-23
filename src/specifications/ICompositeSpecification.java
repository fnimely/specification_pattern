package specifications;

import car.Car;

/**
 * This interface represents a composite specification
 * 
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public interface ICompositeSpecification {
    /**
     * 
     * @param car the object to test for
     * @return returns true if the objects meets all specifications criteria
     */
    boolean isSatisfiedBy(Car car);

    /**
     * This method represents the case where both specification meets the criteria
     * 
     * @param other the other object to test
     * @return returns a specification
     */
    ICompositeSpecification And(ICompositeSpecification other);

    /**
     * This method represents the case where one specification meets the criteria
     * 
     * @param other the other object to test
     * @return returns a specification
     */
    ICompositeSpecification AndNot(ICompositeSpecification other);

}
