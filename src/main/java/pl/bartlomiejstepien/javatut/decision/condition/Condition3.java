package pl.bartlomiejstepien.javatut.decision.condition;

@FunctionalInterface
public interface Condition3<T, U, C>
{
    boolean test(T value, U value2, C value3);
}
