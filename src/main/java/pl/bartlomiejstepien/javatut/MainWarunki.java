package pl.bartlomiejstepien.javatut;

public class MainWarunki
{
    public static void main(String[] args)
    {
        // Nauka Javy
        // Nauczymy się dzisiaj czym w programowaniu jest boolean.

        // boolean jest "typem danych", przechowujący wartość true lub false (prawda lub fałsz).
        // Ciekawostka: Głęboko w kodzie maszyny te wartości są przełożone na liczby, a mianowicie na 1 (true) i 0 (false).

        // Typ danych "boolean" możemy wykorzystać do utworzenia zmiennych tego typu lub warunków.

        // Zmienną typu boolean tworzymy w następujący sposób:
        // boolean mojaZmienna = true;
        // boolean mojaDrugaZmienna = false;

        // Może już zauważasz przy jakich problemach/zadaniach można byłoby wykorzystać boolean.
        // Dla przykładu:
        // 1. Przy pracy z elektroniką w telewizorach,
        // możemy stworzyć sobie zmienną o nazwie "czyTelewizorJestWlaczony" i przypisać do niej wartość "true".
        // Będzie to oznaczało, że telewizor jest włączony.
        // 2. M przypadku pracy z paszportami,
        // możemy stworzyć sobie zmienną "osobaPosiadaPaszport" i przypisać do niej wartość "false".
        // Będzie to oznaczało, że jakaś osoba nie posiada paszportu.

        // Oczywiście są to tylko proste przykłady, które w realnym świecie programowania mogą wyglądać nieco inaczej.

        // Przypomnienie z poprzedniej lekcji:
        // Aby wpisać coś do konsoli, użyj funkcji System.out.println(twojaZmiennaTutaj);

        // Zadanie 1.
        // Stwórz zmienną typu "boolean" i przypisz do niej wartość "true".
        // Następnie wypisz zmienną w konsoli przy pomocy System.out.println.


        // Zadanie 2.
        // Jesteś właścicielem psa, który często lubi wariować. Kiedy widzi błoto, od razu chce do niego wskoczyć.
        // Stwórz zmienną przechowującą informację o tym, czy pies jest brudny.
        // Wypisz w konsoli zdanie o treści "Czy pies jest brudny? X". W miejsce X wypisz wartość ze zmiennej.





        // Nauczymy się dzisiaj, czym w programowaniu są "warunki" oraz jak ich używać.

        // Warunek (po angielsku "condition") jest to "określone wymaganie" lub "określona sytuacja", która musi zostać
        // spełniona, aby można było coś zrobić.
        // Warunek możemy sobie wyobrazić na przykładzie skrzyżowania przy granicy, na którym mamy dwie drogi.
        // Aby wybrać drogę w lewo, prowadzącą przez granicę, musimy mieć paszport
        // natomiast aby iść drogą w prawo, nie potrzebujemy żadnego dokumentu.
        // Sprawdzanie warunku zawsze da nam jedną z dwóch odpowiedzi "prawda" lub "fałsz".
        // Np. Osoba przekraczająca granicę ma paszport? --> tak (prawda) lub nie (fałsz).

        // Wywnioskować z powyższej definicji możemy:
        // 1. Warunek jest "blokadą", która otworzy nam się tylko, kiedy jakiś konkretny wymóg zostanie spełniony.
        // 2. Warunek jest sytuacją, w której robimy albo jedno, albo drugie. Jeśli spełniliśmy wymóg, możemy przejść daną ścieżką,
        //      jeśli nie, to musimy wybrać drugą ścieżkę.
        // 3. Warunek to zawsze jedna wartość "prawda" lub "fałsz".
        // 4. Warunek zwraca nam wartość typu boolean. (Gdyż boolean to true lub false)

        // W Javie warunki tworzone są przy pomocy prostego słówka "if" czyli po polsku "jeśli".

        // Wyobraźmy sobie teraz, jak mógłby wyglądać prosty warunek dotyczący pełnoletności podczas zakupu alkoholu w sklepie.
        // Mówiąc to prostym językiem, powiedzielibyśmy po polsku:
        // Jeśli wiek osoby jest większy niż 18 lat to pozwalamy na zakup alkoholu

        // Po angielsku powiedzielibyśmy:
        // If person's age is more than 18 years old then allow purchase of alcohol

        // I mniej więcej tak właśnie warunki powinny też brzmieć w kodzie. Zwróć uwagę na początek zdania po angielsku.
        // Jest tam użyte słówko "if". Stąd też warunki w kodzie zaczynamy takim właśnie słówkiem.

        // No dobrze, spójrzmy teraz, jak taki warunek mógłby wyglądać w kodzie Javy:

        // Przyjmijmy że zmienna "personAge" przechowuje wiek osoby.
        // if (personAge >= 18)
        // {
        //      allowPurchaseOfAlcolhol();
        // }
        // else
        // {
        //      dontAllowPurchaseOfAlcohol();
        // }

        // Lub przyjmując, że mamy obiekt i możemy z niego wyciągnąć wiek osoby:

        // if (person.getAge() >= 18)
        // {
        //      allowPurchaseOfAlcohol();
        // }
        // else
        // {
        //      dontAllowPurchaseOfAlcohol();
        // }

        // Co się tutaj dzieje?
        // Używamy słówka "if" do utworzenia "warunku". Logikę warunku piszemy wewnątrz nawiasu po słówku "if".

        // Warunekiem jest wszystko, co da nam odpowiedź "prawda" lub "fałsz" czyli po angielsku "true", lub "false".
        // W powyższym przykładzie w warunku sprawdzamy, czy zmienna "personAge" posiada warość większą lub równą niż 18.
        // Jeśli warunek ten zostanie spełniony (czyli zmienna "personAge" faktycznie będzie miała wartość większą niż 18)
        // to "wejdziemy" wtedy do tej pierwszej ścieżki (do pierwszych klamrów {}) i wykonamy operacje tam opisane, czyli
        // w naszym przypadku "allowPurchaseOfAlcohol()" czyli coś, co zezwoli osobie na kupno alkoholu.
        // W przeciwnym razie, jeśli wiek osoby będzie mniejszy niż 18 lat, wejdziemy do ścieżki "else", gdzie zabronimy kupna alkoholu.

        // Dostępne warunki arytmetyczne w Javie:
        // ==    Równy
        // !=    Nierówny
        // <     Mniejszy
        // >     Większy
        // <=    Mniejszy-równy
        // >=    Większy-równy

        // Warunki możemy również łączyć przy pomocy:
        // &&      i
        // ||      lub

        // Przykład:
        // Wiek jest większy bądź równy 18 i mniejszy, bądź równy 40
        // if (wiek >= 18 && wiek <= 40)

        // W warunkach możemy również sprawdzać litery, zdania, tekst i wszystko inne, o co możemy zapytać w realnym świecie.

        // Np. Do sprawdzenia, czy jedno słowo równe jest innemu, możemy użyć funkcji "equals".
//         String mojeSlowo = "siema";
//         String mojeDrugieSlowo = "siema";
//         if (mojeSlowo.equals(mojeDrugieSlowo))
//         {
//              Zrób coś, jeśli pierwsze słowo równe jest drugiemu
//         }

        // Zadanie 1.
        // Stwórz zmienną typu integer do przechowania wieku osoby i przypisz do niej wartość 20.
        // Stwórz warunek, w którym sprawdzisz, czy zmienna z wiekiem osoby jest większa lub równa 18 lat.
        // Jeśli tak to wypisz w konsoli zdanie "Jesteś pełnoletni/a!"
        // Jeśli nie to wypisz w konsoli zdanie "Nie jesteś jeszcze pełnoletni/a!"


        // Zadanie 2.
        // Podany jest wiek dziadka i babci w dwóch zmiennych "wiekDziadka" i "wiekBabci".
        // Sprawdź, czy dziadek jest starszy od babci.
        // Jeśli tak to wypisz w konsoli zdanie "Dziadek jest starszy"
        // Jeśli nie to wypisz w konsoli zdanie "Babcia jest starsza"
        int wiekDziadka = 75;
        int wiekBabci = 70;

        // Zadanie 3.
        // Zosia i Wojtek idą do sklepu kupić sobie chrupki.
        // Zastanawiają się, czy starczy im pieniędzy na dwie paczki chrupek.
        // Zosia ma przy sobie 5 zł, a Wojtek ma o 2 zł mniej.
        // Jedna paczka chrupek kosztuje 5 zł.
        // Utwórz warunek, który sprawdzi, czy suma pieniędzy posiadanych przez dzieci wystarczy im do kupna dwóch paczek chrupek.
        // Jeśli tak to wypisz w konsoli zdanie "Zosia i Wojtek mogą kupić dwie paczki chrupek"
        // Jeśli nie to wypisz w konsoli zdanie "Zosia i Wojtek nie mogą kupić dwóch paczek chrupek"


        // Zadanie 4.
        // Utwórz zmienną przechowującą słowo "Programowanie"
        // Sprawdź w warunku czy zmienna ta jest równa słowu "programowanie" (słowo pisane małą literą).
        // Jeśli nie to wypisz w konsoli zdanie "słowa się nie zgadzają"
        // Jeśli tak to wypisz w konsoli zdanie "słowa się zgadzają"

    }
}
