package pl.bartlomiejstepien.javatut.interfejsy;

public class InterfejsyMain
{
    public static void main(String[] args)
    {
        int mojaZmienna = MojInterfejs.TEST;
        int mojaZmienna1 = MojaKlasa.TEST;

        MojaKlasa mojObiekt = new MojaKlasa();
        int mojaZmienna3 = mojObiekt.TEST;
    }
}
