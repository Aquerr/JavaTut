package pl.bartlomiejstepien.javatut;

public class MainIteration
{
    public static void main(String[] args)
    {
        // ---------------------------------------------------------------------------------------------------------------------------
        // ------------------------------------------------------ ITERACJA -----------------------------------------------------------

        // Iteracja = Odwiedzanie każdej komórki w array'u. Inaczej mówiąc, iteracja to "przechodzenie przez listę elementów", element po elemencie.

        // Do przejścia przez wszystkie elementy w Array'u najczęściej używamy "pętli".
        // W Javie istnieje kilka różnych pętli które można wykorzystać do iteracji.
        // Są to:
        // Pętla "for"
        // Pętla "enhanced-for", znana również jako "for each"
        // Pętla "while"
        // Pętla "do while"

        // ---------------------------------------------------------------------------------------------------------------------------
        // ----------------------------------------------------- PĘTLA FOR -----------------------------------------------------------

        // Najbardziej podstawową pętlą w Javie jest pętla "for" (znana również jako "for-i") i to jej przyjrzymy się w tym momencie.
        // Najpierw zerknijmy jak wygląda przykładowa pętla "for"

        // Jak stworzyć pętlę for?
        // 1. Zacznij od słówka kluczowego "for".
        // 2. Następnie otwórz zwykły nawias. Teraz "możesz" podać w nim 3 różne parametry. Wszystkie oddzielone od siebie średnikami ;.
        //     a. Zmienną w której będzie przechowywana aktualne "okrążenie pętli"
        //     b. Warunek działania pętli, tzn. co musi zostać spełnione aby pętla się wykonała (dotyczy to każdego "okrążenia").
        //     c. Inkrementację zmiennej z punktu a, tzn. co ile ma zwiększyć się liczba okrążeń przy każdym wykonaniu pętli.
        // 3. Następnie, zamknij nawias oraz otwórz klamry a w nich napisz kod, który ma wykonać się w pętli przy każdym okrążeniu.

        // Przykładowa pętla for
        for (int i = 0; i < 10; i++)
        {
            // Kod który ma się wykonać 10 razy
            System.out.println("Wykonuję się po raz: " + i);
        }

        // Objaśnienie powyższego przykładu.
        // 1. Użyliśmy słówka "for" do utworzenia pętli.
        // 2. Zdefiniowaliśmy zmienną typu "int" o nazwie "i" oraz przydzieliliśmy jej startową wartość = 0
        // 3. Określiliśmy warunek działania pętli i < 10, co oznacza że pętla będzie wykonywała się dopóki i będzie mniejsze niż 10.
        // 4. Określiliśmy inkrementację naszej zmiennej aby zwiększała się o "jeden" przy każdym "okrążeniu". i++ oznacza to samo co i = i + 1
        // 5. Otworzyliśmy klamry pętli i umieściliśmy w nich System.out.println które wypisze w konsoli zdanie mówiące które okrążenie wykonuje właśnie pętla.

        // Zauważ że w sekcji "Jak stworzyć pętlę?" powiedzieliśmy że w nawiasach pętli for "możesz" (cudzysłów) podać w nich 3 parametry.
        // Pętla for nie wymaga tych parametrów aby działać, ale zazwyczaj się je podaje.
        // Poniższy przykład to też pełnoprawna pętla for, która będzie wykonywała się bez końca gdyż nie ma podanych warunków zakończenia.

//        for (;;)
//        {
//             Kod który wykonuje się bez końca...
//        }

        // Pętla "for" jest bardzo często używana do iterowania/przechodzenia po elementach w array'u.
        // Przykładowo:
        int[] mojArray = new int[10];
        for (int i = 0; i < mojArray.length; i++)
        {
            // Kod który wykona się tyle raz ile elementów mieści mojArray
            int mojInt = mojArray[i];

            // Kod który zrobi coś z wyciągniętym integer'em...
        }






        // ---------------------------------------------------------------------------------------------------------------------------
        // --------------------------------------------------- PĘTLA FOREACH ---------------------------------------------------------

        // Kolejna pętla na którą zerkniemy to pętla "enhanced for", znana również jako "for-each" (lub po prostu "for").

        // Przykładowa pętla "for-each"
        int[] mojArray2 = new int[10];
        for (int liczba : mojArray2)
        {
            // Kod który wykona się tyle razy ile elementów mieści mojArray2
        }

        // Jak widzisz pętla for-each jest znacznie prostsza, ale wymaga od Ciebie "czegoś" po czym będzie mogła iterować i wyciągać dla Ciebie elementy.
        // W naszym przypadku jest to mojArray2.

        // Jak stworzyć pętlę for-each?
        // 1. Zacznij od słówka kluczowego "for".
        // 2. Następnie otwórz zwykły nawias. Teraz musisz podać zmienną w której przechowasz otrzymany element z kolekcji.
        // 3. Następnie, określ "z czego chcesz wyciągać po kolei" pisząc dwukropek a za nim swoją kolekcję.
        // 4. Następnie, zamknij nawias oraz otwórz klamry a w nich napisz kod, który ma wykonać się w pętli przy każdym okrążeniu.





        // ---------------------------------------------------------------------------------------------------------------------------
        // ----------------------------------------------------- PĘTLA WHILE ---------------------------------------------------------

        // Kolejna pętla na którą zerkniemy to pętla "while".

        // Przykładowa pętla "while"

//        while (true)
//        {
//             // Kod który będzie wykonywał się cały czas...
//        }

        // Przykład 2
        int maksymalnaIloscProb = 3;
        int proba = 1;
        while (proba <= maksymalnaIloscProb)
        {
            System.out.println("Próba: " + proba);
            proba++;
        }

        // Jak stworzyć pętlę while?
        // 1. Zacznij od słówka kluczowego "while".
        // 2. Następnie otwórz zwykły nawias. Teraz musisz podać w nim warunek dla którego pętla będzie działać.
        // 4. Następnie, zamknij nawias oraz otwórz klamry a w nich napisz kod, który ma wykonać się w pętli przy każdym okrążeniu.





        // ---------------------------------------------------------------------------------------------------------------------------
        // ---------------------------------------------------- PĘTLA DO-WHILE -------------------------------------------------------

        // Kolejna pętla na którą zerkniemy to pętla "do-while".

        // Przykładowa pętla "do-while"

//        do
//        {
//
//        }
//        while (true);

        // Przykład 2
        int probaKontaktuZUzytkownikiem = 1;
        do
        {
            // Zrób coś minimum raz a następnie sprawdź warunek. Jeśli warunek jest spełniony to ponów...
            probaKontaktuZUzytkownikiem++;
        }
        while (probaKontaktuZUzytkownikiem < 4);

        // Jak stworzyć pętlę do-while?
        // 1. Zacznij od słówka kluczowego "do".
        // 2. Następnie, otwórz klamry i wpisz w nich kod, który ma się wykonać minimum raz. (Kolejne razy wykonają się kiedy warunek zostanie spełniony)
        // 3. Następnie, za klamrą napisz słówko "while".
        // 2. Następnie otwórz zwykły nawias. Teraz musisz podać w nim warunek dla którego pętla będzie działać.
        // 4. Następnie, zamknij nawias oraz otwórz klamry a w nich napisz kod, który ma wykonać się w pętli przy każdym okrążeniu.





        // ---------------------------------------------------------------------------------------------------------------------------
        // --------------------------------------------- Przerywanie działania pętli -------------------------------------------------

        // Czasem może się zdarzy sytuacja, w której chcielibyśmy przerwać działanie naszej pętli, np. kiedy znajdziemy element, który nas interesuje
        // lub jakiś cel zostanie spełniony.
        // Możemy tego dokonać używając słówka kluczowego "break".

        // Przykład na pętli for-each
        String[] mojArray3 = {"Krzysiek", "Adam", "Wojtek"};
        boolean czyAdamIstniejeWKolekcji = false;
        for (String imie : mojArray3)
        {
            if (imie.equals("Adam"))
            {
                czyAdamIstniejeWKolekcji = true;
                break;
            }
        }

        // Co się tutaj dzieje?
        // 1. Szukamy



        // ---------------------------------------------------------------------------------------------------------------------------
        // -------------------------------------------------------- Zadania ----------------------------------------------------------


        // 1. Dany jest array posiadający integery.
        // Przeiteruj przez array wypisując w konsoli jego każdy element. Użyj do tego pętli for-i.
        int[] integery = {9, 3, 6, 21, 15};



        // 2. Dany jest array posiadający Stringi.
        // Przeiteruj przez array wypisując w konsoli jego każdy element. Użyj do tego pętli for-each.
        String[] owoce = {"Jabłko", "Pomarańcza", "Gruszka", "Arbuz", "Borówka"};



        // 3. Utwórz pusty array przechowujący integery o wielkości 10 miejsc
        // Wypełnij miejsca w swoim arrayu kolejnymi liczbami od 1 do 10 używając while



        // 4. Dany jest array z nazwiskami.
        // Przeiteruj przez array i wypisz w konsoli tylko te nazwiska, które zaczynają się na literę "K".
        String[] nazwiska = {"Poniatowski", "Kowalski", "Matkowski", "Opolski", "Dąb", "Tomicki", "Kaczmarczyk", "Bukowiak"};


        // 5. Dany jest array z liczbami.
        // Sprawdź czy w array'u znajduje się liczba 4. Jeśli tak, wypisz w konsoli "Liczba cztery znajduje się w array'u",
        // jeśli nie, wypisz "Nie odnaleziono liczby 4 w arrayu".
        int[] liczby = {7, 2, 6, 10, 23, 4, 53, 64, 123};



        // 6. Dane są dwa array'e.
        // Sprawdź czy posiadają tą samą zawartość przy pomocy pętli.
        int[] array1 = {80, 14, 32, 42, 13};
        int[] array2 = {14, 32, 80, 13, 42};


        // 7. Dany jest array z kodami pocztowymi.
        // Przeiteruj przez array, sprawdzając długość kodu pocztowego.
        // Jeśli trafisz na kod pocztowy dłuższy niż 5 znaków:
        //  a. Pokaż komunikat "Znaleziono błędny kod pocztowy: X"
        //  b. Zatrzymaj pętlę przy pomocy słówka break;
        String[] kodyPocztowe = {"26340", "15592", "39231", "31231234", "99321", "93932"};



        // 8. Dany jest string "kayak".
        // Stwórz mechanizm, który sprawdzi czy dane słowo jest palindromem. (Palindrom = słowo czytane normalnie i od tyłu daje to samo słowo)



        // Dla chętnych:
        // Utwórz mechanizm sortowania Bubble Stort aby posortować array'a
        // Bubble Sort polega na prostym zmienianiu pozycji elementów w kolekcji aż będzie ona posortowana.



        // Dla chętnych: Choinka...



    }
}
