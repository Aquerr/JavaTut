package pl.bartlomiejstepien.javatut.decision.condition;

import pl.bartlomiejstepien.javatut.decision.DecisionCondition;
import pl.bartlomiejstepien.javatut.decision.DecisionContext;
import pl.bartlomiejstepien.javatut.decision.DecisionContextKey;

import java.util.List;

public class DoubleCondition<T, U> implements DecisionCondition
{
    private final DecisionContextKey<T> key;
    private final DecisionContextKey<U> key2;
    private final Condition2<T, U> condition;

    public DoubleCondition(DecisionContextKey<T> decisionContextKey,
                                  DecisionContextKey<U> decisionContextKey2,
                                  Condition2<T, U> condition2)
    {
        this.key = decisionContextKey;
        this.key2 = decisionContextKey2;
        this.condition = condition2;
    }

    public Condition2<T, U> getCondition()
    {
        return condition;
    }

    @Override
    public List<DecisionContextKey<?>> getKeys()
    {
        return null;
    }

    @Override
    public boolean evaluate(DecisionContext decisionContext)
    {
        T value = decisionContext.get(key).orElse(null);
        U value2 = decisionContext.get(key2).orElse(null);
        return condition.test(value, value2);
    }
}
