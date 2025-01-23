package com.exercise;

import com.exercise.Controller.PeajeController;
import com.exercise.Models.EstacionPeaje;
import com.exercise.Models.Vehiculo;
import com.exercise.View.PeajeView;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Crear modelo, vista y controlador
        EstacionPeaje estacion = new EstacionPeaje("Peaje Central", "Ciudad Central");
        PeajeController controller = new PeajeController(estacion);
        PeajeView vista = new PeajeView();

        boolean continuar = true;

        while (continuar) {
            // Solicitar datos del vehículo
            String placa = vista.solicitarDato("Ingrese la placa del vehículo: ");
            String tipo = vista.solicitarDato("Ingrese el tipo de vehículo (coche, moto, camion): ");
            int numeroEjes = tipo.equalsIgnoreCase("camion") ?
                    Integer.parseInt(vista.solicitarDato("Ingrese el número de ejes: ")) : 0;

            // Crear vehículo y procesarlo
            Vehiculo vehiculo = new Vehiculo(placa, tipo, numeroEjes);
            controller.procesarVehiculo(vehiculo);

            // Consultar si desea continuar
            String opcion = vista.solicitarDato("¿Desea procesar otro vehículo? (s/n): ");
            continuar = opcion.equalsIgnoreCase("s");
        }

        // Mostrar resultados finales
        vista.mostrarVehiculosYTotal(estacion);
    }
}
