package pl.bartlomiejstepien.javatut.decision.condition;

import pl.bartlomiejstepien.javatut.decision.DecisionCondition;
import pl.bartlomiejstepien.javatut.decision.DecisionContext;
import pl.bartlomiejstepien.javatut.decision.DecisionContextKey;

import java.util.List;

public class SingleCondition<T> implements DecisionCondition
{
    private final DecisionContextKey<T> key;
    private final Condition<T> condition;

    public SingleCondition(DecisionContextKey<T> key, Condition<T> condition)
    {
        this.key = key;
        this.condition = condition;
    }

    public Condition<T> getCondition()
    {
        return condition;
    }

    @Override
    public List<DecisionContextKey<?>> getKeys()
    {
        return List.of(key);
    }

    @Override
    public boolean evaluate(DecisionContext decisionContext)
    {
        T value = decisionContext.get(key).orElse(null);
        return condition.test(value);
    }
}
