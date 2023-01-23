package com.generation.firstproyect.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.firstproyect.models.Perro;

class PerroTest {
    @Test
    void testAdopcion(){
        Perro perro = new Perro();
        assertEquals(false, perro.adopcion());
    }
    @Test
    void testTruco(){
        Perro perro =  new Perro();
        assertEquals("doy la pata", perro.truco("da la pata"));
    }
}

