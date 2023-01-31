package pl.bartlomiejstepien.javatut;

public class TypyZmiennych
{
    public static void main(String[] args)
    {
        // W tym dziale dowiesz się jakie są podstawowe typy zmiennych w Javie.
        // Dowiesz się również jak w czasie rzeczywistym sprawdzić jakiego typu jest dana zmienna.


        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------- TYPY -----------------------------------------------

        // Java, jak inne wysokopoziomowe języki programowania posiada wiele typów, których możemy użyć podczas deklaracji zmiennej.
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

        // Java jest statycznie typowanym językiem, oznacza to że każda zmienna musi zostać najpierw zadeklarowana zanim zostanie użyta.
        // Deklaracja polega na określeniu typu zmiennej oraz nadania jej wybranej przez nas nazwy.
        // To znaczy. Najpierw piszemy jakiego typu ma być nasza zmienna. Np. int

        // int

        // Później piszemy jej nazwę. Może to być dowolne słowo.
        // W Javie z reguły używamy tutaj małych liter a każde kolejne słowo piszemy z wielkiej litery (bez spacji). Np. wiek, mojWiek, mojUkochanyPies

        // int wiek

        // Kolejno piszemy znak równa się oznaczający że chcemy coś przypisać do naszej zmiennej.
        // int wiek =

        // I na końcu piszemy wartość jaką ma otrzymać nasza zmienna i kończymy wyrażenie średnikiem. Np. 34;
        // int wiek = 34;

        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------- TYPY PRYMITYWNE ------------------------------------------

        // Prymitywne (proste) typy jakie posida Java to:

        // boolean (wartości tak/nie, true/false)
        boolean czyZimno = false;

        // byte (liczba całkowita od -128 do +127)
        byte mojaMalaLiczba = 54;

        // short (liczba całkowita od -32.768 do +32.767)
        short mojaLiczbaShort = 12312;

        // char (znak/litera)
        char litera = 'A';

        // int (liczba całkowita od -2.147.483.649 do +2.147.483.648)
        int wiek = 34;

        // long (liczba całkowita od -9.223.372.036.854.775.808 do +9.223.372.036.854.775.807)
        // Aby powiedzieć kompilatorowi że chcemy utworzyć long musimy na końcu liczby dopisać literę l lub L
        long wielkaLiczba = 93120931203910293L;

        // float (liczba zmiennoprzecinkowa, do 7 miejsc po przecinku)
        // Aby powiedzieć kompilatorowi że chcemy utworzyć float musimy na końcu liczby dopisać literę f lub F
        float liczbaZmiennoPrzecinkowa = 3.34051784f;

        // double (liczba zmiennoprzecinkowa, do 16 miejsc po przecinku)
        double mojaDrugaliczbaZmiennoPrzecinkowa = 8.321312312312;

        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------- TYPY REFERENCYJNE ------------------------------------------

        // Typami referncyjnymi w Javie nazywamy wszystkie złożone typy do których odnosimy się przy pomocy referencji.
        // Tworząc zmienną takiego typu używamy klasy.
        // Typy referencyjne w Javie:

        // Każdy obiekt w Javie jest referencją. Mówiąc prościej, każda zmienna typu:
        // String
        // File
        // Path
        // Player
        // itd.
        // + każdy wrapper typu prymitywnego, czyli Integer, Long, Boolean.
        // Wszystko to to typu referencyjne.

        // Co znaczy referencja?
        // Referencja to "odnośnik do czegoś".
        // Jeśli utworzymy sobie zmienną z prymitywnym typmem, np. int. Zmienna ta będzie przechowywała w sobie przypisaną do niej wartość.
        // Np.
        int mojWiek = 50;

        // Zmienna "mojWiek" bezpośrednio przechowuje wartość 50 typu integer. Nie jest to "referencja".

        // Utwórzmy sobie teraz zmienną typu String
        String zdanie = "Witaj świecie!";

        // Do jej utworzenia użyliśmy klasy "String". (Zauważ dużą literę "S", konwencją jest że wszystkie klasy w Javie zaczynają się od dużej litery)
        // To co się tutaj dzieje to:
        // 1. Utworzyliśmy zmienną "zdanie"
        // 2. Określiliśmy jej typ jako "String"
        // 3. Widzimy że przypisaliśmy do niej "wartość" -> "Witaj świecie!" ale...
        // 4. Java po wykonaniu tych poleceń utworzyła nam "obiekt" typu String w pamięci, a zmienna "zdanie" została referencją/odnośnikiem/wskaźnikiem do tego obiektu.

        // Kluczowe jest zrozumienie że w zmiennej "zdanie" nie ma tak naprawdę nie ma bezpośredniej wartości/obiektu tak jak jest to w przypadku typów prymitywnych.
        // W zmiennej "zdanie" jest tylko referencja do obiektu, którym jest nasze zdanie "Witaj świecie!".

        // Jakie to ma znaczenie?
        // 1. Przesyłanie zmiennych do metod.
        // 2. Obiekt używa więcej pamięci niż typ prymitywny. To tak jakby mieć wodę i butelkę gdzie jedno jest wartością a drugie czymś co przechowuje tę wartość.
        // Potrzebujemy przez to więcej pamięci aby przechować taki obiekt gdyż prócz wody musimy zapisać jeszcze butelkę samą w sobie.

        // Oczywiście nie znaczy to żeby nie używać obiektów! Wręcz przeciwnie, różnica w pamięci jest bardzo mała w obecnych czasach.
        // Dodatkoo obiekt potrafi trzymać w sobie wiele wartości a nie tylko jedną.
        // Zapisana przez nas butelka mogłaby mieć informacje o tym jaka woda jest w środku, z jakiego źródła, jakie ma minerały itd.
        // Ale o obiektach będziemy rozmawiać w innym poradniku.
        // Natomiast wyjaśnienie do punktu pierwszego znajdziesz w poradniku na temat metod.
    }
}
