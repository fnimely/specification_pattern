package specifications;

import car.Car;

/**
 * This interface represents a parameterized specification
 * where object as passed as parameters to dynamically check
 * against a criteria
 * 
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public interface ParameterizedSpecification {
    /**
     * 
     * @param car the object criteria to check
     * @return returns true if the object has the required specification, false
     *         otherwise
     */
    boolean isSatisfiedBy(Car car);
}
