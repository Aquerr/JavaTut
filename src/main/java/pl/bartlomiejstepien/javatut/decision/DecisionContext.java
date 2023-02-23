package pl.bartlomiejstepien.javatut.decision;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DecisionContext
{
    private final Map<DecisionContextKey<?>, DecisionContextValue<?>> contextKeys = new HashMap<>();

    public <T> void put(DecisionContextKey<T> decisionContextKey, DecisionContextValue<T> decisionContextValue)
    {
        this.contextKeys.put(decisionContextKey, decisionContextValue);
    }

    @SuppressWarnings(value = {"unchecked"})
    public <T> Optional<T> get(DecisionContextKey<T> decisionContextKey)
    {
        return Optional.ofNullable((T) this.contextKeys.get(decisionContextKey))
                .map(value -> ((DecisionContextValue<T>) value).getValue());
    }
}
