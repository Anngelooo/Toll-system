package com.exercise.Models;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {

    private String nombre;
    private String ciudad;
    private double totalPeajeRecolectado;
    private List<Vehiculo> vehiculosProcesados;

    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalPeajeRecolectado = 0;
        this.vehiculosProcesados = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo, double peaje) {
        vehiculosProcesados.add(vehiculo);
        totalPeajeRecolectado += peaje;
    }

    public List<Vehiculo> getVehiculosProcesados() {
        return vehiculosProcesados;
    }

    public double getTotalPeajeRecolectado() {
        return totalPeajeRecolectado;
    }

    @Override
    public String toString() {
        return "EstacionPeaje{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", totalPeajeRecolectado=" + totalPeajeRecolectado +
                '}';
    }
}
