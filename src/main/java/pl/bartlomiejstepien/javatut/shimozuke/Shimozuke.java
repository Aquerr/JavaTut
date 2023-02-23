package pl.bartlomiejstepien.javatut.shimozuke;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Shimozuke
{
    public static void main(String[] args)
    {
        System.out.println("Podaj text:");
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        FileWriter fileWriter = new FileWriter();

        while (scanner.hasNextLine())
        {
           String text = scanner.nextLine();
           TextToHex textToHex = new TextToHex(text, fileWriter);
           TextToUpperCase textToUpperCase = new TextToUpperCase(text, fileWriter, textToHex);

           Thread hexThread = new Thread(textToHex);
           Thread upperCaseThread = new Thread(textToUpperCase);

            try
            {
                hexThread.start();
                hexThread.join();
                upperCaseThread.start();
                upperCaseThread.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
