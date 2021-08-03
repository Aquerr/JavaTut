package pl.bartlomiejstepien.javatut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest
{
    @Test
    void sumaZwrociWynikDodawania()
    {
        Kalkulator kalkulator = new Kalkulator();
        int wynik = kalkulator.suma(1, 2);

        assertEquals(3, wynik);
    }

    @Test
    void odejmowanieZwrociWynikOdejmowania()
    {
        Kalkulator kalkulator = new Kalkulator();
        int wynik = kalkulator.odejmowanie(2,1);

        assertEquals(1,wynik);
    }

    @Test
    void dzielenieZwrociBladPodczasDzieleniaPrzezZero()
    {
        Kalkulator kalkulator = new Kalkulator();

        assertThrows(ArithmeticException.class, () -> kalkulator.dzielenie(5, 0));
    }
}
