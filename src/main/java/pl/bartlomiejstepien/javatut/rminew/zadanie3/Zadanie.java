package pl.bartlomiejstepien.javatut.rminew.zadanie3;

public class Zadanie
{
    class Buffer
    {
        public int value = 0;
        public boolean isAvailable = true;
    }

    class Worker extends Thread
    {
        private Buffer buffer;

        public Worker(Buffer b)
        {
            buffer = b;
        }

        public void run()
        {
            int value = (int)(Math.random() * 100);

            synchronized (buffer)
            {
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

                buffer.isAvailable = false;
                buffer.value = value;
                System.out.println(buffer.value);
                buffer.isAvailable = true;
                notifyAll();
            }

            // wątek ma zaczekać aż inny wątek ustawi pole value w zmiennej buffer,
            // następnie wartość tego pola należy wypisać na standardowe wyjście
            // - należy skorzystać z mechanizmu powiadomień
        }
    }
}
