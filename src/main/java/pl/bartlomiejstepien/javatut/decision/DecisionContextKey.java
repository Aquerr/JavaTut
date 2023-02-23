package pl.bartlomiejstepien.javatut.decision;

public class DecisionContextKey<T>
{
    private final String key;
    private final Class<T> type;

    public static <T> DecisionContextKey<T> of(String key, Class<T> type)
    {
        return new DecisionContextKey<>(key, type);
    }

    private DecisionContextKey(String key, Class<T> type)
    {
        this.key = key;
        this.type = type;
    }

    public String getKey()
    {
        return key;
    }

    public Class<T> getType()
    {
        return this.type;
    }
}
