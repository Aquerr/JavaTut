package pl.bartlomiejstepien.javatut.crypto;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MainCipherSymmetricKey
{
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException
    {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);


        String myText = "Hello There!";

        byte[] encryptedBytes = cipher.doFinal(myText.getBytes());
        String base64EncryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

        System.out.println("Encrypted: " + base64EncryptedText);

        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedText = cipher.doFinal(Base64.getDecoder().decode(base64EncryptedText));
        System.out.println("Decrypted: " + new String(decryptedText));
    }
}
