package pl.bartlomiejstepien.javatut.shimozuke;

public class TextToUpperCase implements Runnable
{
    private final FileWriter fileWriter;
    private final String text;
    private final TextToHex textToHex;

    public TextToUpperCase(String text, FileWriter fileWriter, TextToHex textToHex)
    {
        this.text = text;
        this.fileWriter = fileWriter;
        this.textToHex = textToHex;
    }

    @Override
    public void run()
    {
        synchronized (fileWriter)
        {
            if (!textToHex.isHexWritten())
            {
                try
                {
                    fileWriter.wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }

        // Do something...
        System.out.println(this.getClass().getName() + ":" + Thread.currentThread().getName() + ": Doing something with text: " + text);
        fileWriter.writeToFile(text);
    }
}
