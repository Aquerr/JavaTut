package pl.bartlomiejstepien.javatut;

import java.util.regex.Pattern;

public class MechanizmSprawdzaniaNumeruTelefonu
{
    private static final Pattern pattern = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{3}");

    public boolean czyToNumerTelefonu(String numerTelefonu)
    {
        return pattern.matcher(numerTelefonu).matches();
    }
}
