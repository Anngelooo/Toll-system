package com.exercise.View;

import java.util.Scanner;

import com.exercise.Models.EstacionPeaje;
import com.exercise.Models.Vehiculo;

public class PeajeView {

    private Scanner scanner;

    public PeajeView() {
        this.scanner = new Scanner(System.in);
    }

    public String solicitarDato(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarVehiculosYTotal(EstacionPeaje estacionPeaje) {
        System.out.println("Vehículos procesados:");
        for (Vehiculo vehiculo : estacionPeaje.getVehiculosProcesados()) {
            System.out.println(vehiculo);
        }
        System.out.println("Total recaudado: $" + estacionPeaje.getTotalPeajeRecolectado());
    }
}
