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
    void convert9ToIX() throws Exception {
        assertEquals("IX", arabicToRoman(9));
    }

    @Test
    void convert10ToIX() throws Exception {
        assertEquals("X", arabicToRoman(10));
    }

    @Test
    void convert13ToXIII() throws Exception {
        assertEquals("XIII", arabicToRoman(13));
    }

    @Test
    void convert19ToXIX() throws Exception {
        assertEquals("XIX", arabicToRoman(19));
    }

    @Test
    void convert39ToXXXIX() throws Exception {
        assertEquals("XXXIX", arabicToRoman(39));
    }

    @Test
    void convert49ToXLIX() throws Exception {
        assertEquals("XLIX", arabicToRoman(49));
    }

    @Test
    void convert55ToLV() throws Exception {
        assertEquals("LV", arabicToRoman(55));
    }

    @Test
    void convert1476ToMCDLXXVI() throws Exception {
        assertEquals("MCDLXXVI", arabicToRoman(1476));
    }

    @Test
    void convert3999ToMMMCMXCIX() throws Exception {
        assertEquals("MMMCMXCIX", arabicToRoman(3999));
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

    @Test
    void errorConvertingHigherOrEquals4000(){
        Exception ex =  assertThrows(Exception.class, ()-> arabicToRoman(4000));
        assertEquals("El número debe ser menor que 4000", ex.getMessage());
    }
}
