package pl.bartlomiejstepien.javatut.decision.condition;

@FunctionalInterface
public interface Condition<T>
{
    boolean test(T value);
}
