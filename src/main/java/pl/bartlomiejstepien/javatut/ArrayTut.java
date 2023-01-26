package pl.bartlomiejstepien.javatut;

import java.util.Arrays;

public class ArrayTut
{
    public static void main(String[] args)
    {
        // ----------------------------------------------------------------------------------------------------
        // --------------------------------------------- ARRAYS -----------------------------------------------

        // Witaj w poradniku do pierwszej struktury danych, jaką jest -> Array (czytaj "erej").

        // Array, po polsku "tablica", jest to "struktura danych" pozwalająca przechowywać w sobie kolekcję elementów, o określonej pojemności.
        // Wielkość array'a (ile elementów jest w stanie pomieścić) określa się podczas jego tworzenia.
        // Ty decydujesz jak wiele elementów Twój array będzie w stanie pomieścić.
        // Array'a niestety nie można powiększać lub zmiejszać. To znaczy, jeśli przy tworzeniu array'a nadasz mu pojemność 10,
        // to nie będziesz mógł dodać do niego więcej niż 10 elementów. Więcej o tym w późniejszej części poradnika.

        // Wyobraźmy sobie jak wygląda array:

        // Oto wizualizacja przykładowego array'a (tablicy) przechowującego liczby od 1 do 6
        // -------------------------------------
        // |  1  |  2  |  3  |  4  |  5  |  6  |
        // -------------------------------------








        // ----------------------------------------------------------------------------------------------------
        // ------------------------------------------- TERMINOLOGIA -------------------------------------------

        // Liczby od 1 do 6 są "elementami" - elementami znajdującymi się w array'u.
        // Każdy z elementów znajduje się w jednej "komórce" (ang. cell) lub w "szufladce". Tak jak na przykład w Excelu.
        // Do każdego elementu możemy odnieść się przy pomocy "indexu". Index komórki to nic innego jak jej pozycja w arrayu.

        // Spójrzmy jeszcze raz na naszego array'a i zrozummy jak działa Index.
        // -------------------------------------
        // |  1  |  2  |  3  |  4  |  5  |  6  |
        // -------------------------------------

        // Index (czyli pozycję komórki) liczymy zawsze od zera. To znaczy... pierwsza komórka w naszym array'u ma pozycję 0 czyli "index 0".
        // W array'u mamy liczby od 1 do 6.
        // Czyli w komórce o indexie = 0 znajduje się liczba 1.
        // Natomiast w komórce o indexie 5 znajduje się liczba 6.

        // Dzięki Indexowi możemy bardzo szybko dowiedzieć się co znajduję się w konkretnej komórce arraya!
        // Jest to bardzo duża zaleta array'ów! Musimy tylko wiedzieć jaki index (jaką pozycję/komórkę) chcemy zapytać co ma w środku.


        // Array może również przechowywać inny typ danych niż liczby.
        // Możemy w nim umieścić co tylko chcemy, np. Stringi (słowa/zdania).
        // Np.

        // Poniższy array przechowuje w sobie nazwiska zawodników drużyny siatkarskiej.
        // -------------------------------------------------------------------------------------------------
        // |  Nowakowski  |  Muzaj  |  Konarski  |  Komenda  |  Kurek  |  Szalpuk  |  León  |  Wojataszek  |
        // -------------------------------------------------------------------------------------------------
        // Index:  0           1           2           3          4          5          6          7

        // Czy możesz powiedzieć w jakie imię znajduje sie w komórce o indexie 4?
        // Poprawna odpowiedź to: Kurek





        // ---------------------------------------------------------------------------------------------------------------------------
        // ------------------------------------------------- ARRAY W PRAKTYCE --------------------------------------------------------
        // ---------------------------------------------------------------------------------------------------------------------------

        // Przejdźmy teraz do części poradnika w której nauczymy się tworzyć sami array'a w Javie, dodawać oraz pobierać z niego dane.


        // ---------------------------------------------------------------------------------------------------------------------------
        // ------------------------------------------------- TWORZENIE ARRAYA --------------------------------------------------------

        // Oto jak możemy utworzyć prostego array'a o pojemności 10 przechowującego dane typu int.
        int[] mojArray = new int[10];

        // Wyjaśnienie jak to robimy:
        // 1. Piszemy najpierw jaki typ danych ma być przechowywany przez naszego array'a i dopisujemy za nim nawiasy kwadratowe oznaczające że chcemy utworzyć tutaj arraya.
        // 2. Piszemy nazwę naszej zmiennej, w tym przypadku "mojArray", która będzie przechowywała naszego array'a.
        // 3. Piszemy znak "równa się" gdyż chcemy do tej zmiennej przypisać wartość.
        // 4. Wartością którą chcemy przypisać do naszej zmiennej to "nowy array typu int o pojemności 10" dlatego piszemy "new int[10]".
        // 5. Kończymy "wyrażenie" ; średnikiem jak każde "wyrażenie" w Javie.

        // W tym momencie mamy już naszego array'a, naszą kolekcję danych przechowującą liczby całkowite.
        // Jakie liczby są w środku skoro jeszcze żadnej liczby nie dodaliśmy do naszego arraya?
        // Czy te dziesięć komórek jest puste?
        //Sprawdźmy co się tam znajduje!

        // Nasz array wygląda obecnie w taki sposób:
        // -------------------------------------------------------------
        // |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |
        // -------------------------------------------------------------

        // Wszystkie komórki otrzymały liczbę 0. Dlaczego?
        // Domyślnie gdy utworzymy Arraya, wszystkie komórki otrzymają domyślną wartość dla danego typu danych.
        // To znaczy... dla typu "int" będzie to 0. Dla typu "String" będzie to null, itd.

        // W tym przypadku utworzyliśmy arraya przechowującego typ danych "int" czyli liczby całkowite.
        // Z racji że domyślną wartością typu "int" jest 0, każda komórka w arrayu ma wartość 0.



        // Uwaga! Jeśli przed utworzeniem array'a znasz wartości jakie mają się w nim znaleźc możesz również utworzyć go "skrócony sposób", tzn.
        int[] mojArray2 = {1, 2, 3, 4}; // Taki array od razu ma w sobie wartości 1, 2, 3, 4

        // Przykład dla array'a z wartościami typu String
        String[] mojArray3 = {"Wyraz1", "Wyraz2", "Wyraz3"};






        // ---------------------------------------------------------------------------------------------------------------------------
        // ----------------------------------------- DODAWANIE I POBIERANIE WARTOŚCI -------------------------------------------------

        // Dodawanie i pobieranie danych z arraya jest bardzo proste i szybkie. W obu przypadkach wymagane jest od nas podanie indexu (pozycji komórki).
        // Spójrzmy najpierw na dodawanie danych do arraya.

        // --------------------------- DODAWANIE DANYCH ------------------------------

        // Mając pusty array z 10-oma elementami typu int, nasz array wygląda następująco
        // -------------------------------------------------------------
        // |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |
        // -------------------------------------------------------------

        // Chcąc wstawić liczbę do jakieś komórki używamy jej indexu.
        mojArray[2] = 4;

        // Co się tutaj dzieje?
        // 1. Piszemy nazwę zmiennej, która przechowuje nasz array.
        // 2. Bezpośrednio po nazwie zmiennej piszemy nawias kwadratowy (oznaczjący array) oraz index komórki do której chcemy się odnieść, w tym przypadku jest to komórka o indeksie 2.
        // 3. Piszemy znak "równa się" gdyż chcemy przypisać konkretną wartość danej komórce.
        // 4. Piszemy naszą wartość, w tym przypadku 4.

        // Po wykonaniu tej operacji nasz array wygląda następująco:
        // -------------------------------------------------------------
        // |  0  |  0  |  4  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |
        // -------------------------------------------------------------

        // Jak widzisz, w trzeciej komórce (czyli w komórce o indexie = 2 gdyż index zaczyna się od 0) mamy teraz liczbę 4.

        // --------------------------- POBIERANIE DANYCH ------------------------------

        // Pobieranie danych z arraya wygląda następująco

        // Przyjmijmy że mamy arraya z 10 różnymi liczbami:
        // -------------------------------------------------------------
        // |  2  |  6  |  3  |  0  |  8  |  1  |  3  |  6  |  3  |  5  |
        // -------------------------------------------------------------

        // Chcąc pobrać dane z jakieś komórki piszemy:

        int liczba = mojArray[6];

        // Co się tutaj dzieje?
        // 1. Piszemy typ zmiennej którą pobierzemy z array'a. W naszym przypadku "int".
        // 2. Piszemy nazwę naszej zmiennej, która będzie przechowywała pobraną wartość z arraya. W tym przypadku nazwaliśmy zmienną "liczba".
        // 3. Piszemy znak "równa się" gdyż chcemy przypisać wartość do naszej zmiennej. Wartość będzie pobrana z arraya.
        // 4. Piszemy nazwę naszego array'a, w tym przypadku "mojArray" i pobieramy wartość z komórki o indeksie = 6 pisząc go w nawiasie kwadratowym.
        // 5. Zmienna "liczba" zawiera teraz liczbę 3.

        // ---------------------------------------------------------------------------------------------------------------------------
        // ------------------------------------------ Sprawdzanie wielkości Array'a --------------------------------------------------

        // Aby dowiedzieć się jaką wielkość ma dany array... tzn. ile ma w sobie komórek używamy operacji "length" na naszym arrayu.
        // Przykład:

        // Tworzymy array z 10 komórkami.
        int[] mojArrayZ10Komorkami = new int[10];

        // Wyciągamy jego wielkość.
        int wielkoscArraya = mojArrayZ10Komorkami.length;

        // Poniższa operacja wypisze w konsoli 'Wielkość mojego array'a to ==> 10'
        System.out.println("Wielkość mojego array'a to ==> " + wielkoscArraya);

        // ---------------------------------------------------------------------------------------------------------------------------
        // ------------------------------------ Wypisywanie całego array'a w konsoli -------------------------------------------------

        // Często może zdarzyć się nam że będziemy chcieli wypisać cały Array w konsoli. Możemy to osiągnąć w bardzo prosty sposób
        // Wybraźmy sobie że mamy taki array.

        int[] arrayDoWypisania = {2, 6, 3, 0, 8, 1, 3, 6, 3, 5};

        // Możemy go zwizualizować następująco:
        // -------------------------------------------------------------
        // |  2  |  6  |  3  |  0  |  8  |  1  |  3  |  6  |  3  |  5  |
        // -------------------------------------------------------------

        // Wypisując taki array bezpośrednio do konsoli przy pomocy System.out.println zobaczymy tylko adres w pamięci danego array'a.
        System.out.println("Array do wypisania: " + arrayDoWypisania);

        // Żeby w konsoli wyświetliła nam się faktycznie zawartość takiego arraya jak w naszej wizualizacji musimy najpierw zamienić go w String
        // Możemy manualnie zbudować sobie taki String wyciągająć krok po kroku każdą liczbę i dodając ją do Stringa
        // lub możemy użyć gotowej już funkcji Arrays.toString(naszArray).
        // Przykład:
        String mojArrayJakoString = Arrays.toString(arrayDoWypisania);
        System.out.println(mojArrayJakoString);

        // ---------------------------------------------------------------------------------------------------------------------------
        // --------------------------------------------- Sortowanie array'a ----------------------------------------------------------

        // Może się zdarzyć że będziemy potrzebowali posortować naszego array'a.
        int[] arrayDoPosorotwania = {2, 6, 3, 0, 8, 1, 3, 6, 3, 5};

        // Możemy go zwizualizować następująco:
        // -------------------------------------------------------------
        // |  2  |  6  |  3  |  0  |  8  |  1  |  3  |  6  |  3  |  5  |
        // -------------------------------------------------------------

        // Wypisując taki array bezpośrednio do konsoli przy pomocy System.out.println zobaczymy tylko adres w pamięci danego array'a.
        System.out.println("Array do posortowania: " + Arrays.toString(arrayDoPosorotwania));

        // Aby posortować array'a mamy kilka możliwości. Jedną z nich jest zbudowanie mechanizmu sortującego samemu np. używając Bubble Sort.
        // lub użyć gotowej funkcji Arrays.sort(naszArray);

        // Przykład użycia Arrays.sort:
        Arrays.sort(arrayDoPosorotwania);
        System.out.println("Posortowany array: " + Arrays.toString(arrayDoPosorotwania));

        // Możemy go zwizualizować następująco:
        // -------------------------------------------------------------
        // |  0  |  1  |  2  |  3  |  3  |  3  |  5  |  6  |  6  |  8  |
        // -------------------------------------------------------------


        // ---------------------------------------------------------------------------------------------------------------------------
        // --------------------------------------------------------- Zadania ---------------------------------------------------------

        // 1. Stwórz array przechowujący inty o wielkości 3 komórek.
        // Wstaw do pierwszej komórki liczbę 40, do drugiej 20 a do trzeciej 10
        // Wypisz cały array w konsoli przy pomocy System.out.println oraz Arrays.toString

        // 2. Stwórz array przechwoujący inty o wielkości 2 komórek.
        // Wstaw do drugiej komórki liczbę 50.
        // Wyciągnij ją i przechowaj w zmiennej.
        // Wypisz zmienną w konsoli przy pomocy System.out.println tak aby liczba 50 wypisała się w konsoli.
        int[] test = {1, 4, 7};

        // 3. Utwórz array posiadający kilka nazw owoców. Np. Jabłko, Gruszka, Mandarynka
        //   Następnie wypisz w konsoli wielkość tego arraya przy pomocy funkcji "length".


        // 4. Dany jest array posiadający kilka imion. "Kacper", "Antek", "Jakub", "Bartek" oraz "Michał".
        // Posortuj dany array oraz wypisz go w konsoli.
        String[] arrayZImionami = {"Kacper", "Antek", "Jakub", "Bartek", "Michał"};

        // 5. Dany jest array z liczbami całkowitymi.
        // Napisz kod który wypisze największą liczbę całkowitą z danego array'a.
        // Uwaga: Napisany kod powinien działać również poprawnie dla array'a z innymi liczbami.
        int[] arrayZLiczbami = {4, 8, 2, 1, 9, 7, 4, 3};

    }
}
