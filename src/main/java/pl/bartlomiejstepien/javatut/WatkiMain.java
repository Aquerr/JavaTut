package pl.bartlomiejstepien.javatut;

public class WatkiMain
{
    static int liczba = 0;

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        new Thread(WatkiMain::licz).start();
        new Thread(WatkiMain::licz).start();
    }

    private static void licz()
    {
        for (int i = 0; i < 10; i++)
        {
            liczba++;
            System.out.println(Thread.currentThread().getName() + ": " + liczba);
        }
    }
}
