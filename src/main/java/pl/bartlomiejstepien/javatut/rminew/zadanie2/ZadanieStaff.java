package pl.bartlomiejstepien.javatut.rminew.zadanie2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class ZadanieStaff
{
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException
    {
        Staff staff = (Staff)Naming.lookup("Pracownicy");
        String wynik = staff.status();
        System.out.println(wynik);
    }

    private static class StaffImpl implements Staff
    {
        @Override
        public String status() throws RemoteException
        {
            return "Wynik";
        }
    }

    private interface Staff extends Remote
    {
        String status() throws RemoteException;
    }
}
