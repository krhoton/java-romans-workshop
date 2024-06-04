package org.example;

public class Converter {

    public static String arabicToRoman(int num) throws Exception {
        StringBuilder result = new StringBuilder();
        if(num<=0){
            throw new Exception("El número debe ser mayor que 0");
        }
        if(num >= 50 && num <=59){
            result.append("L");
            num -= 50;
        }

        if(num >= 40 && num <=49){
            result.append("XL");
            num -= 40;
        }

        while (num >= 10 && num <= 39) {
            result.append("X");
            num -= 10;
        }
        if(num == 9) {
            result.append("IX");
            num -= 9;
        }
        if(num >= 5 && num <= 8) {
            result.append("V");
            num -= 5;
        }
        else if(num == 4){
            result.append("IV");
            num -= 4;
        }

        for (int i = 1; i <= num; i++) {
            result.append("I");
        }

        return result.toString();
    }
}