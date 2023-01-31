package pl.bartlomiejstepien.javatut;

public class MainZmienne
{

    public static void main(String[] args) {
        // Nauka Javy
        // Nauczymy się teraz jak tworzyć zmienne, jak przechowywać w nich wartości i jak ich używać.
        // Zmienna = wyraz, który przechowuje w sobie jakąś wartość

        // Uwaga: Nie można tworzyć dwóch zmiennych o tej samej nazwie.

        // Deklaracja i przypisanie wartości do "zmiennej"
        // Przykłady:
        // 1. int x = 10;
        // 2. String nazwisko = "Górski";

        // Wyjaśnienie do pkt 1:
        // int x = 10;
        // Co się tutaj dzieje?
        // Po lewej stronie znaku "równa się" piszemy "typ" zmiennej oraz jej nazwę, czyli w naszym przypadku "int x".
        // "int" oznacza typ zmiennej, która przechowuje liczby całkowite.
        // Po prawej stronie znaku "równa się" piszemy liczbę 10. Zmienna x będzie od teraz przechowywała wartość, którą jest 10.
        // Liczba 10 jest liczbą całkowitą. W programowaniu jest ona znana jako "integer" czyli liczba całkowita pomiędzy mniej więcej -2.500.000 a 2.500.000
        // Każde wyrażenie w Javie kończymy ; (średnikiem), stąd też na końcu linii po 10 jest średnik.

        // Wyjaśnienie do pkt 2:
        // String nazwisko = "Górski";
        // Co się tutaj dzieje?
        // Po lewej stronie znaku "równa się" piszemy "typ" zmiennej oraz jej nazwę (w naszym przypadku => String nazwisko).
        // Zmienna ta będzie przechowywała przypisaną do niej wartość, którą napiszemy po prawej stronie znaku "równa się".
        // Po prawej stronie znaku "równa się" piszemy więc "Górski" w cudzysłowie.
        // Słowo "Górski" jest tak zwanym "ciągniem znaków". Ciąg znaków w programowaniu znany jest jako "String".
        // Taki "typ danych" (słowo lub zdanie) piszemy zawsze w cudzysłowie.
        // Każde wyrażenie w Javie kończymy ; (średnikiem), stąd też na końcu linii po "Górski" jest średnik.

        // Jak wypisać coś na ekranie konsoli?
        // Aby wypisać coś na ekranie konsoli, użyj funkcji System.out.println
        // Przykład:
        // System.out.println(twojaZmienna)
        // lub
        // System.out.println("Twoje zdanie lub ciąg znaków")

        // Zadanie 1:
        // Stwórz dwie zmienne i przypisz do nich dowolne liczby całkowite.
        // Dodaj liczby do siebie i przechowaj wynik w kolejnej zmiennej.
        // Wypisz wynik za pomocą funkcji System.out.println

        // Zadanie 2:
        // Stwórz zmienną i przypisz do niej zdanie "Witaj świecie!"
        // Wypisz ją przy pomocy funckji System.out.println

        // Zadanie 3:
        // Stwórz dwie zmienne. Jedna z liczbą 50, a druga z liczbą 10
        // Podziel zmienną z liczbą 50 przez zmienną z liczbą 10
        // Następnie odejmij od wyniku liczbę 5 i wypisz wynik funkcją System.out.println

    }
}
