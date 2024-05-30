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

}
