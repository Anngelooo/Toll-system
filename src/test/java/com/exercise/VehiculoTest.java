package com.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.exercise.Models.Vehiculo;

public class VehiculoTest {

    @Test
    void testVehiculoCoche() {
        Vehiculo vehiculo = new Vehiculo("ABC123", "coche", 0);
        assertEquals("ABC123", vehiculo.getPlaca());
        assertEquals("coche", vehiculo.getTipo());
        assertEquals(0, vehiculo.getNumeroEjes());
    }

    @Test
    void testVehiculoCamion() {
        Vehiculo vehiculo = new Vehiculo("XYZ789", "camion", 3);
        assertEquals("XYZ789", vehiculo.getPlaca());
        assertEquals("camion", vehiculo.getTipo());
        assertEquals(3, vehiculo.getNumeroEjes());
    }
}
