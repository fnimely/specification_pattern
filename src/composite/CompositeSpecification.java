package composite;

import specifications.ICompositeSpecification;

/**
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public abstract class CompositeSpecification<T> implements ICompositeSpecification<T> {
    @Override
    public abstract boolean isSatisfiedBy(T candidate);

    @Override
    public ICompositeSpecification<T> And(ICompositeSpecification<T> other) {
        return new AndSpecification(this, other);
    };

    @Override
    public ICompositeSpecification<T> AndNot(ICompositeSpecification<T> other) {
        return new AndNotSpecification(this, other);
    }
}
