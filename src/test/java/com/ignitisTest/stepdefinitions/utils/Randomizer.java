package com.ignitisTest.stepdefinitions.utils;
import java.util.Random;

public class Randomizer {
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        while (length > 0) {
            result.append(characters.charAt(random.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }
    public static String generateRandomNumberString(int length) {
        String numbers = "0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        while (length > 0) {
            result.append(numbers.charAt(random.nextInt(numbers.length())));
            length--;
        }
        return result.toString();
    }

}
