package pl.bartlomiejstepien.javatut;

import java.util.Arrays;

public class MainString
{
    public static void main(String[] args)
    {
        // ---------------------------------------------------------------------------------------------------------------------------
        // ------------------------------------------------------ String -------------------------------------------------------------

        // Dzisiaj nauczymy się bardziej szczegółowo czym jest "String" czyli jeden z naczęściej używanych typów w Javie.

        // String jest strukturą/typem danych przechowujący "sekwencję znaków".
        // Może to być jedno słowo lub całe zdanie.

        // Jeśli chcesz przechować w zmiennej tylko jedną literę to dużo lepszym typem danych jest typ "char" lub "Character".
        // String również może być użyty do przechowania jednej litery, ale zajmuje on wtedy więcej miejsca w pamięci niż "char".

        // Przykłady String'ów:
         String mojaZmienna = "To moje zdanie przechowane w Stringu";
         String mojaLiterka = "M";
         String mojaZmiennaTrzy = new String("To moja nowa zmienna w Stringu");

        // Możemy również łączyć Stringi przy pomocy plusa +
        // Na przykład:
        String mojPolaczonyString = "Łączenie stringów " + "jest przydatne!";

        // Poniższa operacja wypisze w konsoli zdanie 'Łączenie stringów jest przydatne!'
        System.out.println(mojPolaczonyString);

        // Przykład 2:
        String pierwszaCzescMojegoZdania = "Witaj mój drogi ";
        String drugaCzescMojegoZdania = "Dariuszu!";
        String caleZdanie = pierwszaCzescMojegoZdania + drugaCzescMojegoZdania;

        // Poniższa operacja wypisze w konsoli zdanie 'Witaj mój drogi Dariuszu!'
        System.out.println(caleZdanie);

        // ---------------------------------------------------------------------------------------------------------------------------
        // ----------------------------------- Pozostałe operacje dostępne na Stringach ----------------------------------------------

        // Kiedy utworzymy zmienną typu String możemy na niej wywołać wiele przydanch funkcji/metod.
        // Np.:
        // substring(start, end) - zwraca część Stringa
        // equals(obiekt) - porównuje Stringa z innym Stringiem
        // toUpperCase() - zwraca Stringa mającego zamienione wszystkie litery na drukowane.
        // toLowerCase() - zwraca Stringa mającego zamienione wszystkie litery na małe.
        // getBytes() - zwraca sekwencję bajtową Stringa
        // endsWith(string) - sprawdza czy String kończy się danym przyrostekiem/sufiksem

        // Przykłady w praktyce
        // substring
        String mojeZdanie1 = "To jest moje zdanie!";
        String poczatekZdania = mojeZdanie1.substring(0, 2);
        System.out.println(poczatekZdania); // Wypisze w konsoli wyraz "To"

        // equals
        String mojeZdanie2 = "To jest moje zdanie!";
        String mojeZdanie3 = "To jest moje zdanie!";
        boolean czyZdaniaSaJednakowe = mojeZdanie2.equals(mojeZdanie3);
        System.out.println(czyZdaniaSaJednakowe); // Wypisze w konsoli "true" gdyż zdania są jednakowe

        // toUpperCase
        String mojeZdanie4 = "To jest moje zdanie!";
        String mojeZdanie5ZDuzymiLiterami = mojeZdanie4.toUpperCase();
        System.out.println(mojeZdanie5ZDuzymiLiterami); // Wypisze w konsoli "TO JEST MOJE ZDANIE!"

        // toLowerCase
        String mojeZdanie6 = "To JeSt MojE ZdaNIE!";
        String mojeZdanie7ZMalymiLiterami = mojeZdanie6.toLowerCase();
        System.out.println(mojeZdanie7ZMalymiLiterami); // Wypisze w konsoli "to jest moje zdanie!"

        // getBytes
        String mojeZdanie8 = "To jest moje zdanie!";
        byte[] bajtyZdania = mojeZdanie8.getBytes();
        System.out.println(Arrays.toString(bajtyZdania)); // Wypisze bajty Stringa --> [84, 111, 32, 106, 101, 115, 116, 32, 109, 111, 106, 101, 32, 122, 100, 97, 110, 105, 101, 33]

        // endsWith
        String mojeZdanie9 = "To jest moje zdanie!";
        boolean czyZdanieKonczySieSlowemZdanieIWykrzyknikiem = mojeZdanie9.endsWith("zdanie!");
        System.out.println(czyZdanieKonczySieSlowemZdanieIWykrzyknikiem); // Wypisze "true" gdyż zdanie kończy się podanym sufiksem.
    }
}
