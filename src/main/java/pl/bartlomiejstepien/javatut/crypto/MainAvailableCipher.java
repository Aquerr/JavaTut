package pl.bartlomiejstepien.javatut.crypto;

import java.security.Security;
import java.util.List;

public class MainAvailableCipher
{
    private static final List<String> SERVICES = List.of(
            "Cipher", "Signature", "MessageDigest", "Mac", "KeyStore", "KeyPairGenerator"
    );

    public static void main(String[] args)
    {
        // Print available ciphers
        printAvailableAlgorithmsForAllServices();
    }

    private static void printAvailableAlgorithmsForAllServices()
    {
        SERVICES.forEach(MainAvailableCipher::printAvailableAlgorithms);
    }

    private static void printAvailableAlgorithms(String serviceName)
    {
        System.out.printf("Available algorithms for %s:\n", serviceName);
        Security.getAlgorithms(serviceName)
                .forEach(System.out::println);
        System.out.println("=============");
    }
}
