/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alquilervehiculos;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author david
 */
public class VehiculoAlquilado {
    //Atributos
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate diaAlquiler;
    private LocalDate mesAlquiler;
    private LocalDate añoAlquiler;
    private int totalDiasAlquiler;
    //constructor por defecto
    public VehiculoAlquilado() {
        this.cliente = new Cliente();
        this.vehiculo = new Vehiculo();
        this.diaAlquiler = LocalDate.now();
        this.mesAlquiler = LocalDate.now();
        this.añoAlquiler = LocalDate.now();
        this.totalDiasAlquiler = 3;
    }
    //constructor parametrizado
    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    //getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(int mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAñoAlquiler() {
        return añoAlquiler;
    }

    public void setAñoAlquiler(int añoAlquiler) {
        this.añoAlquiler = añoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    

    
}
