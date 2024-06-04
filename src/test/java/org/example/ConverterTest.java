package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Converter.arabicToRoman;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {

    @Test
    void convert1ToI() throws Exception {
        assertEquals("I", arabicToRoman(1));
    }

    @Test
    void convert3ToIII() throws Exception  {
        assertEquals("III", arabicToRoman(3));
    }

    @Test
    void convert4ToIV() throws Exception  {
        assertEquals("IV", arabicToRoman(4));
    }

    @Test
    void convert5ToV() throws Exception  {
        assertEquals("V", arabicToRoman(5));
    }

    @Test
    void convert6ToVI() throws Exception  {
        assertEquals("VI", arabicToRoman(6));
    }

    @Test
    void errorConverting0(){
        Exception ex =  assertThrows(Exception.class, ()-> arabicToRoman(0));
        assertEquals("El número debe ser mayor que 0", ex.getMessage());
    }

    @Test
    void errorConvertingNegativeNumber(){
        Exception ex =  assertThrows(Exception.class, ()-> arabicToRoman(-3));
        assertEquals("El número debe ser mayor que 0", ex.getMessage());
    }

}
