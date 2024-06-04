package org.example;

public class Converter {

    public static String arabicToRoman(int num) throws Exception {
        StringBuilder result = new StringBuilder();
        if (num <= 0) {
            throw new Exception("El número debe ser mayor que 0");
        }

        if (num >= 4000) {
            throw new Exception("El número debe ser menor que 4000");
        }

        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letras = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                num -= valores[i];
                result.append(letras[i]);
            }
        }

        return result.toString();
    }
}