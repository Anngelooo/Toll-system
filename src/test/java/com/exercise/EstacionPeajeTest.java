package com.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.exercise.Models.EstacionPeaje;
import com.exercise.Models.Vehiculo;

public class EstacionPeajeTest {

     @Test
    void testRegistrarVehiculo() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Norte", "Ciudad A");
        Vehiculo vehiculo = new Vehiculo("ABC123", "coche", 0);
        estacion.registrarVehiculo(vehiculo, 100);

        assertEquals(1, estacion.getVehiculosProcesados().size());
        assertEquals(100, estacion.getTotalPeajeRecolectado());
    }

    @Test
    void testTotalPeajeRecolectado() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Norte", "Ciudad A");
        estacion.registrarVehiculo(new Vehiculo("ABC123", "coche", 0), 100);
        estacion.registrarVehiculo(new Vehiculo("XYZ789", "moto", 0), 50);

        assertEquals(150, estacion.getTotalPeajeRecolectado());
    }
}
