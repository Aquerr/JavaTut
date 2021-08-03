package pl.bartlomiejstepien.javatut.reflection;

public class Player
{
    private String name;
    private int level;

    public Player(String name, int level)
    {
        this.name = name;
        this.level = level;
    }

    private void przywitajSie()
    {
        System.out.println("Cześć! Nazywam się " + name);
    }
}
