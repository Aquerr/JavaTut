package pl.bartlomiejstepien.javatut.rmiold.zadanie1;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ZadanieStaff
{
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException
    {
        StaffInterface staff = new Staff();
        UnicastRemoteObject.exportObject(staff, 0);
        LocateRegistry.createRegistry(1099);
        Naming.rebind("pracownicy", staff);
    }

    private static class Staff implements StaffInterface
    {
    }

    private interface StaffInterface extends Remote
    {

    }
}
