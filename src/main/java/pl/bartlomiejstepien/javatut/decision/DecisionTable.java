package pl.bartlomiejstepien.javatut.decision;

import java.util.ArrayList;
import java.util.List;

public class DecisionTable
{
    private final List<DecisionCondition> decisionConditionList;

    private DecisionTable(List<DecisionCondition> decisionConditions)
    {
        this.decisionConditionList = new ArrayList<>(decisionConditions);
    }

    public static DecisionTable of(List<DecisionCondition> decisionConditions)
    {
        return new DecisionTable(decisionConditions);
    }

    public boolean evaluate(DecisionContext decisionContext)
    {
        for (final DecisionCondition decisionCondition : decisionConditionList)
        {
            if (!decisionCondition.evaluate(decisionContext))
                return false;
        }

        return true;
    }
}
