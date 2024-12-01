package pl.bartlomiejstepien.javatut.crypto;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class MainEncryptFile
{
    public static void main(String[] args) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, IOException
    {
        Path myFilePath = Paths.get(".").resolve("my_file.txt");
        Path encryptedFilePath = Paths.get(".").resolve("my_file.txt");

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        OutputStream outputStream = Files.newOutputStream(encryptedFilePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        try(FileInputStream fileInputStream = new FileInputStream(myFilePath.toFile());
            CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher))
        {
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                cipherOutputStream.write(buffer, 0, bytesRead);
            }
        }

        System.out.println("Encryped!");

        buffer = new byte[1024];
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // Read back
        try(FileInputStream fileInputStream = new FileInputStream(encryptedFilePath.toFile());
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher))
        {
            while ((bytesRead = cipherInputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
        }

        System.out.println("==========================");
        System.out.println("Decrypted!");
        System.out.println("Content: " + new String(byteArrayOutputStream.toByteArray()));
    }
}
