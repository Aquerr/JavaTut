package pl.bartlomiejstepien.javatut.decision;

import pl.bartlomiejstepien.javatut.decision.condition.Condition;
import pl.bartlomiejstepien.javatut.decision.condition.Condition2;
import pl.bartlomiejstepien.javatut.decision.condition.DoubleCondition;
import pl.bartlomiejstepien.javatut.decision.condition.SingleCondition;

import java.util.List;

public interface DecisionCondition
{
    public static <T> DecisionCondition of(DecisionContextKey<T> decisionContextKey,
                                           Condition<T> condition)
    {
        return new SingleCondition<>(decisionContextKey, condition);
    }

    public static <T, U> DecisionCondition of(DecisionContextKey<T> decisionContextKey,
                                              DecisionContextKey<U> decisionContextKey2,
                                              Condition2<T, U> condition2)
    {
        return new DoubleCondition(decisionContextKey, decisionContextKey2, condition2);
    }

    public abstract List<DecisionContextKey<?>> getKeys();

    boolean evaluate(DecisionContext decisionContext);
}
