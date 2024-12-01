package pl.bartlomiejstepien.javatut.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Podpis cyfrowy = Digital signature
 *
 * 1. Podpisanie wartości, wymaga:
 *  - wartości/danych
 *  - klucza publicznego
 *
 *
 * 2. Weryfikacja podpisanych wartości, wymaga:
 *  - wartości/danych
 *  - podpisu dla każdej wartości
 *  - klucza prywatnego
 */
public class MainDigitalSignature
{
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, InvalidAlgorithmParameterException
    {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));

        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        Signature signature = Signature.getInstance("SHA256WITHECDSA");
        signature.initSign(privateKey);

        List<String> myValues = List.of("IBAN", "userid", "userid2", "123.00PLN");

        Map<String, String> signedValues = new LinkedHashMap<>();
        for (String value : myValues)
        {
            signature.update(value.getBytes());
            String signedValue = Base64.getEncoder().encodeToString(signature.sign());
            signedValues.put(value, signedValue);
        }
        System.out.println("Encoded");
        System.out.println("My Values: " + myValues);
        System.out.println("Signed values:" + signedValues);

        System.out.println("=====================");
        System.out.println("Verification");

        signature.initVerify(publicKey);
        List<Boolean> verifiedValues = new ArrayList<>();
        for (Map.Entry<String, String> signedValue : signedValues.entrySet())
        {
            signature.update(signedValue.getKey().getBytes());
            verifiedValues.add(signature.verify(Base64.getDecoder().decode(signedValue.getValue())));
        }

        System.out.println("Verified values: " + Arrays.toString(verifiedValues.toArray()));
    }
}
