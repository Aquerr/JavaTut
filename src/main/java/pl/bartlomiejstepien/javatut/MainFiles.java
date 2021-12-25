package pl.bartlomiejstepien.javatut;

public class MainFiles
{



    // Zadanie z loggerem:

    //1. Stwórz klasę o nazwie Logger.
    //2. Obiekty typu Logger powinno tworzyć się przy pomocy statycznej metody (static factory method) o nazwie "getLogger" przesyłając do niej nazwę klasy, która tworzy logger. Loggera nie powinno dać się stworzyć przy pomocy słówka "new" znajdując się w innej klasie.
    //3. Umieść w niej metody instancji o nazwach "debug", "warn", "info", "error".
    //4. Każda z metod powinna przyjmować jeden parametr typu String.
    //5. Po użyciu każdej z metod, Logger powinien wypisać do pliku "logs.txt" log/wiadomość zawierającą obecną datę oraz godzinę, typ logu (czyli [DEBUG], [INFO], [WARN] lub [ERROR]), nazwę klasy, która go użyła (podana przy utworzeniu loggera), oraz wiadomość podaną jako parametr do metody.
}
e