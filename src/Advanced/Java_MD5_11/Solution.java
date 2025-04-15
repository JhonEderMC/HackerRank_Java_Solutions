package Advanced.Java_MD5_11;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    public static final String MD5 = "MD5";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringToMD5 = sc.nextLine();
        try {
            String md5 = converterToMd5(stringToMD5);
            System.out.println(md5);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
    }

    public static String converterToMd5(String stringToMd5) throws NoSuchAlgorithmException {
        MessageDigest md =  MessageDigest.getInstance(MD5);
        md.update(stringToMd5.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }

}
