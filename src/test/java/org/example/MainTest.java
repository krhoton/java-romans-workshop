package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Main.add;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void something() {
        assertTrue(true);
    }

    @Test
    void AddTwoAndTwo() {
        assertEquals(4, add(2,2));
    }

}