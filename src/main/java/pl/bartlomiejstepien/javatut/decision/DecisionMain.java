package pl.bartlomiejstepien.javatut.decision;

import pl.bartlomiejstepien.javatut.decision.faction.Faction;

import java.util.List;
import java.util.Objects;

public class DecisionMain
{
    private static final DecisionContextKey<Faction> PLAYER_FACTION_DECISION_CONTEXT_KEY = DecisionContextKey.of("playerFaction", Faction.class);
    private static final DecisionContextKey<Faction> OTHER_FACTION_DECISION_CONTEXT_KEY = DecisionContextKey.of("otherFaction", Faction.class);

    public static void main(String[] args)
    {
        DecisionTable decisionTable = DecisionTable.of(List.of(
                DecisionCondition.of(PLAYER_FACTION_DECISION_CONTEXT_KEY, value -> value.getName().equals("SafeZone")),
                DecisionCondition.of(OTHER_FACTION_DECISION_CONTEXT_KEY, Objects::nonNull),
                DecisionCondition.of(PLAYER_FACTION_DECISION_CONTEXT_KEY, OTHER_FACTION_DECISION_CONTEXT_KEY, (value1, value2) -> value1.getName().equals(value2.getName())),
                DecisionCondition.of(PLAYER_FACTION_DECISION_CONTEXT_KEY, value -> value.getName().length() > 4)
        ));

        DecisionContext decisionContext = new DecisionContext();
        decisionContext.put(PLAYER_FACTION_DECISION_CONTEXT_KEY, DecisionContextValue.of(() -> new Faction("SafeZone")));
        decisionContext.put(OTHER_FACTION_DECISION_CONTEXT_KEY, DecisionContextValue.of(() -> new Faction("SafeZone")));

        boolean passed = decisionTable.evaluate(decisionContext);


        System.out.println("Decision Table passed?: " + passed);
    }
}
