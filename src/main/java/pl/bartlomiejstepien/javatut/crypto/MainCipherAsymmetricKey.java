package pl.bartlomiejstepien.javatut.crypto;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class MainCipherAsymmetricKey
{
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException
    {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        System.out.println("Public Key: " + Base64.getEncoder().encodeToString(publicKey.getEncoded()));
        System.out.println("Private Key: " + Base64.getEncoder().encodeToString(privateKey.getEncoded()));

        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        String myText = "Hello There!";

        byte[] encryptedBytes = cipher.doFinal(myText.getBytes());
        String base64EncryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

        System.out.println("Encrypted: " + base64EncryptedText);

        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedText = cipher.doFinal(Base64.getDecoder().decode(base64EncryptedText));
        System.out.println("Decrypted: " + new String(decryptedText));
    }
}
