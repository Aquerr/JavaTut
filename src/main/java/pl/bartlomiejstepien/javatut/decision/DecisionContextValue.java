package pl.bartlomiejstepien.javatut.decision;

import java.util.function.Supplier;

class DecisionContextValue<T>
{
    private final Supplier<T> supplier;
    private T value;

    public static <T> DecisionContextValue<T> of(Supplier<T> supplier)
    {
        return new DecisionContextValue<>(supplier);
    }

    private DecisionContextValue(Supplier<T> supplier)
    {
        this.supplier = supplier;
    }

    public T getValue()
    {
        if (value == null)
            value = supplier.get();
        return value;
    }
}
