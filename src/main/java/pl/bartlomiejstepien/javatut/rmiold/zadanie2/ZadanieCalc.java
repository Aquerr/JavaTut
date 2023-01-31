package pl.bartlomiejstepien.javatut.rmiold.zadanie2;

public class ZadanieCalc
{
    static class Calc
    {
        public double x = 1;
    }

    static class CalcThread extends Thread
    {
        private Calc calc;

        public CalcThread(Calc c)
        {
            calc = c;
        }

        public void run()
        {
            double a = 3;
            double b = 4;

            calc.x = a * calc.x + b;
        }
    }
}
