package pl.bartlomiejstepien.javatut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MechanizmSprawdzaniaNumeruTelefonuTest
{
    private MechanizmSprawdzaniaNumeruTelefonu mechanizmSprawdzaniaNumeruTelefonu = new MechanizmSprawdzaniaNumeruTelefonu();

    @Test
    void numerTelefonuJestPoprawny()
    {
        boolean czyPoprawny = mechanizmSprawdzaniaNumeruTelefonu.czyToNumerTelefonu("999999111");
        assertTrue(czyPoprawny);
    }

    @Test
    void numerTelefonuJestNiepoprawny()
    {
        boolean czyPoprawny = mechanizmSprawdzaniaNumeruTelefonu.czyToNumerTelefonu("03821093821098302198");
        assertFalse(czyPoprawny);
    }

    @Test
    void numerTelefonuJestNiepoprawny1()
    {
        boolean czyPoprawny = mechanizmSprawdzaniaNumeruTelefonu.czyToNumerTelefonu("9");
        assertFalse(czyPoprawny);
    }
}