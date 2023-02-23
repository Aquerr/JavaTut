package pl.bartlomiejstepien.javatut.shimozuke;

public class FileWriter
{
    public synchronized void writeToFile(String text)
    {
        System.out.println(this.getClass().getName() + ":" + Thread.currentThread().getName() + ": Saving text: " + text);
    }
}
