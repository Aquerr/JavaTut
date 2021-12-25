package pl.bartlomiejstepien.javatut;


public class StringFormatMain
{
    public static void main(String[] args)
    {
        System.out.println(String.format("%10s %10s %10s", "Id", "Name", "Last Name"));
        System.out.println(String.format("%10s %10s %10s", "1", "Bartek", "Brzuszek"));
        System.out.println(String.format("%10s %10s %10s", "2", "Julia", "Brzuszek"));
        System.out.println(String.format("%10s %10s %10s", "3", "Bogdan", "Brzuszek"));
    }
}
