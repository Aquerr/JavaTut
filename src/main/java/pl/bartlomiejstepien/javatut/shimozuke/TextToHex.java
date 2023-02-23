package pl.bartlomiejstepien.javatut.shimozuke;

public class TextToHex implements Runnable
{
    private final FileWriter fileWriter;
    private final String text;

    private boolean isHexWritten = false;

    public TextToHex(String text, FileWriter fileWriter)
    {
        this.text = text;
        this.fileWriter = fileWriter;
    }

    @Override
    public void run()
    {
        // Do something...
        synchronized (fileWriter)
        {
            System.out.println(this.getClass().getName() + ":" + Thread.currentThread().getName() + ": Doing something with text: " + text);
            fileWriter.writeToFile(text);
            isHexWritten = true;
            fileWriter.notify();
        }
    }

    public boolean isHexWritten()
    {
        return isHexWritten;
    }
}
