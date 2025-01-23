package com.exercise.Controller;

import com.exercise.Models.EstacionPeaje;
import com.exercise.Models.Vehiculo;

public class PeajeController {

    private EstacionPeaje estacionPeaje;

    public PeajeController(EstacionPeaje estacionPeaje) {
        this.estacionPeaje = estacionPeaje;
    }

    public double calcularPeaje(Vehiculo vehiculo) {
        switch (vehiculo.getTipo().toLowerCase()) {
            case "coche":
                return 100.0;
            case "moto":
                return 50.0;
            case "camion":
                return vehiculo.getNumeroEjes() * 50.0;
            default:
                return 0.0;
        }
    }

    public void procesarVehiculo(Vehiculo vehiculo) {
        double peaje = calcularPeaje(vehiculo);
        estacionPeaje.registrarVehiculo(vehiculo, peaje);
    }
}
