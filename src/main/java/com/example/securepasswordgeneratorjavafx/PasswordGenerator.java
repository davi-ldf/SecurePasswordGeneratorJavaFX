package com.example.securepasswordgeneratorjavafx;

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?><";

    public static String generatePassword(int length) {
        SecureRandom randomNumberGenerator = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = randomNumberGenerator.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a keyboard reader scan
        System.out.println("Type your new password's length: ");
        int passwordLength = scanner.nextInt(); // Read the typed length

        if (passwordLength < 8) {
            System.out.println("Very short password! Minimum 8 characters.");
            return;
        }
        String password = generatePassword(passwordLength);
        System.out.println("Password generated: " + password);
    }
}
