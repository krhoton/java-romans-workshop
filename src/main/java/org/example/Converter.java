package org.example;

public class Converter {

    public static String arabicToRoman(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            result.append("I");
        }
        return result.toString();
    }
}
