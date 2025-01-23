package com.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.exercise.Controller.PeajeController;
import com.exercise.Models.EstacionPeaje;
import com.exercise.Models.Vehiculo;

public class PeajeControllerTest {

     @Test
    void testCalcularPeajeCoche() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Norte", "Ciudad A");
        PeajeController controller = new PeajeController(estacion);

        Vehiculo coche = new Vehiculo("ABC123", "coche", 0);
        double peaje = controller.calcularPeaje(coche);
        assertEquals(100, peaje);
    }

    @Test
    void testCalcularPeajeMoto() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Norte", "Ciudad A");
        PeajeController controller = new PeajeController(estacion);

        Vehiculo moto = new Vehiculo("XYZ789", "moto", 0);
        double peaje = controller.calcularPeaje(moto);
        assertEquals(50, peaje);
    }

    @Test
    void testCalcularPeajeCamion() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Norte", "Ciudad A");
        PeajeController controller = new PeajeController(estacion);

        Vehiculo camion = new Vehiculo("DEF456", "camion", 4);
        double peaje = controller.calcularPeaje(camion);
        assertEquals(200, peaje);
    }

    @Test
    void testProcesarVehiculo() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Norte", "Ciudad A");
        PeajeController controller = new PeajeController(estacion);

        Vehiculo coche = new Vehiculo("ABC123", "coche", 0);
        controller.procesarVehiculo(coche);

        assertEquals(1, estacion.getVehiculosProcesados().size());
        assertEquals(100, estacion.getTotalPeajeRecolectado());
    }
}
