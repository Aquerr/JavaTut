package pl.bartlomiejstepien.javatut.rminew.zadanie1;

public class ZadanieCommon
{

    private static class Common
    {
        public int sum = 0;

        public synchronized void setSum(int sum)
        {
            this.sum = sum;
        }
    }


    private static class WorkerThread extends Thread
    {
        private Common ct;

        private int calcResult = 2;

        public WorkerThread(Common c) {
            ct = c;
        }
        public void run()
        {
            // Zmniejsz wartość pola sum w zmiennej ct o zmienną calcResult
            ct.setSum(ct.sum - calcResult);
        }
    }
}
