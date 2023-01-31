package pl.bartlomiejstepien.javatut.thread;

public class BufferMain
{
    private static class Buffer
    {
        private int value = 0;
        private boolean isBeingUsed;

        public synchronized void setValue(int value)
        {
            while (isBeingUsed)
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

            this.value = value;
            notifyAll();
            this.isBeingUsed = false;
        }
    }

    private static class Worker extends Thread
    {
        private final Buffer buffer;

        public Worker(Buffer buffer)
        {
            this.buffer = buffer;
        }

        @Override
        public void run()
        {
            int number = (int)(2000 * Math.random());
            if (number > 1000)
            {
                this.buffer.setValue(number);
                System.out.println(this.buffer.value);
            }
        }
    }

    public static void main(String[] args)
    {
        Buffer buffer = new Buffer();
        Worker worker = new Worker(buffer);
        worker.setDaemon(false);
        worker.start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
        new Worker(buffer).start();
    }
}
