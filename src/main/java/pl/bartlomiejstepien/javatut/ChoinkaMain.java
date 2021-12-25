package pl.bartlomiejstepien.javatut;

import java.util.Scanner;

public class ChoinkaMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość poziomów choinki: ");
        int numberOfLevels = Integer.parseInt(scanner.nextLine());

        char space = ' ';
        StringBuilder lineToPrint = new StringBuilder();

        int currentLevel = 1;

        for (int j = numberOfLevels; j > 0; j--)
        {
            int numberOfStars = currentLevel * 2 - 1;

            // Spaces
            for (int i = j; i > 0; i--)
            {
                lineToPrint.append(space);
            }

            // Stars
            for (int i = 0; i < numberOfStars; i++)
            {
                lineToPrint.append("*");
            }
            System.out.println(lineToPrint);
            lineToPrint.setLength(0);
            currentLevel++;
        }
    }
}
