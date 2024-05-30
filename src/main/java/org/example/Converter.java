package org.example;

public class Converter {

    public static String arabicToRoman(int num) {
        StringBuilder result = new StringBuilder();

        if(num >= 5 && num <= 8) {
            result.append("V");
            num -= 5;
        }
        else if(num == 4){
            return "IV";
        }

        for (int i = 1; i <= num; i++) {
            result.append("I");
        }

        return result.toString();
    }
}
