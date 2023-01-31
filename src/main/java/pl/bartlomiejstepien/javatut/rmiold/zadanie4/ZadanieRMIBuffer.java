package pl.bartlomiejstepien.javatut.rmiold.zadanie4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public class ZadanieRMIBuffer
{
    private interface Buffer extends Remote
    {
        int size() throws RemoteException;

        String data(boolean value) throws RemoteException;
    }
}
