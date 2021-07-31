package br.jbit.vehicleAccessControlApp.Domain.Utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashString {
    private static byte[] hash;

    public static String getHashString(String any) throws NoSuchAlgorithmException {
        hash = MessageDigest.getInstance("SHA-256").digest(any.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
