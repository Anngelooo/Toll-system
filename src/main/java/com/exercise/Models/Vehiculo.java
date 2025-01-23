package com.exercise.Models;

public class Vehiculo {

    private String placa;
    private String tipo;
    private int numeroEjes;

    public Vehiculo(String placa, String tipo, int numeroEjes) {
        this.placa = placa;
        this.tipo = tipo;
        this.numeroEjes = numeroEjes;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numeroEjes=" + numeroEjes +
                '}';
    }
}
