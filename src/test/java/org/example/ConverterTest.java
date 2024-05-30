package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Converter.arabicToRoman;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {

    @Test
    void convert1ToI() {
        assertEquals("I", arabicToRoman(1));
    }

    @Test
    void convert3ToIII() {
        assertEquals("III", arabicToRoman(3));
    }

    @Test
    void convert4ToIV() {
        assertEquals("IV", arabicToRoman(4));
    }

    @Test
    void convert5ToV() {
        assertEquals("V", arabicToRoman(5));
    }

    @Test
    void convert6ToVI() {
        assertEquals("VI", arabicToRoman(6));
    }

}
