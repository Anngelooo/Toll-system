package com.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.exercise.Models.EstacionPeaje;
import com.exercise.Models.Vehiculo;
import com.exercise.View.PeajeView;

public class PeajeViewTest {

     @Test
    void testMostrarVehiculosYTotal() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Norte", "Ciudad A");
        PeajeView vista = new PeajeView();

        Vehiculo coche = new Vehiculo("ABC123", "coche", 0);
        estacion.registrarVehiculo(coche, 100);

        vista.mostrarVehiculosYTotal(estacion);
        assertEquals(100, estacion.getTotalPeajeRecolectado());
    }
}
