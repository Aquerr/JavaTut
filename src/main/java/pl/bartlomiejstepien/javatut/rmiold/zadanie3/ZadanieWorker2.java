package pl.bartlomiejstepien.javatut.rmiold.zadanie3;

public class ZadanieWorker2
{
    public static void main(String[] args)
    {
        System.out.println("Start");

        Buffer buffer = new Buffer();
        Worker worker1 = new Worker(buffer);
        Worker worker2 = new Worker(buffer);
        Worker worker3 = new Worker(buffer);
        Worker worker4 = new Worker(buffer);
        worker1.setDaemon(false);
        worker2.setDaemon(false);
        worker3.setDaemon(false);
        worker4.setDaemon(false);
        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();

        try
        {
            worker3.join();
            worker4.join();
            worker1.join();
            worker2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Buffer.value = " + buffer.value);
    }

    private static class Buffer
    {
        public int value = 0;
        public boolean isAvailable = true;
    }

    private static class Worker extends Thread
    {
        private Buffer buffer;

        public Worker(Buffer b)
        {
            buffer = b;
        }

        @Override
        public void run()
        {
            int number = (int)(2000 * Math.random());
            if (number > 1000) {

                while (!buffer.isAvailable)
                {
                    try
                    {
                        wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                synchronized (buffer)
                {
                    buffer.isAvailable = false;
                    buffer.value = number;
                    buffer.notifyAll();
                    buffer.isAvailable = true;
                }
            }
        }
    }
}
