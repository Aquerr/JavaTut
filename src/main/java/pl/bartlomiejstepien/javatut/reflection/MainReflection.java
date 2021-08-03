package pl.bartlomiejstepien.javatut.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection
{
    public static void main(String[] args)
    {
        Player antek = new Player("Antek", 10);

        try
        {
            Field field = Player.class.getDeclaredField("name");
            field.setAccessible(true);
            String value = (String) field.get(antek);
            field.setAccessible(false);
            System.out.println(value);

            Method method = Player.class.getDeclaredMethod("przywitajSie", null);

            method.setAccessible(true);
            method.invoke(antek);
            method.setAccessible(false);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | NoSuchFieldException e)
        {
            e.printStackTrace();
        }
    }
}
