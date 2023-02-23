package pl.bartlomiejstepien.javatut.decision.condition;

@FunctionalInterface
public interface Condition2<T, U>
{
    boolean test(T value, U value2);
}
