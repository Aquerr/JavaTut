package pl.bartlomiejstepien.javatut.thread;

public class CalcThreadMain
{

    private static class Calc
    {
        public double x = 1;
    }

    private static class CalcThread extends Thread
    {
        private Calc calc;

        public CalcThread(Calc calc)
        {
            this.calc = calc;
        }

        @Override
        public void run()
        {
            double a = 3;
            double b = 2;
            synchronized (calc)
            {
                calc.x = a * calc.x + b;
                System.out.println(calc.x);
            }

            try
            {
                Thread.sleep(4000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Calc calc = new Calc();
        CalcThread calcThread = new CalcThread(calc);
        calcThread.setDaemon(false);
        calcThread.start();
        new CalcThread(calc).start();
        new CalcThread(calc).start();
        new CalcThread(calc).start();
        new CalcThread(calc).start();
        new CalcThread(calc).start();
    }
}
