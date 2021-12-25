package pl.bartlomiejstepien.javatut;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IloscWystapienLiterWSlowieMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Podaj słowo: ");
            while (scanner.hasNext())
            {
                String word = scanner.next();
                Map<Character, Integer> characterOccurrences = getCharacterOccurrences(word);
                System.out.println("Wystąpienia liter: " + characterOccurrences);
                System.out.println("Najczęściej występująca litera: " + characterOccurrences.entrySet().stream()
                        .max(Map.Entry.comparingByValue()).get());
                System.out.println("Podaj słowo: ");
            }
        }
    }

    private static Map<Character, Integer> getCharacterOccurrences(String word)
    {
        final Map<Character, Integer> characterOccurrences = new HashMap<>();
        for (final char character : word.toCharArray())
        {
            characterOccurrences.merge(character, 1, Integer::sum);
        }
        return characterOccurrences;
    }
}